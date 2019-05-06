package aula09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ex9_2 {
	public static void main(String[] args) {
		System.out.printf("%-5s\t%d\t%d\t%d\t%d\t%d\t%d\n","Collection", 1000, 5000, 10000, 20000, 40000, 100000);
		//ArrayList
		System.out.println("ArrayList");
	
		Collection<Integer> col = new ArrayList<>();
		double[] mil = checkPerformance(col, 1000);
		double[] cincomil = checkPerformance(col, 5000);
		double[] dezmil = checkPerformance(col, 10000);
		double[] vintemil = checkPerformance(col, 20000);
		double[] quarentamil = checkPerformance(col, 40000);
		double[] cemmil = checkPerformance(col, 100000);
		
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add", mil[0], cincomil[0], dezmil[0], vintemil[0], quarentamil[0], cemmil[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search", mil[1], cincomil[1], dezmil[1], vintemil[1], quarentamil[1], cemmil[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove", mil[2], cincomil[2], dezmil[2], vintemil[2], quarentamil[2], cemmil[2]);
		
		//LinkedList
		System.out.println("LinkedList");
		
		col = new LinkedList<>();
		mil = checkPerformance(col, 1000);
		cincomil = checkPerformance(col, 5000);
		dezmil = checkPerformance(col, 10000);
		vintemil = checkPerformance(col, 20000);
		quarentamil = checkPerformance(col, 40000);
		cemmil = checkPerformance(col, 100000);
		
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add", mil[0], cincomil[0], dezmil[0], vintemil[0], quarentamil[0], cemmil[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search", mil[1], cincomil[1], dezmil[1], vintemil[1], quarentamil[1], cemmil[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove", mil[2], cincomil[2], dezmil[2], vintemil[2], quarentamil[2], cemmil[2]);
		
		//HashSet
		System.out.println("HashSet");
				
		col = new HashSet<>();
		mil = checkPerformance(col, 1000);
		cincomil = checkPerformance(col, 5000);
		dezmil = checkPerformance(col, 10000);
		vintemil = checkPerformance(col, 20000);
		quarentamil = checkPerformance(col, 40000);
		cemmil = checkPerformance(col, 100000);
				
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add", mil[0], cincomil[0], dezmil[0], vintemil[0], quarentamil[0], cemmil[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search", mil[1], cincomil[1], dezmil[1], vintemil[1], quarentamil[1], cemmil[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove", mil[2], cincomil[2], dezmil[2], vintemil[2], quarentamil[2], cemmil[2]);
		
		//TreeSet
		System.out.println("TreeSet");
				
		col = new TreeSet<>();
		mil = checkPerformance(col, 1000);
		cincomil = checkPerformance(col, 5000);
		dezmil = checkPerformance(col, 10000);
		vintemil = checkPerformance(col, 20000);
		quarentamil = checkPerformance(col, 40000);
		cemmil = checkPerformance(col, 100000);
				
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add", mil[0], cincomil[0], dezmil[0], vintemil[0], quarentamil[0], cemmil[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search", mil[1], cincomil[1], dezmil[1], vintemil[1], quarentamil[1], cemmil[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove", mil[2], cincomil[2], dezmil[2], vintemil[2], quarentamil[2], cemmil[2]);
	}
	
		
	
		private static double[] checkPerformance(Collection<Integer> col, int DIM) { 
			double start, stop, delta;
			double[] result = new double[3];
		// Add
		start = System.nanoTime(); // clock snapshot before
		for(int i=0; i<DIM; i++ ) 
			col.add( i );
		stop = System.nanoTime(); // clock snapshot after 
		delta = (stop-start)/1e6; // convert to milliseconds 
		result[0]=delta;
		//System.out.println(col.size()+ ": Add to " + col.getClass().getSimpleName() +" took " + delta + "ms"); 	
		// Search
		start = System.nanoTime(); // clock snapshot before 
		for(int i=0; i<DIM; i++ ) {
		int n = (int) (Math.random()*DIM); 
		if (!col.contains(n))
		System.out.println("Not found???"+n); 
		}
		stop = System.nanoTime(); // clock snapshot after
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds 
		//System.out.println(col.size()+ ": Search to " + col.getClass().getSimpleName() +" took " + delta + "ms");
		result[1]=delta;
		// Remove
		start = System.nanoTime(); // clock snapshot 
		Iterator<Integer> iterator = col.iterator(); 
		while (iterator.hasNext()) {
		iterator.next();
		iterator.remove(); 
		}
		stop = System.nanoTime(); // clock snapshot before
		delta = (stop-start)/1e6; // convert nanoseconds to milliseconds 
		result[2]=delta;
		//System.out.println(col.size() + ": Remove from "+ col.getClass().getSimpleName() +" took " + delta + "ms");
		return result;
	}
		

		

}
