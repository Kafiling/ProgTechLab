import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        boolean run = true;
        int sumCredit = 0;
        double sumWeightedGrade = 0;
        while(run){
            System.out.println("Enter course ID, credit and grade; or X to terminate");
            String courseId = scanner.next();
            if(courseId.equals("X")){
                break;
            }
            int credit = scanner.nextInt();
            String grade = scanner.next();
            double gradeValue = 0;
            switch (grade) {
                case "A" : gradeValue = 4; break;
                case "B+" : gradeValue = 3.5; break;
                case "B" : gradeValue = 3; break;
                case "C+" : gradeValue = 2.5;; break;
                case "C" : gradeValue = 2; break;
                case "D+" : gradeValue = 1.5; break;
                case "D" : gradeValue = 1; break;
                case "F" : gradeValue = 0; break;
                default : System.out.println ("Invalid grade");
            }
            sumCredit += credit;
            sumWeightedGrade += (gradeValue*credit);
        }
        if(sumCredit == 0){
            sumCredit = 1;
        }
        double GPA = sumWeightedGrade/sumCredit;
        System.out.println("GPA = "+GPA);

    }
}