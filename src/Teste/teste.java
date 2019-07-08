package Teste;

import java.util.*;


public class teste {
	public static void main(String[] args) {
		int x, y;
		double z;
		x = 5;
		y = x++;
		System.out.println(y);
		System.out.println(x);
		y = ++x;
		System.out.println(y);
		System.out.println(x);
		System.out.println(y / 3);
		System.out.println(y % 3);
		z = 12.0 / y;
		boolean sim = 5 > 5;
		System.out.println(sim);
		double muitos[] = new double[5];
		System.out.println(muitos[1]);

		char code = 'F';
		boolean c = (code >= 'M') && (code <= 'Z');
		System.out.println(c);

		Map<String, Map<Integer, String>> ok1 = new HashMap<>();

//		static <K,V extends Comparable<? super V>>
//		SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
//		    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
//		        new Comparator<Map.Entry<K,V>>() {
//		            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
//		                int res = e1.getValue().compareTo(e2.getValue());
//		                return res != 0 ? res : 1;
//		            }
//		        }
//		    );
//		    sortedEntries.addAll(map.entrySet());
//		    return sortedEntries;
//		}

		Map<String, Integer> orderMappings = new HashMap<>(ordenar1);

		orderMappings.put("Sunday", 1);
		orderMappings.put("Monday", 2);
		orderMappings.put("Tuesday", 3);
		orderMappings.put("Wednesday", 4);
		orderMappings.put("Thursday", 5);
		orderMappings.put("Friday", 6);
		orderMappings.put("Saturday", 7);

		Comparator<String> ordenar1 = new Comparator<String>() {

			@Override
			public int compare(String key1, String key2) {
				int p1 = orderMappings.get(key1);
				int p2 = orderMappings.get(key2);
				return p1 - p2;
			}

		};

	}
}
