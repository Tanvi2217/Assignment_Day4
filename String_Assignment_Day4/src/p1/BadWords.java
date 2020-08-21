package p1;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class BadWords {
	public static void main(String args[]) {
	
	List<String> Bad_Words = new ArrayList<String>();
	
	Bad_Words.add("dog");
	Bad_Words.add("fool");
	Bad_Words.add("stupid");
	Bad_Words.add("mad");
	Bad_Words.add("dumb");
	Bad_Words.add("idiot");
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sentence:");
	String input = sc.nextLine();
	String new_input = "";
	String repeat = "";
	String[] arr = input.split(" ", 10);
	
		for (int i = 0; i< arr.length; i++) {
			String a = arr[i];
			if(Bad_Words.contains(a.toLowerCase())) {
				int temp = a.length();
				repeat = String.join("", Collections.nCopies(temp, "#"));
				arr[i] = repeat;
			}
		}
		System.out.println(arr.toString());	
		new_input = String.join(" ", arr);
		System.out.println(new_input);
	
	}
}
