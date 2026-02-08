final class ApiResponseTime {
    public static void main(String[] args) {

        int[] responseTimes = { 1200, 2500, 1800, 3200, 900 };

        int sum = 0;

        for (int i = 0; i < responseTimes.length; i++) {

            if (responseTimes[i] > 2000) {
                System.out.println("Slow API response: " + responseTimes[i] + " ms");
            }

            sum += responseTimes[i];
        }

        int average = sum / responseTimes.length;

        System.out.println("Average Response Time: " + average + " ms");
    }
}
