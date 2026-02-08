final class DuplicateTransaction {
    public static void main(String[] args) {

        int[] transactions = { 101, 205, 101, 309, 205 };

        System.out.println("Duplicate Transaction IDs:");

        for (int i = 0; i < transactions.length; i++) {
            for (int j = i + 1; j < transactions.length; j++) {
                if (transactions[i] == transactions[j]) {
                    System.out.println(transactions[i]);
                    break;
                }
            }
        }
    }
}
