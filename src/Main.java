// Базовый класс для сотрудников
abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}

// Постоянный сотрудник
class PermanentEmployee extends Employee {
    public PermanentEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }
}

// Контрактный сотрудник
class ContractEmployee extends Employee {
    public ContractEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.1;
    }
}

// Стажер
class InternEmployee extends Employee {
    public InternEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 0.8;
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        Employee permanent = new PermanentEmployee("Alice", 1000);
        Employee contract = new ContractEmployee("Bob", 1000);
        Employee intern = new InternEmployee("Charlie", 1000);

        System.out.println(permanent.calculateSalary());
        System.out.println(contract.calculateSalary());
        System.out.println(intern.calculateSalary());
    }
}
