package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class ConcreteSubject implements Subject
{

	private List<Observer> list = new ArrayList();

	public ConcreteSubject()
	{

	}

	@Override
	public void add(Observer observer)
	{

		list.add(observer);
	}

	@Override
	public void remove(Observer observer)
	{
		list.remove(observer);
	}

	@Override
	public void notify(String message)
	{
		for (Observer observer : list)
		{
			observer.update(message);
		}

	}
}
