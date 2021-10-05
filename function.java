

import java.util.function.Function;

public class functionalexample {

	public static void main(String[] args) {
Function<Integer, Double> f = a -> a/2.0;
System.out.println(f.apply(20));
	}

}
