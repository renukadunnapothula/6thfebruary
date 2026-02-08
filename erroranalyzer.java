final class ErrorAnalyzer {
    public static void main(String[] args) {

        int[] errorCodes = { 404, 500, 404, 403, 500, 404 };

        int mostFrequent = errorCodes[0];
        int maxCount = 0;

        for (int i = 0; i < errorCodes.length; i++) {
            int count = 0;

            for (int j = 0; j < errorCodes.length; j++) {
                if (errorCodes[i] == errorCodes[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = errorCodes[i];
            }
        }

        System.out.println("Most Frequent Error Code: " + mostFrequent);
    }
}
