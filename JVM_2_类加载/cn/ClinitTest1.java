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
		//s���ȼ���father����μ���son��
		System.out.println(Son.B);//���Ϊ2
	}*/
	
	/*private static int num = 1;
	static {//��������¸�ֵ
		num = 2;
		number = 20;
	}
	private static int number = 10;
	public static void main(String[] args) {
		System.out.println(ClinitTest1.num);
		System.out.println(ClinitTest1.number);
	}*/
	/*
	 * num���Ϊ2  ��ʼ��ֵΪ1�����¸�ֵΪ2
	 * number ���Ϊ10 ��ʼ��ֵΪ20��Ȼ��10����
	 */
	public static void main(String[] args) {
		Runnable r = ()-> {
			System.out.println(Thread.currentThread().getName()+"��ʼ");
			DeadThread dead = new DeadThread();
			System.out.println(Thread.currentThread().getName()+"����");
		};
		
		Thread t1 = new Thread(r,"�߳�1");
		Thread t2 = new Thread(r,"�߳�2");
		t1.start();
		t2.start();
		/*һ����ֻ�ᱻ����һ�Σ�
		 * �߳�1��ʼ
                           �߳� 2��ʼ
                           �߳�1��ʼ��
		 */
	}
	
}
class DeadThread{
	static{
		if(true){
			System.out.println(Thread.currentThread().getName()+"��ʼ��");
			while(true){
				
			}
		}
	}
}
