package stream;

import java.util.Arrays;
import java.util.List;

public class JavaStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "", "coding", "", "learning");
		
		long count = list.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Count:"+count );

	}

}
