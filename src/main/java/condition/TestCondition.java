package condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class TestCondition implements Condition
{
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata)
	{
		return false;
	}
}
