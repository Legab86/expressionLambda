package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date {
//	private int jour, mois, annee;
	
	public static void main(String[] args) {
		
		LocalDateTime noww = LocalDateTime.now();
		System.out.println(noww);
		
		LocalDate aujourdhui = LocalDate.now();
		System.out.println("aujourdhui");
		
		LocalTime nowt=LocalTime.now();
		System.out.println(nowt);
		
	}

}
