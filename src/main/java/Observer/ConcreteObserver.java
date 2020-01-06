package Observer;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class ConcreteObserver implements Observer
{

	private String name;

	public ConcreteObserver(String name)
	{
		this.name = name;
	}

	@Override
	public void update(String mess)
	{
		System.out.println(this.name+":"+ mess);

	}
}
