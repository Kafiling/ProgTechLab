import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i=2 ; i<n; i++){
            if(isPrime(i)){
                arrList.add(i);
            }
        }
        for (int number : arrList) {
            System.out.println(number);
        }
    }
    public static boolean isPrime(int num){
        if(num == 2){
            return  true;
        }
        for(int i=3;i<=Math.sqrt(num)+1;i+=2){
            if(num%i == 0 || num%2 == 0){
                return false;
            }
        }
        return true;

    }
}