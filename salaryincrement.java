final class SalaryIncrement {
    public static void main(String[] args) {

        double[] salaries = { 25000, 30000, 40000, 55000, 60000 };

        System.out.println("Updated Salaries after 10% Increment:");
        for (int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] + (salaries[i] * 0.10);
            System.out.println("Employee " + (i + 1) + ": " + salaries[i]);
        }
    }
}
