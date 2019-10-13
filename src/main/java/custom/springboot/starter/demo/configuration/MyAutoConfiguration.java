package custom.springboot.starter.demo.configuration;

import custom.springboot.starter.demo.component.*;
import custom.springboot.starter.demo.condition.MatchCondition;
import custom.springboot.starter.demo.condition.NotMatchCondition;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MyAutoConfiguration
 * @Package custom.springboot.starter.demo.configuration
 * @Description: TODO
 * @date 2019/10/11 22:33
 */

@Configuration
@EnableConfigurationProperties(MyProperties.class)
//@Import(TeacherAutoConfiguration.class)
@AutoConfigureAfter({StudentAutoConfiguration.class,TeacherAutoConfiguration.class})
public class MyAutoConfiguration {
    public MyAutoConfiguration() {
        System.out.println("加载MyAutoConfiguration");
    }

    /**
     * ConditionalOnBean 只有当所有Configuration都加载完整之后
     * 才会去创建bean,此处Teacher的bean还没有创建，所以student也没能创建，
     * 可以改成@ConditionalOnClass 或者 @Import(TeacherAutoConfiguration.class)
     * @param myProperties
     * @return
     */
//    @Bean
//    @ConditionalOnBean({Teacher.class})
//    public Student student(MyProperties myProperties) {
//        Student student = new Student(myProperties.getLoginName());
//        return student;
//    }

    @Bean
    @Conditional(MatchCondition.class)
    public MatchBean matchBean(){
        return new MatchBean();
    }

    @Bean
    @Conditional(NotMatchCondition.class)
    public NotMatchBean notMatchBean(){
        return new NotMatchBean();
    }
}
