public class Rectangle {
    private double width;
    private double height;

    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width*2) + (height*2);
    }
    public double diagonal(){
        return Math.sqrt((width*width)+(height*height));
    }
}
