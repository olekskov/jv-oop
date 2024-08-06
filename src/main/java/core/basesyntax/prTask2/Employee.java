package core.basesyntax.prTask2;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private Position position;
    private double salary;
    private int yearOfBirth;

    public Employee(int id, String name, Position position, double salary, int dateOfBirth) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.yearOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Name: '" + name + '\'' +
                ", position: '" + position + '\'' +
                ", salary: " + String.format("%.2f", salary) +
                "$, yearOfBirth: " + yearOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && yearOfBirth == employee.yearOfBirth && Objects.equals(name, employee.name) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, yearOfBirth);
    }
}
