import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Student 1: Enter ID, name, major");
        String id1 = scanner.next();
        String fname1 = scanner.next();
        String lname1 = scanner.next();
        String major1 = scanner.next();
        System.out.println("Student 2: Enter ID, name, major");
        String id2 = scanner.next();
        String fname2 = scanner.next();
        String lname2 = scanner.next();
        String major2 = scanner.next();
        Student std1 = new Student(id1,fname1+" "+lname1,major1);
        Student std2 = new Student(id2,fname2+" "+lname2,major2);
        String checkYear = "Different year";
        String checkLevel = "different level";
        String checkFaculty = "different faculty";
        if(std1.sameYear(std2)){
            checkYear = "Same year";
        }
        if(std1.sameLevel(std2)){
            checkLevel = "same level";
        }
        if(std1.sameFaculty(std2)){
            checkFaculty = "same faculty";
        }

        System.out.println(checkYear+", "+checkLevel+", "+checkFaculty);

    }
}