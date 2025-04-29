class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }

        System.out.println("Ticket booked for " + customerName + " (" + movieName + ")");
    }
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        Ticket current = head, prev = tail;
        boolean found = false;

        do {
            if (current.ticketId == ticketId) {
                found = true;
                break;
            }
            prev = current;
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("Ticket with ID " + ticketId + " not found.");
            return;
        }

        if (current == head && current == tail) {
            head = null;
            tail = null;
        } else if (current == head) {
            head = head.next;
            tail.next = head;
        } else if (current == tail) {
            tail = prev;
            tail.next = head;
        } else {
            prev.next = current.next;
        }

        System.out.println("Ticket ID " + ticketId + " removed.");
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No booked tickets.");
            return;
        }

        Ticket current = head;
        System.out.println("\n--- Booked Tickets ---");
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }
    public void searchTicket(String keyword) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(keyword) ||
                    current.movieName.equalsIgnoreCase(keyword)) {
                System.out.println("Match Found → Ticket ID: " + current.ticketId + ", Customer: " + current.customerName + ", Movie: " + current.movieName);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found for: " + keyword);
        }
    }
    public void countTickets() {
        if (head == null) {
            System.out.println("Total Booked Tickets: 0");
            return;
        }

        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total Booked Tickets: " + count);
    }
}
class Main8 {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();
        system.addTicket(101, "Alice", "Avengers", "A1", "10:00 AM");
        system.addTicket(102, "Bob", "Avengers", "A2", "10:00 AM");
        system.addTicket(103, "Charlie", "Batman", "B1", "1:00 PM");
        system.displayTickets();
        system.searchTicket("Alice");
        system.searchTicket("Batman");
        system.countTickets();
        system.removeTicket(102);
        system.displayTickets();
        system.countTickets();
    }
}