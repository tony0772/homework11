package excercise2and3;

public class Employee extends Person{
    String company;
    Integer salary;
    public Employee(String name, int age, String hairColor,String company, Integer salary) {
        super(name, age, hairColor);
        this.company= company;
        this.salary= salary;
    }

    public String getCompany() {
        return company;
    }

    public Integer getSalary() {
        return salary;
    }
}
