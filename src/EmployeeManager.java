import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;

import java.util.ArrayList;

public class EmployeeManager {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        FulltimeEmployee b1 = new FulltimeEmployee(100, 0, 10000);
        FulltimeEmployee b2 = new FulltimeEmployee(10, 50, 20000);
        ParttimeEmployee b3 = new ParttimeEmployee(30.4f);
        ParttimeEmployee b4 = new ParttimeEmployee(10.0f);
        employees.add(b1);
        employees.add(b2);
        employees.add(b3);
        employees.add(b4);
    }

//    1. Lay ra luong trung binh cua cong ty
//    2. Lay danh sach nhan vien luong thap hon luong tb
}
