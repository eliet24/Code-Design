package test;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;

public class Q1 {

	public class Ring<E> extends LinkedList<E>{
		
		public class RingIterator implements Iterator<E>{
            
            ListIterator<E> li;
			
			public RingIterator() {
			    this.li=listIterator();
			}
			
			@Override
			public boolean hasNext() {
			    return true;
			}

			@Override
			public E next() {
			    if(!(this.li.hasNext()))
		            this.li=listIterator();
		        return this.li.next();
			}
		} // end of inner RingIterator class
		
		@Override
		public Iterator<E> iterator(){
		    return new RingIterator();
		}
	}
	
	public void APItest(){
		
		Ring<String> r=new Ring<>();
		r.add("a");
		r.add("b");
		r.add("c");
		r.add("d");
		Iterator<String> it=r.iterator();
		for(int i=0;i<r.size()+2;i++)
			System.out.print(it.next()+",");
		System.out.println(); // a,b,c,d,a,b,
	}
}	

