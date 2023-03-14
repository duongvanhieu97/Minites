package model;

import java.io.Serializable;

public class FullTimeEmployee extends Employee implements Serializable {
    private double bonusMoney;
    private double punishMoney;
    private double hardSalary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(double bonusMoney, double punishMoney, double hardSalary) {
        this.bonusMoney = bonusMoney;
        this.punishMoney = punishMoney;
        this.hardSalary = hardSalary;
    }

    public FullTimeEmployee(String employeeCode, String name, int age, String number, String email, double bonusMoney, double punishMoney, double hardSalary) {
        super(employeeCode, name, age, number, email);
        this.bonusMoney = bonusMoney;
        this.punishMoney = punishMoney;
        this.hardSalary = hardSalary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getPunishMoney() {
        return punishMoney;
    }

    public void setPunishMoney(double punishMoney) {
        this.punishMoney = punishMoney;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double netSalary() {
        return hardSalary + (bonusMoney - punishMoney);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "bonusMoney=" + bonusMoney +
                ", punishMoney=" + punishMoney +
                ", hardSalary=" + hardSalary +
                ", netSalary=" + netSalary() +

                '}';
    }
}
