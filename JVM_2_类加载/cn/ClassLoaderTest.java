package com.one.cn;

public class ClassLoaderTest {
  public static void main(String[] args) {
	  //��ȡϵͳ�������
	ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
	System.out.println(systemClassLoader);
	//��ӡϵͳ���ض�������ã�ǰ�������ͣ������Ǳ�ʾ�ľ���ֵ
	//sun.misc.Launcher$AppClassLoader@e2f2a
	
	//��ȡ���ϲ㣺��չ������
	ClassLoader exClassLoader = systemClassLoader.getParent();
	System.out.println(exClassLoader);
	//sun.misc.Launcher$ExtClassLoader@139a55
	
	
	//��ȡ���ϲ�,��ȡ���������������
	ClassLoader bootstrapClassLoader = exClassLoader.getParent();
	System.out.println(bootstrapClassLoader);//null
	
	
	//�û��Զ����ࣺĬȻʹ��ϵͳ����������м���
	ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
	System.out.println(classLoader);
	//sun.misc.Launcher$AppClassLoader@e2f2a
	
	
	//string��ʹ����������������м��أ�java�ĺ�����ⶼ��ʹ����������������м���
	ClassLoader classLoader1 = String.class.getClassLoader();
	System.out.println(classLoader1);//null
}
}
