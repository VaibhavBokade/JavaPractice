public class EmployeeId {
    private String employeeName;
    private String designation;
    private double salary;
    private static String companyName;

    public EmployeeId(String employeeName, String designation, double salary) {
        this.employeeName = employeeName;
        this.designation = designation;
        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("****Employee ID card****");
        System.out.println("Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.println("Company: " + companyName);
        System.out.println("Salary: " + salary);
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }


}
