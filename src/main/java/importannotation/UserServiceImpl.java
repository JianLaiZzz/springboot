package importannotation;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class UserServiceImpl implements UserService
{
	@Override
	public int save(User user)
	{
        System.out.println("调用了当前方法");
		return 0;
	}
}
