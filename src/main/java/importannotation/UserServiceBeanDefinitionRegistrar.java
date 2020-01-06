package importannotation;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Set;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class UserServiceBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar
{
	/**
	 * 通过BeanDefinitionRegistry
	 *
	 * 就可以拿到目前所有注册的BeanDefinition，然后可以对这些BeanDefinition进行额外的修改或增强。
	 * 
	 * @param importingClassMetadata
	 * @param registry
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
			BeanDefinitionRegistry registry)
	{

		Set<String> set = importingClassMetadata.getAnnotationTypes();
		for (String S : set)
		{
			System.out.println("注解"+S);
		}

		BeanDefinitionBuilder userService = BeanDefinitionBuilder
				.rootBeanDefinition(UserServiceImpl.class);
		//通过registry就可以注入到容器里啦
		registry.registerBeanDefinition("userService", userService.getBeanDefinition());

	}
}
