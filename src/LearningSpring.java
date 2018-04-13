import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LearningSpring {
    public static void main(String args[]){
        // create a bean factory that will take its configuration from an XML file (spring.xml)
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/xml/spring.xml"));
        // request a bean from the bean factory with id "triangle"
        Triangle triangle = (Triangle) factory.getBean("triangle");
        triangle.draw();

        // Application Context can also be used instead of bean factory to do the same thing
        // for the constructor in next statement, file("spring.xml") should be in src folder
        ApplicationContext context = new FileSystemXmlApplicationContext("src/xml/spring.xml");
        triangle = (Triangle) context.getBean("equilateral_triangle");
        triangle.draw();

        // example of constructor injection
        triangle = (Triangle)context.getBean("constructor_injected_triangle");
        triangle.draw();

        // example of object injection
        context = new FileSystemXmlApplicationContext("src/xml/object_injection.xml");
        // getting a bean using its alias
        Line line = (Line) context.getBean("line-alias");
        line.draw();

        // example of autowiring
        context = new FileSystemXmlApplicationContext("src/xml/autowire_example.xml");
        line = (Line) context.getBean("autowired_line");
        line.draw();

        // checking the default singleton scope of the bean
        Point tempPoint = new Point();
        tempPoint.setX(30);
        tempPoint.setY(30);
        line.setPoint1(tempPoint);
        line = (Line) context.getBean("autowired_line");
        line.draw();

        // example of bean definition inheritance and life cycle callbacks
        AbstractApplicationContext abstractContext =  new FileSystemXmlApplicationContext("src/xml/bean_definition_inheritance.xml");
        // register the shutdown hook so that,
        // appropriate method is called when the bean is about to be destroyed
        abstractContext.registerShutdownHook();
        line = (Line) abstractContext.getBean("child_line");
        line.draw();

        // example of using own callback methods
        abstractContext = new FileSystemXmlApplicationContext("src/xml/spring.xml");
        abstractContext.registerShutdownHook(); // for calling callback method for destroy
        triangle = (Triangle) abstractContext.getBean("callback_triangle");
        triangle.draw();
    }
}
