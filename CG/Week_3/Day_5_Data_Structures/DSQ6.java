class Process {
    int processId;
    int burstTime;
    int priority;
    int remainingTime;
    int waitingTime = 0;
    int turnAroundTime = 0;
    Process next;

    public Process(int id, int bt, int prio) {
        this.processId = id;
        this.burstTime = bt;
        this.remainingTime = bt;
        this.priority = prio;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head = null;
    void addProcess(int id, int bt, int prio) {
        Process newProcess = new Process(id, bt, prio);
        if (head == null) {
            head = newProcess;
            head.next = head;
        } else {
            Process temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newProcess;
            newProcess.next = head;
        }
    }
    void removeProcess(Process toRemove) {
        if (head == null || toRemove == null)
            return;
        if (head == toRemove && head.next == head) {
            head = null;
            return;
        }
        Process temp = head;
        Process prev = null;
        do {
            if (temp == toRemove)
                break;
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        if (temp == toRemove) {
            if (temp == head)
                head = head.next;
            prev.next = temp.next;
        }
    }
    public void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes in the queue.");
            return;
        }
        Process current = head;
        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;
        int processCount = 0;
        Process temp = head;
        do {
            processCount++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("\n--- Round Robin Execution ---");

        while (head != null) {
            if (current.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, current.remainingTime);
                time += execTime;
                current.remainingTime -= execTime;

                System.out.println("Executing P" + current.processId + " for " + execTime + " units. Remaining: " + current.remainingTime);
                if (current.remainingTime == 0) {
                    current.turnAroundTime = time;
                    current.waitingTime = current.turnAroundTime - current.burstTime;
                    totalTurnAroundTime += current.turnAroundTime;
                    totalWaitingTime += current.waitingTime;
                    System.out.println("P" + current.processId + " completed. TAT: " + current.turnAroundTime + ", WT: " + current.waitingTime);
                    Process toRemove = current;
                    current = current.next;
                    removeProcess(toRemove);

                    if (head == null) break;
                } else {
                    current = current.next;
                }
            } else {
                current = current.next;
            }
            displayQueue();
        }
        System.out.println("\nAverage Waiting Time: " + (double) totalWaitingTime / processCount);
        System.out.println("Average Turnaround Time: " + (double) totalTurnAroundTime / processCount);
    }
    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Process temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("[P" + temp.processId + ", RT: " + temp.remainingTime + "] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}
class Main5{
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();
        scheduler.addProcess(1, 10, 2);
        scheduler.addProcess(2, 5, 1);
        scheduler.addProcess(3, 8, 3);
        scheduler.addProcess(4, 6, 1);
        scheduler.displayQueue();
        scheduler.simulate(4);
    }
}