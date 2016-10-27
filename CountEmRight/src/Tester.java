import java.io.*;
import java.util.*;

public class Tester {

	public static void main(String[] args) {		
		
		Scanner kbReader = new Scanner(System.in);
		String sent = "";
		
		while(!sent.equalsIgnoreCase("exit")){
			
			System.out.println("Input a sentence");
			sent = kbReader.next().toUpperCase();
			sent = sent.replace("//s*", "");
			String nO[] = sent.split("S|A");
			System.out.println(nO.length - 1);
		}
	}
}

