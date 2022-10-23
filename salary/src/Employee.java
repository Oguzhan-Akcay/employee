import java.util.Scanner;

public class Employee {
    private final String name;
    private final double salary;
    private final int workHours;
    private final int hireYears;

    public Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    public double tax(double salary) {
        if (salary > 1000) {
            return salary * 3 / 100;
        } else
            return 0;
    }

    public double bonus(int workHours) {
        //150
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else
            return 0.0;
    }

    public double raiseSalary(int hireYears) {
        int thisYear = 2021;
        int workYears = thisYear - hireYears;
        if (workYears < 10) {
            return salary * 5 / 100;
        } else if (workYears < 20) {
            return salary * 10 / 100;
        } else {
            return salary * 15 / 100;
        }
    }

    public String toString() {
        return "Adı: " + name + '\n' +
                "Maaşı: " + salary + '\n' +
                "Çalışma Saati: " + workHours + '\n' +
                "Başlangıç Yılı: " + hireYears + '\n' +
                "Vergi: " + tax(salary) + '\n' +
                "Bonus: " + bonus(workHours) + '\n' +
                "Maaş Artışı: " + raiseSalary(hireYears) + '\n' +
                "Vergi ve Maaşlarla Birlikte Maaş: " + (salary + bonus(workHours) -tax(salary)) + '\n' +
                "Toplam Maaş: " + (salary + bonus(workHours) -tax(salary)+raiseSalary(hireYears));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Çalışan Adı ve Soyadı : ");
        String employeeName = scanner.nextLine();

        System.out.print("Çalışan Maaşı: ");
        double employeeSalary = Double.parseDouble(scanner.next());

        System.out.print("Çalışanın Haftalık Çalışma Saati: ");
        int employeeWorkHours = scanner.nextInt();

        System.out.print("Çalışanın işe Başlangıç Tarihi: ");
        int employeeHireYears = scanner.nextInt();

        Employee employee = new Employee(employeeName, employeeSalary, employeeWorkHours, employeeHireYears);
        System.out.println(employee);

    }

}
