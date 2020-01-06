package applicationevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author: zhw
 * @createDate: 2020/1/4
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvenet>
{
	@Override
	public void onApplicationEvent(DemoEvenet event)
	{
		String msg = event.getMsag();
		System.out.println("我接受到了" + msg);

	}
}
