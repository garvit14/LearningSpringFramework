import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

// A bean post processor that will display the name of the bean
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In Before Initialization method. Bean name is: "+beanName);
        // we can change the bean object before returning it.
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("In After Initialization method. Bean name is: "+beanName);
        // we can change the bean object before returning it.
        return bean;
    }
}
