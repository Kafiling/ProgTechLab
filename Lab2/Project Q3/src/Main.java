import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Point A: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Point B: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point A = new Point(x1,y1);
        Point B = new Point(x2,y2);

        System.out.println("A = "+A.toString()+" B = "+B.toString()+" Distance = "+A.distance(B.x,B.y));

        System.out.print("Move the points: ");
        double moveX = scanner.nextDouble();
        double moveY = scanner.nextDouble();
        A.translate(moveX,moveY);
        B.translate(moveX,moveY);
        System.out.println("A = "+A.toString()+" B = "+B.toString()+" Distance = "+A.distance(B.x,B.y));

        if(A.equals(B)){
            System.out.println("A and B are at the same position.");
        }
        else {
            System.out.println("A and B are not at the same position.");
        }
    }
}