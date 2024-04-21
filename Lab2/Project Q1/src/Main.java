import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter firstname lastname age: ");

        String f = myObj.next();
        String l = myObj.next();
        String a = myObj.next();
        //trim to prevent white space
        f = f.trim();
        l = l.trim();
        a = a.trim();
        System.out.println(l+", "+f+" is "+a+" years old.");

    }
}