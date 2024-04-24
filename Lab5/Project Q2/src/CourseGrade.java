public class CourseGrade {
    private Course course;
    private String grade;
    public CourseGrade(Course c,String g){
        course = c; grade = g;
    }

    public String getGrade() {
        return grade;
    }

    public Course getCourse() {
        return course;
    }
}
