package com.one.cn;

public class ClassLoaderTest {
  public static void main(String[] args) {
	  //获取系统类加载器
	ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
	System.out.println(systemClassLoader);
	//打印系统加载对象的引用，前面是类型，后面是表示的具体值
	//sun.misc.Launcher$AppClassLoader@e2f2a
	
	//获取其上层：扩展加载器
	ClassLoader exClassLoader = systemClassLoader.getParent();
	System.out.println(exClassLoader);
	//sun.misc.Launcher$ExtClassLoader@139a55
	
	
	//获取其上层,获取不到引导类加载器
	ClassLoader bootstrapClassLoader = exClassLoader.getParent();
	System.out.println(bootstrapClassLoader);//null
	
	
	//用户自定义类：默然使用系统类加载器进行加载
	ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
	System.out.println(classLoader);
	//sun.misc.Launcher$AppClassLoader@e2f2a
	
	
	//string类使用引导类加载器进行加载，java的核心类库都是使用引导类加载器进行加载
	ClassLoader classLoader1 = String.class.getClassLoader();
	System.out.println(classLoader1);//null
}
}
