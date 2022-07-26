package storage;

import model.Employee;
import model.FulltimeEmployee;
import model.ParttimeEmployee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile {
    public static void writeFile(List<Employee> employees){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
            ObjectOutputStream ost = new ObjectOutputStream(fileOutputStream);
            ost.writeObject(employees);
            ost.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readFile(){
        try {
            FileInputStream fis = new FileInputStream("employee.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List<Employee> employees = (List<Employee>) ob;
            ois.close();
            fis.close();
            return employees;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
//                FulltimeEmployee b1 = new FulltimeEmployee(100, 0, 10000);
//        FulltimeEmployee b2 = new FulltimeEmployee(10, 50, 20000);
//        ParttimeEmployee b3 = new ParttimeEmployee(3.4f);
//        ParttimeEmployee b4 = new ParttimeEmployee(10.0f);
//        List<Employee> employees = new ArrayList<>();
//        employees.add(b1);
//        employees.add(b2);
//        employees.add(b3);
//        employees.add(b4);
//        writeFile(employees);
        List<Employee> employees = readFile();
        System.out.println(employees);
    }

}
