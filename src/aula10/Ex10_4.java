package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex10_4 {
	public static void main(String[] args) throws IOException{ 
		Scanner input = new Scanner(new FileReader("words.txt")); 
		ArrayList<String> palavras = new ArrayList<String>();
		ArrayList<String> palavrass = new ArrayList<String>();
		while (input.hasNext()) {
			String word = input.next();
			int d = 0;
			for (int i = 0 ; i<word.length() ; i++) {
				d+=1;
			}
			if(d>2) {
				palavras.add(word);
			}
				
			if(word.charAt(word.length()-1)=='s'){
				palavrass.add(word);
				
			}
		for (int i = 0 ; i<word.length() ; i++) {
			if(!Character.isLetter(word.charAt(i))) {
				palavras.remove(word);
				
					
				}
			 
			}
		System.out.println(word);
		}
		
		System.out.println(palavras);
		System.out.println(palavrass);
		
				
				
			}
		}


