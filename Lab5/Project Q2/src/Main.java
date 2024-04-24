import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.numberOfLeadingZeros;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 student ID and name:");
        ArrayList<Student> stdList = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {stdList.add(createStd());}
        System.out.println("Enter 5 course ID, name and credit:");
        ArrayList<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 5; i++) {courseList.add(createCourse());}
        for(Student std : stdList){
            System.out.println("\n"+std.getName()+" grade report: ");
            while(true){
                String courseId = scanner.next();
                if(courseId.equals("X") || courseId.equals("x")){
                    break;
                }
                Course inputCourse = courseList.get(0);
                for (Course course : courseList){
                    if(course.getCourseId().equals(courseId)){
                        inputCourse = course; // assume user input correctly
                    }
                }
                String grade = scanner.next();
                std.addGradeReport(inputCourse,grade);
            }

        }
        for(Student std : stdList){
            System.out.println("------ Transcript ------");
            System.out.println("  " +std.getStdId()+" "+std.getName());
            for(CourseGrade courseGrade:std.getTranscript()){
                System.out.println(courseGrade.getCourse().getCourseId()+" "+courseGrade.getCourse().getName()+" "+courseGrade.getGrade());
            }
            System.out.println("\n"+"GPA: "+std.calGPA()+"\n");
        }

    }
    public static Student createStd(){
        Scanner scanner = new Scanner(System.in);
        String stdId = scanner.next();
        String stdFName = scanner.next();
        String stdLName = scanner.next();
        return new Student(stdId,stdFName+" "+stdLName);
    }
    public static Course createCourse(){
        Scanner scanner = new Scanner(System.in);
        String courseId = scanner.next();
        String courseName = scanner.nextLine();
        courseName = courseName.strip();
        int credit = parseInt(courseName.substring(courseName.length()-1));
        courseName = courseName.substring(0,courseName.length()-2);
        return new Course(courseId,courseName,credit);
    }
}