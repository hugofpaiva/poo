package aula10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class Ex10_1 {
	
	public static void main(String[] args) {
		String string = ("Hello Word");
		HashMap<Character, Set<Integer>> palavras = new HashMap<Character, Set<Integer>>();
        for (int i = 0 ; i<string.length() ; i++)
            if (string.charAt(i) != ' ' ) {
            	Set<Integer> d = new HashSet<Integer>();
            	if(palavras.containsKey(string.charAt(i))){
            		d=palavras.get(string.charAt(i));
            		
            	}
            	d.add(string.indexOf(string.charAt(i), i));
            	palavras.put(string.charAt(i), d);
            		
            		
        		
            	}
        System.out.println(palavras);
        
        	
        
	}

}
