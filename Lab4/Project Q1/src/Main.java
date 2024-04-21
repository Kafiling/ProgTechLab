import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int currentIndex = 0;
        int i = 2;
       while(currentIndex < n){
            if(isPrime(i)){
                arr[currentIndex] = i;
                currentIndex++;
            }
           i++;
        }
        for (int number : arr) {
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