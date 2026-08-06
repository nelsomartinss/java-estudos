package Exercises.MemoryBehaviorExercises;

import Exercises.MemoryBehaviorExercises.Entities.Employee;

import java.util.*;

public class Ex013 {
    void main(){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfPeople, id, idSalary;
        String name;
        double salary, percent;
        Employee employeeIncrease = null;

        System.out.print("\nHow many people do you want to add?: ");
        numberOfPeople = sc.nextInt();
        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < numberOfPeople; i++){
            System.out.printf("\nEmployee #%d:\n", i + 1);

            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Salary: ");
            salary = sc.nextDouble();

            employees.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee ID that will have salary increase: ");
        idSalary = sc.nextInt();

        employeeIncrease = employees.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        if(employeeIncrease == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            percent = sc.nextDouble();
            employeeIncrease.increaseSalary(percent);
        }

        System.out.println("\nList of employees:");
        for(Employee employee: employees){
            System.out.print(employee + "\n");
        }

        sc.close();
    }
}
