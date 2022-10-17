public class Employee {
    String name;
    double oldSalary;
    double newSalary;
    double workHours;
    int hireYear;


    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.oldSalary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        newSalary = oldSalary;
    }

    //Salary Tax Calculate func
    public Double tax() {
        double taxValue = 0;
        if (oldSalary > 1000) {
            taxValue = (oldSalary / 100) * 3;
        }
        return taxValue;
    }

    //Salary Bonus Calculate func
    public Double bonus() {
        double bonusValue = 0;
        if (workHours > 40) {
            bonusValue = (workHours - 40) * 30;
        }
        return bonusValue;
    }

    //Raise Salary Calculate func
    public double raiseSalary() {
        int totalWorkYear = 2021 - hireYear;
        if (totalWorkYear < 10) {
            newSalary += (oldSalary / 100) * 5;
        } else if (totalWorkYear < 20) {
            newSalary += (oldSalary / 100) * 10;
        }
        return oldSalary;
    }


    public double totalSalary() {
        double totalSalaryValue = oldSalary + bonus();
        return totalSalaryValue;
    }

    public double salaryWithBonusAndTax() {
        oldSalary = oldSalary + tax() + bonus();
        return oldSalary;


    }
}