package day11;

public class ClassDownCastingEx01 {

	public static void main(String[] args) {
	/* 클래스 다운 캐스팅은 조건부로 가능
	 * 안되는 경우 : 부모클래스의 객체를 바로 자식 클래스으 ㅣ객체에 저장하는 경우
	 * */
		//에러발생 KiaCar kcar = (KiaCar)(new Car(4, "K5",0x00ff00,"123가1234","기아"));
		//kcar.print();

		/*되는 경우 : 자식 클래스의 객체를 부모 클래스의 객체에 저장한 후,
		 * 부모 클래스의 객체를 다시 자식 클래스의  객체로 저장하는 경우
		 */
		KiaCar kcar1 = new KiaCar(4,"K5",0x00ff00,"123허1235");
		Car car = kcar1;
		KiaCar kcar2 = (KiaCar)car;
		kcar2.print();
		
		
	}

}
