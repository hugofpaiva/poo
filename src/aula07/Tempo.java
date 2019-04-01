package aula07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tempo {
	private int hi,mi,si,hf,mf,sf;
	
	public Tempo() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH,mm,ss");
	    LocalDateTime now = LocalDateTime.now();
	    hi = Integer.parseInt(dtf.format(now).split(",")[0]);
	    mi = Integer.parseInt(dtf.format(now).split(",")[1]);
	    si = Integer.parseInt(dtf.format(now).split(",")[2]);

	}
	
	;
    

}
