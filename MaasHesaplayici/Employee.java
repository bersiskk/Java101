public class Employee {
    String name;
    double salary;
    int workHours, hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            return (this.salary * 0.03);
        }
        return 0;
    }

    double bonus() {
        if (workHours > 40) {
            return ((workHours - 40) * 30);
        }
        return 0;
    }

    double raiseSalary() {
        int thisYear = 2021;
        if (thisYear - this.hireYear > 19) {
            return (this.salary * 0.15);
        } else if ((thisYear - this.hireYear > 9) && (thisYear - this.hireYear < 20)) {
            return (this.salary * 0.10);
        }
        return (this.salary * 0.05);
    }

    void toStrings() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışmas saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()));
        System.out.println("Net maaş: " + (this.salary + raiseSalary()));
    }

}
