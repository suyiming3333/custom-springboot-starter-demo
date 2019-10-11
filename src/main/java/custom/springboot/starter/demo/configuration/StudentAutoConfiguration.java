package custom.springboot.starter.demo.configuration;

import custom.springboot.starter.demo.component.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: StudentAutoConfiguration
 * @Package custom.springboot.starter.demo.configuration
 * @Description: TODO
 * @date 2019/10/11 22:38
 */

@Configuration
public class StudentAutoConfiguration {

    public StudentAutoConfiguration() {
        System.out.println("加载StudentAutoConfiguration");
    }

    @Bean
    @ConditionalOnMissingBean
    public Student student(@Autowired MyProperties myProperties) {
        return new Student(myProperties.getLoginName());
    }


}
