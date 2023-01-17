package day19;

import java.util.function.Consumer;

public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum sum = (a,  b)-> a+b;
		System.out.println(sum.run(1, 2));
		Print<Integer> print = num ->System.out.println(num);
		print.run(10);
		Print<String> print1 = num->System.out.println(num);
		print1.run("하이");
		Consumer<String> print2 = str->System.out.println(str);
		print2.accept("10");
		//consumer은 만들어진 인터페이스. 
	}

}

interface Sum{
  double run(double a, double b);
}

interface Print<T>{
	void run(T num);
}