public class Box {
    double width;
    double height;
    double depth;
    double total;

    Box(double width, double height,double depth ){
        this.width = width;
        this.height = height;
        
        
        
        this.depth = depth;
    }
    public double volume(){
        total=(width*height*depth);
        return total;

    }

    public static void main(String[] args) {
        Box obj = new Box(4,2,0.5);
        System.out.println(obj.volume());
    }
}
