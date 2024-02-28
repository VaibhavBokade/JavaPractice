import java.time.LocalDate;

public class Employee {
    private String name;
    private String empid;
    private String title;


    public Employee() {
        super();
    }


    public Employee(String name, String empid, String title) {
        super();
        this.name = name;
        this.empid = empid;
        this.title = title;
    }

    public double calculateSalary() {
        return 0.0;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmpid() {
        return empid;
    }


    public void setEmpid(String empid) {
        this.empid = empid;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Employee [name=" + name + ", empid=" + empid + ", title=" + title + "]";
    }





}
