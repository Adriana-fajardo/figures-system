package figures;

public class Square{
    private int length;

    public Square(){
    }

    public Square(int length){
        this.length = length;
    }
    public double calculatePerimeter(){
        return length * 4;
    }
    //calculate area
    public double calculatearea(){
        return length * 2;
    }
    //print properties
    public void printProperties(){
        System.out.println("----------- Square Properties ----------");
        System.out.println("length:" + length + "[cm]");
        System.out.println("Perimeter:" + calculatePerimeter() + "[cm]");
        System.out.println("Area:" + 0d + "[cm2]");
    }

    public int getLength() {
    return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
