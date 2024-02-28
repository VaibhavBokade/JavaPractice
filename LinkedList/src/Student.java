public class Student {
    private String firstName;
    private String lastName;
    private int idNo;
    private int marks;

    public Student(String firstName, String lastName, int idNo, int marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNo = idNo;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNo=" + idNo +
                ", marks=" + marks +
                '}';
    }

}
