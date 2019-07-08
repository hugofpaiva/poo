package Andre;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionTester {

	public static void main(String[] args) {
		Collection<Integer> al = new ArrayList<>();
		Collection<Integer> ll = new LinkedList<>();
		Collection<Integer> hs = new HashSet<>();
		Collection<Integer> ts = new TreeSet<>();
		String[] a = new String[3];
		a[0]="add";
		a[1]="search";
		a[2]="remove";
		System.out.printf("Collection\t1000\t5000\t10000\t20000\t40000\t100000\n");
		System.out.printf("%-10s\n","ArrayList");
		//ArrayList
		for(int i=0; i<=2; i++) {
			System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n",a[i],checkPerformance(al, 1000, i), checkPerformance(al, 5000, i), checkPerformance(al, 10000, i), checkPerformance(al, 20000, i), checkPerformance(al, 40000, i), checkPerformance(al, 100000, i));
		}
		
		/*
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search",checkPerformance(al, 1000)[1], checkPerformance(al, 5000)[1], checkPerformance(al, 10000)[1], checkPerformance(al, 20000)[1], checkPerformance(al, 40000)[1], checkPerformance(al, 100000)[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove",checkPerformance(al, 1000)[2], checkPerformance(al, 5000)[2], checkPerformance(al, 10000)[2], checkPerformance(al, 20000)[2], checkPerformance(al, 40000)[2], checkPerformance(al, 100000)[2]);
		System.out.printf("%-10s\n","LinkedList");
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add",checkPerformance(ll, 1000)[0], checkPerformance(ll, 5000)[0], checkPerformance(ll, 10000)[0], checkPerformance(ll, 20000)[0], checkPerformance(ll, 40000)[0], checkPerformance(ll, 100000)[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search",checkPerformance(ll, 1000)[1], checkPerformance(ll, 5000)[1], checkPerformance(ll, 10000)[1], checkPerformance(ll, 20000)[1], checkPerformance(ll, 40000)[1], checkPerformance(ll, 100000)[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove",checkPerformance(ll, 1000)[2], checkPerformance(ll, 5000)[2], checkPerformance(ll, 10000)[2], checkPerformance(ll, 20000)[2], checkPerformance(ll, 40000)[2], checkPerformance(ll, 100000)[2]);
		System.out.printf("%-10s\n","HashSet");
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add",checkPerformance(hs, 1000)[0], checkPerformance(hs, 5000)[0], checkPerformance(hs, 10000)[0], checkPerformance(hs, 20000)[0], checkPerformance(hs, 40000)[0], checkPerformance(hs, 100000)[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search",checkPerformance(hs, 1000)[1], checkPerformance(hs, 5000)[1], checkPerformance(hs, 10000)[1], checkPerformance(hs, 20000)[1], checkPerformance(hs, 40000)[1], checkPerformance(hs, 100000)[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove",checkPerformance(hs, 1000)[2], checkPerformance(hs, 5000)[2], checkPerformance(hs, 10000)[2], checkPerformance(hs, 20000)[2], checkPerformance(hs, 40000)[2], checkPerformance(hs, 100000)[2]);
		System.out.printf("%-10s\n","TreeSet");
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","add",checkPerformance(ts, 1000)[0], checkPerformance(al, 5000)[0], checkPerformance(al, 10000)[0], checkPerformance(al, 20000)[0], checkPerformance(al, 40000)[0], checkPerformance(al, 100000)[0]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","search",checkPerformance(al, 1000)[1], checkPerformance(al, 5000)[1], checkPerformance(al, 10000)[1], checkPerformance(al, 20000)[1], checkPerformance(al, 40000)[1], checkPerformance(al, 100000)[1]);
		System.out.printf("%-10s\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n","remove",checkPerformance(al, 1000)[2], checkPerformance(al, 5000)[2], checkPerformance(al, 10000)[2], checkPerformance(al, 20000)[2], checkPerformance(al, 40000)[2], checkPerformance(al, 100000)[2]);*/
	}
	private static double checkPerformance(Collection<Integer> col, int DIM, int action) {
		double start, stop, delta;
		double[] time = new double[3];
		time[0]=0;
		time[1]=0;
		time[2]=0;
		// Add
		if(action==0) {
			start = System.nanoTime(); // clock snapshot before
			for(int i=0; i<DIM; i++ )
			col.add( i );
			stop = System.nanoTime(); // clock snapshot after
			delta = (stop-start)/1e6; // convert to milliseconds
			time[0]=delta;
		}
		// Search
		if(action==1) {
			start = System.nanoTime(); // clock snapshot before
			for(int i=0; i<DIM; i++ ) {
			int n = (int) (Math.random()*DIM);
			if (!col.contains(n))
			System.out.println("Not found???"+n);
			}
			stop = System.nanoTime(); // clock snapshot after
			delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
			//System.out.println(col.size()+ ": Search to " +
			//col.getClass().getSimpleName() +" took " + delta + "ms");
			time[1]=delta;
		}
		// Remove
		if(action==2) {
			start = System.nanoTime(); // clock snapshot before
			Iterator<Integer> iterator = col.iterator();
			while (iterator.hasNext()) {
			 iterator.next();
			 iterator.remove();
			}
			stop = System.nanoTime(); // clock snapshot after
			delta = (stop-start)/1e6; // convert nanoseconds to milliseconds
			//System.out.println(col.size() + ": Remove from "+
			//col.getClass().getSimpleName() +" took " + delta + "ms");
			time[2]=delta;
		}
		
		return time[action];
	}

}
