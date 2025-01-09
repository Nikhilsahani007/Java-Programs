import java.util.Scanner;

abstract class Vaccine {
    int age;
    String nationality;

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
            System.out.println("You are eligible for the first dose.");
            System.out.println("Amount to be paid: 250 Rs.");
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose(boolean firstDoseCompleted) {
        if (firstDoseCompleted) {
            System.out.println("You are eligible for the second dose.");
        } else {
            System.out.println("You must complete the first dose before taking the second dose.");
        }
    }

    public abstract void boosterDose();
}

class VaccinationSuccessful extends Vaccine {

    public VaccinationSuccessful(int age, String nationality) {
        super(age, nationality);
    }

    @Override
    public void boosterDose() {
        System.out.println("You are eligible for the booster dose after completing both first and second doses.");
    }
}

public class Vaccination {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        Vaccine vaccination = new VaccinationSuccessful(age, nationality);
        vaccination.firstDose();
        System.out.print("Have you completed the first dose? (true/false): ");
        boolean firstDoseCompleted = scanner.nextBoolean();
        vaccination.secondDose(firstDoseCompleted);
        vaccination.boosterDose();
        scanner.close();
    }
}
