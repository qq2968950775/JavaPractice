package com.one.cn;

public class ClinitTest1 {

	/*static class Father {
		public static int A = 1;

		static {
			A = 2;
		}
	}

	static class Son extends Father {
		public static int B = A;
	}

	public static void main(String[] args) {
		//s首先加载father类其次加载son类
		System.out.println(Son.B);//结果为2
	}*/
	
	/*private static int num = 1;
	static {//这个是重新赋值
		num = 2;
		number = 20;
	}
	private static int number = 10;
	public static void main(String[] args) {
		System.out.println(ClinitTest1.num);
		System.out.println(ClinitTest1.number);
	}*/
	/*
	 * num结果为2  开始赋值为1，重新赋值为2
	 * number 结果为10 开始赋值为20，然后10覆盖
	 */
	public static void main(String[] args) {
		Runnable r = ()-> {
			System.out.println(Thread.currentThread().getName()+"开始");
			DeadThread dead = new DeadThread();
			System.out.println(Thread.currentThread().getName()+"结束");
		};
		
		Thread t1 = new Thread(r,"线程1");
		Thread t2 = new Thread(r,"线程2");
		t1.start();
		t2.start();
		/*一个类只会被加载一次，
		 * 线程1开始
                           线程 2开始
                           线程1初始化
		 */
	}
	
}
class DeadThread{
	static{
		if(true){
			System.out.println(Thread.currentThread().getName()+"初始化");
			while(true){
				
			}
		}
	}
}
