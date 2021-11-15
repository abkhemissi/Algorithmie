public class Circle {

    private Point point;
    private double radius;

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public double area(){
        return radius*radius*Math.PI;
    }

    //retourne true si l'inégalité est vérifié sinon false
    public boolean containsPoint(Point point1){
        return Math.pow(point1.getX() - point.getX(), 2) + Math.pow(point1.getY() - point.getY(), 2) < Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "Cercle de centre : " + point.toString() + " et de rayon : " + radius;
    }
}
