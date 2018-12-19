package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> integers = new ArrayList<>();
		for(int i = 0; i< 100000; i++) {
			integers.add(i);
		}
		
		List<Integer> arr = integers.stream().filter(p -> (p%27 == 0)).collect(Collectors.toList());
		System.out.println(arr.toString());
		
	}
}
