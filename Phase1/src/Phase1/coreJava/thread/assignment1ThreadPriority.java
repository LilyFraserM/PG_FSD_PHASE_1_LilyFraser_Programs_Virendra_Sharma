package Phase1.coreJava.thread;

public class assignment1ThreadPriority extends Thread{
	
	public void run() {
		System.out.println("running thread name: " +Thread.currentThread().getName());
		System.out.println("running thread Priority: " +Thread.currentThread().getName() +":::" + Thread.currentThread().getPriority());
		System.out.println("running thread state is: " +Thread.currentThread().getName()+":::" + Thread.currentThread().getState());
		System.out.println("running thread group is: " +Thread.currentThread().getName()+":::" + Thread.currentThread().getThreadGroup());
		System.out.println("running thread id is: " +Thread.currentThread().getName()+":::" + Thread.currentThread().getId());
		System.out.println("is my thread alive? " +Thread.currentThread().getName()+":::" + Thread.currentThread().isAlive());
		System.out.println("running thread Daemon " +Thread.currentThread().getName()+":::" + Thread.currentThread().isDaemon());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment1ThreadPriority m1 = new assignment1ThreadPriority();
		assignment1ThreadPriority m2 = new assignment1ThreadPriority();
		assignment1ThreadPriority m3 = new assignment1ThreadPriority();
		
		m1.setName("ABC");
		m2.setName("XYZ");
		m3.setName("MNP");
		
	//	m2.setDaemon(true);
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MAX_PRIORITY);
		m3.setPriority(Thread.NORM_PRIORITY);
		
		m2.setDaemon(true);

		m1.start();
		m2.start();
		m3.start();
	}

}
