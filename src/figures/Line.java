package figures;

public class Line {
    private int length;

    public Line(){}

    public Line(int length) {
        this.length = length;
    }
     /// METHOD THAT DRAWS LINE
    public void drawLine() {
        if(length <=1) {
            System.out.print("line length must be > 1");
        } else {
            System.out.println("Drawing Line with length: " + length + "[u]" + "\n");
            for (int i = 1; i <= length; i++){
                System.out.print(" * ");
            }
        }
    }

    public int getLength() {
        return  length;
    }

    public void  setLength(int length){
        this.length = length;
    }
}
