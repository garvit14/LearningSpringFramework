import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class AnnotationCircle {
    private Point centre;
    private Point extraPoint;

//    @Autowired
    @Qualifier("circle-related") //used when autowiring byType and byName fails !!
    public void setCentre(Point centre) {
        this.centre = centre;
    }
    
    public void draw(){
        System.out.println("Drawing circle");
        System.out.println("Centre: "+centre);
    }

}
