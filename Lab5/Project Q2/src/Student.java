import java.util.ArrayList;

public class Student {
    private String stdId;
    private String name;
    private ArrayList<CourseGrade> transcript = new ArrayList<CourseGrade>();
    public Student(String stdId,String name){
        this.stdId=stdId;this.name=name;
    }

    public String getName() {
        return name;
    }

    public String getStdId() {
        return stdId;
    }
    public void addGradeReport(Course c, String g){
        CourseGrade CG = new CourseGrade(c,g);
        transcript.add(CG);
    }
    public double calGPA(){
        double sumWeightGrade=0;
        double sumCredit=0;
        for(CourseGrade courseGrade : transcript){
            String grade = courseGrade.getGrade();
            double gradeValue=0;
            switch (grade){
                case "A" : gradeValue = 4; break;
                case "B+" : gradeValue = 3.5; break;
                case "B" : gradeValue = 3; break;
                case "C+" : gradeValue = 2.5; break;
                case "C" : gradeValue = 2; break;
                case "D+" : gradeValue = 1.5; break;
                case "D" : gradeValue = 1; break;
                case "F" : gradeValue = 0; break;
                default: break;
            }
          int credit = courseGrade.getCourse().getCredit();
          sumCredit += credit;
          sumWeightGrade += gradeValue*credit;
        }
        if(sumCredit == 0){
            return 0;
        }
        return (double) Math.round(sumWeightGrade / sumCredit * 100) /100 ;
    }

    public ArrayList<CourseGrade> getTranscript() {
        return transcript;
    }
}
