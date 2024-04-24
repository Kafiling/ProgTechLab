public class Kite extends Quadrilateral {
    public Kite(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
       super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    @Override
    public double area() {
        double[] sorted = super.getSortedDist();
        for(int i=0;i<sorted.length;i++){
            for(int j=i+1;j<sorted.length;j++){
                if(sorted[i]==sorted[j]){
                    sorted[i] = -1;
                    sorted[j] = -1;
                    break;
                }
            }
        }
        //Note : เส้นทะแยงมุมจะมีค่า != -1 -> ตัวที่ 4,5 จะเป็นความยาวเส้นทะแยง
        double[] filtered = super.insertionSort(sorted);

        return 0.5*filtered[4]*filtered[5];
    }
}
