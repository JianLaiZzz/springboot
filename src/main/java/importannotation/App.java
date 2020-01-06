package importannotation;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class App
{
    public static void main(String args[])
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);

        UserService userService= (UserService) context.getBean(UserServiceImpl.class);
        userService.save(new User());
    }
}
