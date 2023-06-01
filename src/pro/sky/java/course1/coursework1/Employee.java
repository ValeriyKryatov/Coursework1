package pro.sky.java.course1.coursework1;
public class Employee {
    private String surNameEmployee;
    private String nameEmployee;
    private String patronymicEmployee;
    private int departmentEmployee;
    private int salaryEmployee;
    private int id;
    private static int idCounter = 1;
    public Employee(String surNameEmployee, String nameEmployee, String patronymicEmployee, int departmentEmployee, int salaryEmployee) {
        this.surNameEmployee = surNameEmployee;
        this.nameEmployee = nameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
        if (salaryEmployee >= 0) {
            this.salaryEmployee = salaryEmployee;
        }
        id = idCounter++;
    }
    public String getSurNameEmployee() {
        return this.surNameEmployee;
    }
    public String getNameEmployee() {
        return this.nameEmployee;
    }
    public String getPatronymicEmployee() {
        return this.patronymicEmployee;
    }
    public int getDepartmentEmployee() {
        return this.departmentEmployee;
    }
    public int getSalaryEmployee() {
        return this.salaryEmployee;
    }
    public int getId() {
        return this.id++;
    }
    public void setDepartmentEmployee(int departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }
    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
    @Override
    public String toString() {
        return  "Фамилия: '" + surNameEmployee + '\'' +
                ", Имя: '" + nameEmployee + '\'' +
                ", Отчество:'" + patronymicEmployee + '\'' +
                ", Отдел: " + departmentEmployee +
                ", Заработная плата: " + salaryEmployee + " рублей " +
                ", id = " + id;
        }
    }