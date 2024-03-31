import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Objects;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        System.out.println(Objects.equals(bean1, bean2));

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getName());

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getName());

        System.out.println(Objects.equals(bean3, bean4));

    }
}