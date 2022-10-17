public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ertugrul KOC", 9320, 188, 2022);
        print("Name: " + employee.name);
        print("Salary: " + employee.oldSalary);
        print("Work Hours: " + employee.workHours);
        print("Hire Year: " + employee.hireYear);
        print("Tax: " + employee.tax());
        print("Bonus: " + employee.bonus());
        print("Raise Salary: " + employee.raiseSalary());
        print("Total Salary: " + employee.totalSalary());
        print("Salary With Bonus And Tax: " + employee.salaryWithBonusAndTax());
    }

    public static void print(String text) {
        System.out.println(text);
    }
}


