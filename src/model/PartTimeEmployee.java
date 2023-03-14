package model;

import java.io.Serializable;

public class PartTimeEmployee extends Employee implements Serializable {
    private double numberHourWork;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(double numberHourWork) {
        this.numberHourWork = numberHourWork;
    }

    public PartTimeEmployee(String employeeCode, String name, int age, String number, String email, double numberHourWork) {
        super(employeeCode, name, age, number, email);
        this.numberHourWork = numberHourWork;
    }

    public double getNumberHourWork() {
        return numberHourWork;
    }

    public void setNumberHourWork(double numberHourWork) {
        this.numberHourWork = numberHourWork;
    }

    public double netSalary() {
        return (numberHourWork * 1000000);
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "numberHourWork=" + numberHourWork + "netSalary" + netSalary() +
                '}';
    }
}
