final class employeeID {
    public static void main(String[] args) {

        int[] employeeIds = { 101, 102, 103, 104, 105 };

        System.out.println("Employee IDs:");
        for (int i = 0; i < employeeIds.length; i++) {
            System.out.println(employeeIds[i]);
        }
        System.out.println("Total number of employees: " + employeeIds.length);
    }
}
