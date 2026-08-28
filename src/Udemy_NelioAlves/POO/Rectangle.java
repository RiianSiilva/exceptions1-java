package Udemy_NelioAlves.POO;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String ToString(){
        return "Area = " + String.format("%.2f", area()) + " Perimeter = " + String.format("%.2f", perimeter()) + " Diagonal = " + String.format("%.2f", diagonal());
    }
}
