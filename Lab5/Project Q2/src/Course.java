public class Course {
    private String courseId;
    private String name;
    private int credit;
    public Course(String courseId,String name,int credit){
        this.courseId=courseId;this.name=name;this.credit=credit;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }
}
