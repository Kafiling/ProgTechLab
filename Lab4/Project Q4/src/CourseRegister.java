import java.util.ArrayList;

public class CourseRegister {
    private String courseID;
    private ArrayList<Student> stdList = new ArrayList<Student>();
    public CourseRegister(String courseID){
        this.courseID = courseID;
    }
    public boolean register(Student std){
        if(stdList.contains(std)){
            return false;
        }
        else{
            stdList.add(std);
            return true;
        }
    }
    public boolean drop(String stdId){
        boolean contained = false;
        for(Student std:stdList)
        {
            if(std.getId().equals(stdId)){
                stdList.remove(std);
                contained = true;
                break;
            }
        }
        return contained;
    }
    public void printReg(){
        System.out.println(this.courseID);
        for(Student std:stdList){
            std.printStd();
        }
        System.out.println("Total students in this course: "+stdList.size());
    }

}
