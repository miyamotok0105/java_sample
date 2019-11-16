package book1.ch08.EmployeeSample;

class Employee {

    int empNo;
    String empName;

    void setData(int no, String name) {
        empNo = no;
        empName = name;
    }
    int getEmpNO() {
        return empNo;
    }
    String getEmpName() {
        return empName;
    }
}

public class Main {
    public static void main(String args[]) {

        Employee emp1 = new Employee();
        emp1.setData(1, "Tanaka");
        System.out.println("No" + emp1.getEmpNO());
        System.out.println("Name " + emp1.getEmpName());

        Employee emp2 = new Employee();
        emp2.setData(2, "Ikeda");
        System.out.println("No " + emp2.getEmpNO());
        System.out.println("Name " + emp2.getEmpName());
    }
}
