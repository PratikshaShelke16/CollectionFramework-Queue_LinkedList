package CollectionFramework.Queue;

import java.util.LinkedList;

public class Task3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println("Initial Queue :"+l);
		System.out.println("Size of Queue :"+l.size());
		System.out.println("Checking queue is empty or not :"+l.isEmpty());
		l.addFirst(0);
		l.addLast(6);
		System.out.println("After adding first as 0 and last as 6 :"+l);
		System.out.println("Checking 3 is present is queue or not :"+l.contains(3));
		l.remove(3);
		System.out.println("After Removing 3 :"+l);
		l.clear();
		System.out.println("Removing all element in the queue :"+l);
		
	}

}
