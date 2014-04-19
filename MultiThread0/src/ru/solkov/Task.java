package ru.solkov;

public class Task implements Runnable{
	
	public Task(Long value, Long threadNum) {
		super();
		Value = value;
		ThreadNum = threadNum;
	}

	public static volatile Long Value;
	public Long ThreadNum;

	public void run() {
		// TODO Auto-generated method stub
		Long i = 0l;
		while (i < 500){
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
							e.printStackTrace();
			}
			System.out.println("Thread # "+ThreadNum+" ,value="+Value);
			i++;
			Value++;
		}
		
	
	}

}
