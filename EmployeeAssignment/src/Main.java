//first of all I created the EmployeeId class where I decleare various attributes of that class
// then write the constructor and then write two methodes first is displayEmployee and second is setCompanyName
//then in main method we call setCompanyName method to set company name method
//then create an object of class and call another method to display all employees.

public class Main {
    public static void main(String[] args) {
        EmployeeId.setCompanyName("Perennial Systems");
        EmployeeId emp1 = new EmployeeId("Vaibhav Bokade", "Software Engineer", 40000.0);
        EmployeeId emp2 = new EmployeeId("Omkar Andhare", "Software Engineer", 40000.0);
        EmployeeId emp3 = new EmployeeId("Kuldeep Kamble", "Software Engineer", 40000.0);
        EmployeeId.setCompanyName("changed name");
        emp1.displayEmployee();
        emp2.displayEmployee();
        emp3.displayEmployee();
    }
}