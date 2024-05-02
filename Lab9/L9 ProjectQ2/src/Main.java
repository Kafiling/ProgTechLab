import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int x = scanner.nextInt();
        String str = "";
        for(int i : primeFactor(x)){
            str += i+",";
        }
        str = str.substring(0,str.length()-1);
        str += ".";
        System.out.print("Prime factors of "+x+" are "+str);


    }

    public static ArrayList<Integer> primeFactor(int n){
        return primeFinder(n ,2);

    }
    public static ArrayList<Integer> primeFinder(int n,int i){
        if (n == 1) return new ArrayList<Integer>();
        if (n%i == 0){
            ArrayList<Integer> factor = primeFinder(n/i,i);
            if(!factor.contains(i)){
            factor.add(0,i);}
            return factor;
        }
        else{
        return primeFinder(n, i+1);
    }
    }
}
