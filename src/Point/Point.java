package Point;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        double result = (x * x) + (y * y);
        result = Math.sqrt(result);
        return result;
    }

    public double distance(Point point){
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        double result = (point.x - getX()) * (point.x - getX()) + (point.y - getY()) * (point.y - getY());
        result = Math.sqrt(result);
        return result;
    }

    public double distance(double x ,double y){
        //d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
        double result = (x - getX()) * (x - getX()) + (y - getY()) * (y - getY());
        result = Math.sqrt(result);
        return result;
    }


}
