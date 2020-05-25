package zadanie03;

import java.time.LocalDate;

class Employee extends Person {

    protected int hireDate; //year
    protected String companyName;
    protected double salary;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, double salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    public int getJobSeniority() {
        return LocalDate.now().getYear() - hireDate;
    }

    public double getSalary() {
        return salary;
    }
}
