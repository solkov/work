package ru.solkov;

import java.util.ArrayList;
import java.util.List;
import ru.solkov.Task;

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		List<Runnable> lst = new ArrayList<Runnable>();
		for (Long i = 1l; i < 50l; i++) {
			Runnable t = new Task(i*5, i);
			lst.add(t);
			Thread tr = new Thread(t);
			tr.start();
			
		}

	}

}
