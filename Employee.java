class Employee {
    private String pname;
    private String designation;
    private double salary;
    private String email;

    // Getter and Setter methods
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setPname("Ankan");
        employee.setDesignation("Developer");
        employee.setSalary(5000);
        employee.setEmail("ank@ibm.com");

        System.out.println(employee.getPname() + " works as " + employee.getDesignation() +
                " with email id " + employee.getEmail() + " and earns " + employee.getSalary() + " per annum.");
    }
}
