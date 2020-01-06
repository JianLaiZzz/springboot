package importannotation;

import org.springframework.context.annotation.Configuration;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
@Configuration

//@Import(UserServiceImpl.class)
//@Import(UserServiceBeanDefinitionRegistrar.class)
@EnableUserService(name="zhw")
public class Config
{
    /**
     * ImportBeanDefinitionRegistrar的方式同样可以自定义注解然后注入我们需要的类。
     * 必竟ImportBeanDefinitionRegistrar这种方式从灵活性上来说应该是最全的。
     */
}
