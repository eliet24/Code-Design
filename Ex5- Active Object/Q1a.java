package test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q1a {
	
	ExecutorService es;
	
	public Q1a() {
		es=Executors.newSingleThreadExecutor();
	}

	
	public void close(){
		es.shutdown();
	}
	
	// implement threadIt() method here
	
}
