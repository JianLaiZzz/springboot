package ClassLoader;

import java.util.List;

/**
 * @author: zhw
 * @createDate: 2020/1/7
 */
public class ClassLoaderTest {
//    public static void main(String args[])
//    {
//		//获得加载ClassLoaderTest.class这个类的类加载器
//		ClassLoader loader = ClassLoaderTest.class.getClassLoader();
//		while (loader != null)
//		{
//			System.out.println(loader);
//			loader = loader.getParent(); //获得父类加载器的引用
//		}
//		System.out.println(loader);
//    }

	public static void main(String[] args){

		ClassLoaderTest.class.getResource("");

		//输出ClassLoaderText的类加载器名称
		System.out.println("ClassLoaderText类的加载器的名称:"+ClassLoaderTest.class.getClassLoader().getClass().getName());
		System.out.println("System类的加载器的名称:"+System.class.getClassLoader());
		System.out.println("List类的加载器的名称:"+ List.class.getClassLoader());

		for (int i=0;i<3;i++){

			 System.out.println();
		}

		ClassLoader cl = ClassLoaderTest.class.getClassLoader();
		while(cl != null){
			System.out.print(cl.getClass().getName()+"->");
			cl = cl.getParent();
		}
		System.out.println(cl);
	}
}
