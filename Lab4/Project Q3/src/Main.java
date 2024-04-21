import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] aArr = new int[10][5];
        int[][] bArr = new int[10][5];
        int[][] cArr = new int[5][3];
        for(int i=0;i<aArr.length;i++) {
            aArr[i] = random.ints(5, -100,100).toArray();
        }
        for(int i=0;i<bArr.length;i++) {
            bArr[i] = random.ints(5, -100,100).toArray();
        }
        for(int i=0;i<cArr.length;i++) {
            cArr[i] = random.ints(3, -100,100).toArray();
        }
        Mtx A = new Mtx(aArr);
        Mtx B = new Mtx(bArr);
        Mtx C = new Mtx(cArr);
        System.out.println("A =");
        A.printMtx();
        System.out.println();
        System.out.println("B =");
        B.printMtx();
        System.out.println();
        System.out.println("C =");
        C.printMtx();
        System.out.println();

        if(A.equalSize(B))
        {
            System.out.println("A+B =");
            A.add(B).printMtx();

        }
        else{
            System.out.println("These two matrices cannot be added because they have different dimensions.");
        }
        System.out.println();

        System.out.println("2*B =");
        B.mul(2).printMtx();
        System.out.println();

        if(A.compatible(B)){
            System.out.println("A*B =");
            A.mul(B).printMtx();
        }
        else{
            System.out.println("A and B are not compatible");
        }

        System.out.println();

        if(A.compatible(C)){
            System.out.println("A*C =");
            A.mul(C).printMtx();
        }
        else{
            System.out.println("A and C are not compatible");
        }
    }
}