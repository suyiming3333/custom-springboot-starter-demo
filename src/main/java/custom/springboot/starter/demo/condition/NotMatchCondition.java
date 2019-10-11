package custom.springboot.starter.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: NotMatchCondition
 * @Package custom.springboot.starter.demo.condition
 * @Description: TODO
 * @date 2019/10/11 23:44
 */
public class NotMatchCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return false;
    }
}
