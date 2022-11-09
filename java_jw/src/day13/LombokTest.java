package day13;

import lombok.Data;
public class LombokTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a =new TestA();
		a.setNum(10);
		System.out.println(a.getNum());
		System.out.println(a);
		TestA b = new TestA();
		b.setNum(10);
		System.out.println(a.equals(b));
	}

}
@Data//@Getter, @Setter, @ToString @EqualsAndHashConstructor @RequiredArgsConstructor를 합쳐놓은게 @Data
class TestA{
	private int num;
}
