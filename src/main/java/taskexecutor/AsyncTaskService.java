package taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: zhw
 * @createDate: 2020/1/4
 */
@Service
public class AsyncTaskService
{

	@Async
	public void executeAsyncTask(Integer i)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("执行异步任务: " + i);
	}

	@Async
	public void executeAsyncTaskPlus(Integer i)
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("执行异步任务+1: " + (i + 1));
	}

}
