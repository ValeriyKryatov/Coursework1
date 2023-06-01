package pro.sky.java.course1.coursework1;
public class Main {
    private static void printAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee + " ");
            }
        }
    }
    private static double foldSalaryEmployee(Employee[] employees) {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalaryEmployee();
            }
        }
        return totalSalary;
    }
    private static int printMinSalaryEmployee(Employee[] employees) {
        int minSalary = 1_000_000_000;
        for (Employee employee : employees) {
            if (employee != null) {
                minSalary = Math.min(minSalary, employee.getSalaryEmployee());
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalaryEmployee() == minSalary) {
                System.out.println("Сотрудник с наименьшей зарплатой: " + employee);
                break;
            }
        }
        return minSalary;
    }
    private static int printMaxSalaryEmployee(Employee[] employees) {
        int maxSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                maxSalary = Math.max(maxSalary, employee.getSalaryEmployee());
            }
        }
        for (Employee employee : employees) {
            if (employee.getSalaryEmployee() == maxSalary) {
                System.out.println("Сотрудник с наибольшей зарплатой: " + employee);
                break;
            }
        }
        return maxSalary;
    }
    private static double printAverageSalaryEmployee(Employee[] employees) {
        double averageSalary = 0.0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalaryEmployee() != 0) {
                averageSalary += employee.getSalaryEmployee();
                counter++;
            }
        }
        return averageSalary / counter;
    }
    private static String printFullNameEmployee(Employee[] employees) {
        System.out.println("Ф.И.О. всех сотрудников:");
        for (Employee employee : employees ) {
            if (employee != null) {
                System.out.println(employee.getSurNameEmployee() + " " + employee.getNameEmployee() + " " + employee.getPatronymicEmployee());
            }
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println("Курсовая работа № 1");
        System.out.println(" ");

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 41500);
        employees[1] = new Employee("Петров", "Петр", "Петрович", 2, 42000);
        employees[2] = new Employee("Афанасьев", "Игорь", "Гаврилович", 3, 42500);
        employees[3] = new Employee("Кашин", "Геннадий", "Аркадьевич", 4, 43000);
        employees[4] = new Employee("Глазов", "Никита", "Валентинович", 5, 34500);
        employees[5] = new Employee("Быстров", "Арсений", "Владимирович", 1, 44000);
        employees[6] = new Employee("Зеленоглазов", "Николай", "Николаевич", 2, 44500);
        employees[7] = new Employee("Куценко", "Владимир", "Александрович", 3, 45000);
        employees[8] = new Employee("Быков", "Иван", "Михайлович", 4, 45500);
        employees[9] = new Employee("Николаев", "Родион", "Сергеевич", 5, 46000);
        printAllEmployee(employees);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц: " + foldSalaryEmployee(employees) + " рублей");
        System.out.println();
        printMaxSalaryEmployee(employees);
        System.out.println();
        printMinSalaryEmployee(employees);
        System.out.println();
        System.out.println("Среднее значение зарплат в месяц: " + printAverageSalaryEmployee(employees) + " рублей");
        System.out.println();
        System.out.println(printFullNameEmployee(employees));
        }
    }