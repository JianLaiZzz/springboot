package importannotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(UserImportSelector.class)
public @interface EnableUserService
{

    String name ();
}
