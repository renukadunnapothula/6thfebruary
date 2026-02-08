final class ServerDowntime {
    public static void main(String[] args) {

        int[] status = { 1, 0, 0, 1, 0, 0, 0, 1 };

        int total = 0;
        int current = 0;
        int longest = 0;

        for (int i = 0; i < status.length; i++) {
            if (status[i] == 0) {
                total++;
                current++;
                if (current > longest) {
                    longest = current;
                }
            } else {
                current = 0;
            }
        }

        System.out.println("Total Downtime Hours: " + total);
        System.out.println("Longest Downtime: " + longest);
    }
}
