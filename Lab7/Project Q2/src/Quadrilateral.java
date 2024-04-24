import java.awt.Point;
import java.lang.reflect.Array;
import java.awt.geom.Point2D;

public abstract class Quadrilateral {
    private Point a, b, c, d;
    public Quadrilateral(int x1, int y1, int x2, int y2, int
            x3, int y3, int x4, int y4) {
        a = new Point(x1, y1);
        b = new Point(x2, y2);
        c = new Point(x3, y3);
        d = new Point(x4, y4);
    }
    public double[] getSortedDist(){
        Point[] pointArr = {a,b,c,d};
        double[] dis = new double[6];
        int index = 0;
        for(int i=0;i<pointArr.length;i++){
            for(int j=i+1;j<pointArr.length;j++){
                dis[index] = pointArr[i].distance(pointArr[j]);
                index++;
            }
        }
        dis = insertionSort(dis);
        return dis;

    }

    public double[] insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public String toString(){
        String str = "";
        Point[] pointArr = {a,b,c,d};
        for(Point p:pointArr){
            if(p.equals(d)){
                str += getClass().getName()+"[x="+p.getX()+",y="+p.getY()+"]";
            }
            else{
                str += getClass().getName()+"[x="+p.getX()+",y="+p.getY()+"]\n";
            }
        }

        return str;
    }
    public abstract double area();
}
