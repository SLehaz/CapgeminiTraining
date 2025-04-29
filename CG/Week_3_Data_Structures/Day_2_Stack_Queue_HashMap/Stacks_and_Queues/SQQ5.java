class CircularTour {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int totalSurplus = 0;
        int currSurplus = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            int gain = petrol[i] - distance[i];
            totalSurplus += gain;
            currSurplus += gain;
            if (currSurplus < 0) {
                start = i + 1;
                currSurplus = 0;
            }
        }

        return totalSurplus >= 0 ? start : -1;
    }
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startPoint = findStartingPoint(petrol, distance);

        if (startPoint != -1) {
            System.out.println("Start tour at petrol pump index: " + startPoint);
        } else {
            System.out.println("No feasible starting point exists for the circular tour.");
        }
    }
}
