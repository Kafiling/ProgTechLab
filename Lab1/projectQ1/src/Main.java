import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // Today’s date
        System.out.println("Current Date: " + today);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day: ");
        int date = input.nextInt();

        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter year: ");
        int year = input.nextInt();

        LocalDate dateTime = LocalDate.of(year, month, date);
        long diff = dateTime.toEpochDay() - today.toEpochDay();
        System.out.println("Number of days: " + diff);

    }
}
