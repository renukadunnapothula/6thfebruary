final class LoginAttemptsTracker {
    public static void main(String[] args) {

        int[] attempts = { 1, 2, 4, 0, 3, 5 };

        for (int i = 0; i < attempts.length; i++) {
            if (attempts[i] > 3) {
                System.out.println("Alert! User " + (i + 1) +
                        " has failed login attempts: " + attempts[i]);
            }
        }
    }
}
