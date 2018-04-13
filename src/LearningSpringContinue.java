import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

// this class is continuation of LearningSpring class
public class LearningSpringContinue {
    public static void main(String args[]){

        //example of bean factory post processor
        AbstractApplicationContext abstractContext = new FileSystemXmlApplicationContext("src/xml/autowire_example.xml");
        Line line = (Line) abstractContext.getBean("autowired_line");
        line.draw();
    }
}
