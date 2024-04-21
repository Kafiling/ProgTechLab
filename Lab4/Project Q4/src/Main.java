import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        CourseRegister course = new CourseRegister("2301260");
        while(true){
            System.out.println("Enter ID, name, major ");
            String id = scanner.next();
            if(id.equals("X"))
            {
                break;
            }
            else {
                String fname = scanner.next();
                String lname = scanner.next();
                String major = scanner.next();
                Student std = new Student(id,fname+" "+lname,major);
                if(course.register(std)){
                    System.out.println(id+" REGISTERED SUCCESSFULLY");
                }
                else {
                    System.out.println(id+" REGISTERED FAILED");
                }
            }

        }
        course.printReg();

        System.out.println("Drop student -> Enter ID of the student: ");
        String id = scanner.next();
        course.drop(id);

        course.printReg();

    }
}