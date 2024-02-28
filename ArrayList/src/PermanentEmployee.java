public class PermanentEmployee extends Employee {
    private double salary;
    private String city;
    private String experience;


    public PermanentEmployee() {
        super();
    }


    public PermanentEmployee(String name, String empid, String title, double salary, String city, String experience) {
        super(name, empid, title);
        this.salary = salary;
        this.city = city;
        this.experience = experience;
    }

    public double calculateSalary() {
        return salary + 1000;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getCity() {
        return city;
    }


    public void setCity(String city) {
        this.city = city;
    }


    public String getExperience() {
        return experience;
    }


    public void setExperience(String experience) {
        this.experience = experience;
    }


    @Override
    public String toString() {
        return super.toString()+">>>> PermanentEmployee [salary=" + salary + ", city=" + city + ", experience=" + experience + "]";
    }


}

