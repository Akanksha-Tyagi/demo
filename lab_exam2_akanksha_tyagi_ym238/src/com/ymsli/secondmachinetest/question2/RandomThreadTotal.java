package com.ymsli.secondmachinetest.question2;

import java.util.Random;

public class RandomThreadTotal implements Runnable {

	Random r = new Random();

	int number;

	public void run() {

		number = r.nextInt(10) + 1;

	}

	int getNumber() {

		return number;

	}

	public static void main(String args[]) throws InterruptedException {

		// first make 5 threads of classs tha implement runnable

		RandomThreadTotal randomThread1 = new RandomThreadTotal();

		RandomThreadTotal randomThread2 = new RandomThreadTotal();

		RandomThreadTotal randomThread3 = new RandomThreadTotal();

		RandomThreadTotal randomThread4 = new RandomThreadTotal();

		RandomThreadTotal randomThread5 = new RandomThreadTotal();

		// then create threads of Threads class in which pass the above corresponding
		// thread object in its constructor

		Thread thread1 = new Thread(randomThread1);

		Thread thread2 = new Thread(randomThread2);

		Thread thread3 = new Thread(randomThread3);

		Thread thread4 = new Thread(randomThread4);

		Thread thread5 = new Thread(randomThread5);
		//first start the mthreads  by calling start methods threads got registered.

		thread1.start();

		thread2.start();

		thread3.start();

		thread4.start();

		thread5.start();

		// then calling join
		
		thread1.join();

		thread2.join();

		thread3.join();

		thread4.join();

		thread5.join();

		System.out.println("rt1: " + randomThread1.getNumber());

		System.out.println("rt2: " + randomThread2.getNumber());

		System.out.println("rt3: " + randomThread3.getNumber());

		System.out.println("rt4: " + randomThread4.getNumber());

		System.out.println("rt5: " + randomThread5.getNumber());

		int total = 0;

		total = total + randomThread1.getNumber();

		total = total + randomThread2.getNumber();

		total = total + randomThread3.getNumber();

		total = total + randomThread4.getNumber();

		total = total + randomThread5.getNumber();

		System.out.println("Total: " + total);

	}

}