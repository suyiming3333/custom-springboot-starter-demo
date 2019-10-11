package custom.springboot.starter.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author suyiming3333@gmail.com
 * @version V1.0
 * @Title: MatchCondition
 * @Package custom.springboot.starter.demo.condition
 * @Description: TODO
 * @date 2019/10/11 23:43
 */
public class MatchCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return true;
    }
}
