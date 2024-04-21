import java.util.Arrays;

public class Mtx {
    private int rowSize;
    private int colSize;
    private int[][] matrix;
   public Mtx(int[][] array){
       rowSize = array.length;
        if(rowSize>0){
            colSize = array[0].length;
        }
        else colSize = 0;
        matrix = new int[rowSize][colSize];
        int currentRow = 0;
        int currentIndex = 0;
        for(int[] rows : array){
            for(int value : rows){
                matrix[currentRow][currentIndex] = value;
                currentIndex++;
            }
            currentIndex = 0;
            currentRow++;
        }

   }
    public Mtx(int value,int rowSize,int colSize){
       this.rowSize = rowSize;
       this.colSize = colSize;
        matrix = new int[rowSize][colSize];
        for(int[] rows : matrix){
            Arrays.fill(rows,value);
        }
    }

    public void printMtx(){
       for(int i=0;i<rowSize;i++)
        System.out.println(Arrays.toString(matrix[i]));

    }
    public boolean equalSize(Mtx otherMtx){
       return (this.rowSize == otherMtx.rowSize) && (this.colSize == otherMtx.colSize);
    }
    public boolean compatible(Mtx otherMtx){
       return this.colSize == otherMtx.rowSize;
    }
    public Mtx add(Mtx otherMtx){
      Mtx result = new Mtx(0,this.rowSize,this.colSize);
      for(int rows=0;rows<this.rowSize;rows++){
          for(int i=0; i<this.colSize;i++){
              result.matrix[rows][i] = this.matrix[rows][i] + otherMtx.matrix[rows][i];
          }
      }
      return result;
    }
    public Mtx mul(Mtx otherMtx){
        Mtx result = new Mtx(0,this.rowSize,otherMtx.colSize);
        for(int i=0;i<this.rowSize;i++){
            for(int j=0; j<otherMtx.colSize;j++){
                for(int k=0;k< otherMtx.colSize;k++){
                    result.matrix[i][j] += this.matrix[i][k] * otherMtx.matrix[k][j];
                }
            }
        }
        return result;
    }
    public Mtx mul(int c) {
        Mtx result = new Mtx(0, this.rowSize, this.colSize);
        for (int rows = 0; rows < this.rowSize; rows++) {
            for (int i = 0; i < this.colSize; i++) {
                result.matrix[rows][i] = this.matrix[rows][i] * c;
            }
        }
        return result;
    }
}
