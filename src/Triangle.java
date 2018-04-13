public class Triangle {

    private String type = "none type";
    private int height = 0;

    public Triangle(){
        //default constructor
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public void draw(){
        System.out.println("Woaah "+type+" Triangle drawn with height "+height+" !!");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // I want this method to be called when bean is being initialized
    public void myInit(){
        System.out.println("myInit method of Triangle called.");
    }

    // I want this method to be called when bean is about to be destroyed
    public void cleanUp(){
        System.out.println("cleanUp method of Triangle called.");
    }
}
