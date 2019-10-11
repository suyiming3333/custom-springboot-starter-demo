package custom.springboot.starter.demo.configuration;

import custom.springboot.starter.demo.component.School;
import custom.springboot.starter.demo.component.Teacher;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: TeacherAutoConfiguration
 * @Package custom.springboot.starter.demo.configuration
 * @Description: TODO
 * @date 2019/10/11 22:36
 */

@Configuration
public class TeacherAutoConfiguration {

    public TeacherAutoConfiguration() {
        System.out.println("加载TeacherAutoConfiguration");
    }

    @Bean
    @ConditionalOnClass({Teacher.class, School.class})
    public static Teacher teacher() {
        return new Teacher();
    }
}
