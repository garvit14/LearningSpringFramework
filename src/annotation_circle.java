public class annotation_circle {
    private Point centre;

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public void draw(){
        System.out.println("Drawing circle");
        System.out.println("Centre: "+centre);
    }
}
