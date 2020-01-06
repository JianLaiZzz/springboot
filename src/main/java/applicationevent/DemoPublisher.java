package applicationevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author: zhw
 * @createDate: 2020/1/4
 */
@Component
public class DemoPublisher
{
    @Autowired
    ApplicationContext applicationContext;

    public  void  publisher()
    {
        applicationContext.publishEvent(new DemoEvenet(this,"hehhe"));
    }
}
