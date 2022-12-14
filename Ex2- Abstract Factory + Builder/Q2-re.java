package test;

public class Q2 
{

	public abstract class A
	{ 
		public abstract String get();  
	}
	
	public class A1 extends A
	{ 
		public String get(){return "a1";} 
	}
	
	public class A2 extends A
	{ 
		public String get(){return "a2";}  
	}
	
	public abstract class B
	{ 
		public abstract String get(); 
	}
	
	public class B1 extends B
	{ 
		public String get(){return "b1";}
	}
	
	public class B2 extends B
	{ 
		public String get(){return "b2";}
	}
	
	public interface AbstractFactory
	{		
		A createA();
		B createB();
	}
	
	// מכאן ואילך עליכם להשלים את הקוד
	public class AbstractFactory1 implements AbstractFactory
	{

		@Override
		public A1 createA() {
			// TODO Auto-generated method stub
			return new A1();
		}

		@Override
		public B createB() {
			// TODO Auto-generated method stub
			return new B1();
		}
		
		
	}
	
	public class AbstractFactory2 implements AbstractFactory
	{

		@Override
		public A createA() {
			// TODO Auto-generated method stub
			return new A2();
		}

		@Override
		public B createB() {
			// TODO Auto-generated method stub
			return new B2();
		}
		
	}

}

