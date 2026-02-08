final class ServerLoad {
    public static void main(String[] args) {

        int[] cpuLoad = { 65, 70, 55, 80, 60, 75, 50 };

        int highest = cpuLoad[0];
        int lowest = cpuLoad[0];
        int sum = 0;

        for (int i = 0; i < cpuLoad.length; i++) {
            if (cpuLoad[i] > highest) {
                highest = cpuLoad[i];
            }
            if (cpuLoad[i] < lowest) {
                lowest = cpuLoad[i];
            }
            sum += cpuLoad[i];
        }

        double average = (double) sum / cpuLoad.length;

        System.out.println("Highest CPU Load: " + highest + "%");
        System.out.println("Lowest CPU Load: " + lowest + "%");
        System.out.println("Average CPU Load: " + average + "%");
    }
}
