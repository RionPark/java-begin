package java20;

import java.util.Random;

class ThreadTest extends Thread{
	private int i;
	public ThreadTest(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		System.out.println("이 쓰레드는 " + i + "번째!");
	}
}

class RunnableTest implements Runnable{
	private int i;
	public RunnableTest(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		System.out.println("이 쓰레드는 " + i + "번째!");
	}
}

public class Test {
	public static Integer count =0;
	public static void main(String[] args) {
		System.out.println("thread 시작!");
		for(int i = 0 ; i < 20 ; i++ ){
			Runnable r = new RunnableTest(i);
			Thread test = new Thread(r);
			test.start(); 
		}
		System.out.println("thread 종료!"); 
	}

}
