public class Point {
    protected double x, y; //instance variables
    public Point(double x, double y) {
        this.x = x; this.y = y;
    }
    public double distance(double x,double y) {
        return Math.sqrt(Math.pow((this.x-x),2) + Math.pow((this.y-y),2));
    }
    public void translate(double moveX,double moveY) {
        this.x += moveX;
        this.y += moveY;
    }
    public boolean equals(Point point){
        return (this.x == point.x && this.y == point.y);
    }
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

}
