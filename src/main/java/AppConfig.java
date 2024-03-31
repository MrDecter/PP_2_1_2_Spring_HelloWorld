import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");

        return helloWorld;
    }

    // Создание бина, который каждый раз создается, при его вызове
    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        return new Cat();
    }
}