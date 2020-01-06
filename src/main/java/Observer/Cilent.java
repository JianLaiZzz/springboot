package Observer;

/**
 * @author: zhw
 * @createDate: 2020/1/6
 */
public class Cilent
{
	public static void main(String args[])
	{

        /**
         * 事件源：负责产生事件的对象。比如我们常见的按钮，按钮就是一个事件源，能够产生“点击”这个事件
         * 事件监听器（事件处理器）：负责处理事件的对象
         * 事件：或者称为事件对象，是事件源和事件监听器之间的信息桥梁。是整个事件模型驱动的核心
         *
         *
         * Observer观察者，即为事件模型中的事件监听器，
         * Subject被观察者，即事件模型中的事件源
         */


	    ConcreteObserver concreteObserver1=new ConcreteObserver("zhw");
        ConcreteObserver concreteObserver2=new ConcreteObserver("lishi");

		ConcreteSubject concreteSubject = new ConcreteSubject();
		concreteSubject.add(concreteObserver1);
		concreteSubject.add(concreteObserver2);

		concreteSubject.notify("通知你们了");

	}
}
