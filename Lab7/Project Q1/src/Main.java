import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expo exp = new Expo(7, 1);
        exp.printValue();
        Sine s = new Sine(7, Math.PI/4);
        s.printValue();
        Cosine cs = new Cosine(7, 1);
        cs.printValue();

        Taylor[] TaylorList = {exp,s,cs};
        for(Taylor taylor : TaylorList){
            taylor.printValue();
        }
    }
}
