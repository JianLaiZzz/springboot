package Observer;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public interface Subject
{
	public void add(Observer observer);

	public void remove(Observer observer);

	public void notify(String message);
}
