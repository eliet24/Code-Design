package test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q1 {

	public class Ring<E> extends LinkedList<E>{

		public class RingIterator implements Iterator<E>{

			ListIterator <E> it;
			public RingIterator() {
			    this.it=listIterator();
			}

			@Override
			public boolean hasNext() {
			    return true;
			}

			@Override
			public E next() {
			     if((this.it.hasNext())==false)
		            this.it=listIterator();
			    return this.it.next();
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
