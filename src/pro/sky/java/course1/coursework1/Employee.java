package pro.sky.java.course1.coursework1;
public class Employee {
    private final String surNameEmployee;
    private final String nameEmployee;
    private final String patronymicEmployee;
    private int departmentEmployee;
    private int salaryEmployee;
    private final int id;
    private static int idCounter = 0;
    public Employee(String surNameEmployee, String nameEmployee, String patronymicEmployee, int departmentEmployee, int salaryEmployee) {
        if (departmentEmployee < 1 || departmentEmployee > 5) {
            throw new IllegalStateException("Отдел должен быть от 1 до 5");
        }
        this.id = ++idCounter;
        this.surNameEmployee = surNameEmployee;
        this.nameEmployee = nameEmployee;
        this.patronymicEmployee = patronymicEmployee;
        this.departmentEmployee = departmentEmployee;
        this.salaryEmployee = salaryEmployee;
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
        return this.id;
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