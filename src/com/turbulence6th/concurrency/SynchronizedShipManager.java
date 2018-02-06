package com.turbulence6th.concurrency;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class SynchronizedShipManager extends RecursiveAction {
	private int start;
	private int end;

	public SynchronizedShipManager(int start, int end) {
		this.start = start;
		this.end = end;
	}

	protected void compute() {
		if (start < 0)
			return;
		else {
			int middle = start + ((end - start) / 2);
			invokeAll(new SynchronizedShipManager(start, middle), new SynchronizedShipManager(middle, end)); // m1
		}
	}

	public static void main(String[] args) {
		ForkJoinTask<?> task = new SynchronizedShipManager(0, 4); // m2
		ForkJoinPool pool = new ForkJoinPool();
		Object result = pool.invoke(task); // m3
	}
}