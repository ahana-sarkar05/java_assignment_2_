class EmployeeSalary {
    private double basicSalary;

    // Getter and Setter methods
    public double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Basic salary cannot be negative.");
            return;
        }
        this.basicSalary = basicSalary;
    }

    // Method to calculate monthly tax (10% of basic salary)
    public double calculateTax() {
        return basicSalary * 0.10;
    }

    // Method to calculate monthly bonus (2% of basic salary)
    public double calculateBonus() {
        return basicSalary * 0.02;
    }

    // Method to calculate monthly traveling allowance (1.5% of basic salary)
    public double calculateTravellingAllowance() {
        return basicSalary * 0.015;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        double monthlySalary = basicSalary - calculateTax() + calculateBonus() + calculateTravellingAllowance();
        return monthlySalary * 12;
    }

    // Method to display employee salary details
    public void displaySalaryDetails() {
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Monthly Tax: " + calculateTax());
        System.out.println("Monthly Bonus: " + calculateBonus());
        System.out.println("Monthly Travelling Allowance: " + calculateTravellingAllowance());
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    public static void main(String[] args) {
        // Create an EmployeeSalary object
        EmployeeSalary employee = new EmployeeSalary();
        employee.setBasicSalary(100000); // Set the basic salary
        employee.displaySalaryDetails(); // Display the salary details
    }
}
