package applicationevent;

import org.springframework.context.ApplicationEvent;

/**
 * @author: zhw
 * @createDate: 2020/1/4
 */
public class DemoEvenet extends ApplicationEvent
{
	/**
	 * Java事件机制包括三个部分：事件、事件监听器、事件源。
	 *
	 * 定义一个事件，然后定义监听事件的监听器，然后发布事件
	 */

	private String msag;

	public DemoEvenet(Object source, String msg)
	{
		super(source);
		this.msag = msg;
	}

	public String getMsag()
	{
		return msag;
	}

	public void setMsag(String msag)
	{
		this.msag = msag;
	}
}
