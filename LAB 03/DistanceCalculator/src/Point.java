/*
 * This is the point class, or the UML which will act as a [function?] for 
 * the main class... DistanceCalculator
 */

/*
 * @author Andrew
 */

public class Point {
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    public Point(double a, double b, double c, double d){
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }
    public double getX1(){
        return x1;
    }
    public void setX1(double a){
        x1 = a;
    }
    public double getY1(){
        return y1;
    }
    public void setY1(double b){
        y1 = b;
    }
    public double getX2(){
        return x2;
    }
    public void setX2(double c){
        x2 = c;
    }
    public double getY2(){
        return y2;
    }
    public void setY2(double d){
        y2 = d;
    }
    
    public double getDistance(){
        return (y2-y1)/(x2-x1);
    }
}
