import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x and y : ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(power(x,y));
    }
    public static int power(int b, int p){
        if(p==0){
            return 1;
        }
        if(p%2==0){
            if(p==2){return b*b;}
            else{return power(power(b,p/2),2);}
        }
        else {
            return b*power(b,p-1);
        }
    }
}
