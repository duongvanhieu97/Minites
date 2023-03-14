package view;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new FullTimeEmployee("NV001", "Nguyen Van A", 25, "0123456789", "nva@gmail.com", 10000000, 500000, 20000000));
        employees.add(new FullTimeEmployee("NV002", "Nguyen Van B", 30, "0987654321", "nvb@gmail.com", 15000000, 0, 25000000));
        employees.add(new PartTimeEmployee("NV003", "Nguyen Van C", 20, "0123456789", "nvc@gmail.com", 50));
        employees.add(new PartTimeEmployee("NV004", "Nguyen Van D", 22, "0987654321", "nvd@gmail.com", 40));
        System.out.println("Danh sách nhân viên:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
//        Trung bình lương nhân viên
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.netSalary();
        }
        double averageSalary = totalSalary / employees.size();
        System.out.println("Trung bình lương của công ty: " + averageSalary);

    }

}
