import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("First point : ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Second point : ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Third point : ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        System.out.print("Fourth point : ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        double cenX = (x1+x2+x3+x4)/4;
        double cenY = (y1+y2+y3+y4)/4;
        System.out.println("The centroid is ( "+cenX+", "+cenY+" ).");

        double[] disArr = {calcDis(x1, y1, cenX, cenY), calcDis(x2,y2,cenX,cenY), calcDis(x3,y3,cenX,cenY), calcDis(x4,y4,cenX,cenY)};
        double minDis,maxDis,sum;
        minDis = maxDis = disArr[0];
        sum = 0;
        for(double i : disArr){
            sum += i;
            if (i > maxDis){
                maxDis = i;
            }
            if (i < minDis){
                minDis = i;
            }
        }
        System.out.println("Sum of distance is "+sum+".");
        System.out.println("Shortest distance is "+minDis+".");
        System.out.println("Longest distance is "+maxDis+".");

    }
    public static double calcDis(double x,double y,double cenX, double cenY) {
        return Math.sqrt(Math.pow((x-cenX),2) + Math.pow((y-cenY),2));
    }

}