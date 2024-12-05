import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeptEmployee profAhmad = new Professor("Ahmad", 4800, LocalDate.of(2003, 12, 9), 12);
        DeptEmployee profAlex = new Professor("Alex", 6000, LocalDate.of(1994, 5, 12), 50);
        DeptEmployee profKhaled = new Professor("Khaled", 5400, LocalDate.of(2000, 5, 9), 32);
        DeptEmployee secOfAhmad = new Secretary("Hanna", 2400, LocalDate.of(2016, 5, 25), 150);
        DeptEmployee secOfAlex = new Secretary("Willam", 2000, LocalDate.of(2024, 1, 20), 5);
        DeptEmployee[] department = new DeptEmployee[5];
        department = new DeptEmployee[]{profAhmad, profAlex, profKhaled, secOfAlex, secOfAhmad};

        System.out.println("Do you wish to print the Sum of all salaries? Y / N");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();



        if (userChoice.equalsIgnoreCase("y")) {
            double salariesSum = 0;
            for (DeptEmployee employee: department) {
                salariesSum+= employee.computeSalary();
            }
            System.out.println("Salaries of the Department: " + salariesSum + '$');
            System.out.println("Avg of the Department Salaries: " + salariesSum/department.length + '$');
        } else {
            System.out.println("NO SUM REQUESTED");
        }

    }
}