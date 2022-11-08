package day11;

public class ClassUpCastingEx01 {

	public static void main(String[] args) {
		
		Car car = new KiaCar(4,"K5",0x00ff00,"123허1235");
		car.print();
		Car [] carList = new Car[5];
		carList[0] = new KiaCar(4, "K5", 0x00ff00, "123나1234");
		carList[0] = new HyundaiCar(4, "K5", 0x00ff00, "123나1234");
		for(Car tmp : carList) {
			if(tmp == null) {
				continue;
			}
			//차 종류에 맞게 기아면 수동으로 기능을 현대면 자동으로 기능을 호출하기 위해 다운 캐스팅 함.
			if(tmp instanceof KiaCar) {
				((KiaCar) tmp).hand();
			} else if(tmp instanceof HyundaiCar) {
				((HyundaiCar) tmp).auto();
			}
		}

	}

}
