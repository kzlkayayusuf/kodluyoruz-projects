package java101.salaryCalculator;

public class Employee {
    String firstName;
    String lastName;
    double salary;
    int workHours;
    int hireYear;

    Employee(String firstName, String lastName, double salary, int workHours, int hireYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        return this.salary <= 1000 ? 0 : this.salary * 0.03;
    }

    int bonus() {
        return workHours <= 40 ? 0 : (workHours - 40) * 30;
    }

    double raiseSalary() {
        int year = 2021 - hireYear;
        if (year > 9 && year < 20) {
            return this.salary * 0.1;
        } else if (year > 19) {
            return this.salary * 0.15;
        } else {
            return this.salary * 0.05;
        }
    }

    double salaryWithTaxAndBonus() {
        return (this.salary - tax() + bonus());
    }

    double totalSalary() {
        return (salaryWithTaxAndBonus() + raiseSalary());
    }

    public String toString() {
        return "Adı : " + this.firstName + " " + this.lastName + "\nMaaşı : " + this.salary + "\nÇalışma Saati : "
                + this.workHours + "\nBaşlangıç Yılı : " + this.hireYear + "\nVergi : " + tax() + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary() + "\nVergi ve Bonuslar ile maaş : " + salaryWithTaxAndBonus()
                + "\nToplam Maaş : "
                + totalSalary();
    }
}
