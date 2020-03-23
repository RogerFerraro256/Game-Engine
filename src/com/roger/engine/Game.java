package com.roger.engine;

public class Game implements Runnable {

	public static int width = 300;
	public static int height = width / 16 * 9;
	public static int scale = 3;

	private Thread thread;
	private boolean running = false;

	// synchronized = prevent problems
	public synchronized void start() {
		thread = new Thread(this, "Display");
		thread.start();
	}

	public synchronized void stop() {
		try {
			thread.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	
	public void run() {
		
	}

}
