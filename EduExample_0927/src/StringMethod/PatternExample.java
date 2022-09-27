package StringMethod;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-5327-2379";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("일치하지 않습니다");
		}
	}

}
