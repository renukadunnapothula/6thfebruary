final class StudentMarksValidation {
    public static void main(String[] args) {

        int[] marks = { 85, 72, -5, 40, 101, 60, 30 };

        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < marks.length; i++) {

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks: " + marks[i]);
            } else if (marks[i] >= 40) {
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Pass Students: " + passCount);
        System.out.println("Fail Students: " + failCount);
    }
}
