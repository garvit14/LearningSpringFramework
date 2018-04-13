import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


// one way of using callback methods is by implementing the following interfaces...
public class Line implements InitializingBean, DisposableBean{
    private Point point1;
    private Point point2;

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public void draw(){
        System.out.print("Line Drawn: ");
        System.out.print(point1+", ");
        System.out.println(point2);
    }

    // this method is called when a bean of this class is being created
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("\nInitializingBeans method called for Line.");
    }

    // this method is called when a bean of this class is about to be destroyed
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBeans method called for Line.");
    }
}
