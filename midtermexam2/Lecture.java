package javaprogramming2.midtermexam2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture implements Manageable {
	String code;
	int num = 1;
	ArrayList<String> outlist = new ArrayList<>();

	@Override
	public void read(Scanner scan) {
		String tmp;
		Message msg = null;
		while (true){
			tmp = scan.next();
			if(tmp.contentEquals("0"))
				break;
			outlist.add(tmp);
			num++;
		}
	}
	@Override
	public void print() {
		System.out.printf("[%s] %d건", code, num);
		/*for(String a: outlist)
			System.out.printf("%s", a);*/
	}
	@Override
	public boolean matches(String kwd) {
		if (code.equals(kwd))
			return true;
		return false;
	}
}