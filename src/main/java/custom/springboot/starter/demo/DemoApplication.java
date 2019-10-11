package custom.springboot.starter.demo;

import custom.springboot.starter.demo.component.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student.getLoginName());
    }

}
