package Phase1.coreJava.thread;

public class SleepThread extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName() + " :" +i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SleepThread t1 = new SleepThread();
		t1.setName("Java");
		t1.setPriority(MAX_PRIORITY);
		
		SleepThread t2 = new SleepThread();
		t2.setName("Python");
		
		SleepThread t3 = new SleepThread();
		t3.setName("Oracle");
		
		SleepThread t4 = new SleepThread();
		t4.setName("C++");
		
		t1.start();
		t2.start();
		t3.start();
		t3.start();
		
		System.out.println(t1.getState());
		System.out.println(t3.getState());
		System.out.println(t2.getState());
	}

	

}
