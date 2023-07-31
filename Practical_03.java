public class Employee {
    private String name;
    private int age;
    private double salary;

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
Test class to test the code


public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Using setters to set the values
        employee.setName("Bogdan");
        employee.setSalary(50000);

        // Using constructor to set the bonus value
        Employee employeeWithBonus = new Employee("John", 40000, 10000);

        // Output for employee without bonus
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getSalary());

        // Output for employee with bonus
        System.out.println("\nEmployee Name: " + employeeWithBonus.getName());
        System.out.println("Basic Salary: " + employeeWithBonus.getSalary());
        System.out.println("Bonus: " + employeeWithBonus.getBonus());
        System.out.println("Bonus Amount: " + employeeWithBonus.calculateBonusAmount());

    }
}


Modified Employee class using constructor for bonus:



public class Employee {
    private String name;
    private int age;
    private double salary;
    private double bonus;

    // Constructor with bonus
    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    // Getter and Setter for Name, Age, and Salary (same as before)
    // ...

    // Getter and Setter for Bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate Bonus Amount
    public double calculateBonusAmount() {
        return salary + bonus;
    }
}
With these changes, the output should be as follows

Employee Name: Bogdan
Basic Salary: 50000

Employee Name: John
Basic Salary: 40000
Bonus: 10000
Bonus Amount: 50000

