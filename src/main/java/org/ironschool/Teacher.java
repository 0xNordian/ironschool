package org.ironschool;
import java.util.List;

public class Teacher extends Person{
    private boolean isAssigned;
    private List<Course> courses;
    private double salary;

    public Teacher(String personalName, String email, String address, double salary) {
        super(personalName, email, address);
        setAssigned(false);
        setSalary(salary);
    }
    /*
private List<Person> personList;
public PersonsList(){
personList = new ArrayList<>();}
inicializar las List<> en el constructor como ArrayList
 */

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        //no puede ser negativo ni vacío
        this.salary = salary;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(Course course) {
        //añadir curso a la lista
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "isAssigned=" + isAssigned +
                ", courses=" + courses +
                ", salary=" + salary +
                ", name=" + getPersonalName() +
                ", email=" + getEmail() +
                ", address=" + getAddress() +
                '}';
    }

    public String getName() {
        return super.getPersonalName();
    }
}
