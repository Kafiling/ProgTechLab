import java.lang.Math;
public class Student {
    private String id,name,major;
    public Student(String id,String name,String major){
        this.id =id; this.name = name; this.major = major;
    }
    public long getDigit(int start,int stop){
        return Long.parseLong(this.id.substring(start, stop+1));
    }
    public long getFacultyCode(){
        return this.getDigit(8,9);
    }
    public long getLevelCode(){
        return this.getDigit(2,2);
    }
    public long getYear(){
        return this.getDigit(0,1);
    }
    public boolean sameYear(Student otherStd) {
        return this.getYear() == otherStd.getYear();
    }
    public boolean sameLevel(Student otherStd) {
        return this.getLevelCode() == otherStd.getLevelCode();
    }
    public boolean sameFaculty(Student otherStd) {
        return this.getFacultyCode() == otherStd.getFacultyCode();
    }

}
