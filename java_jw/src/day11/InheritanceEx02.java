package day11;

public class InheritanceEx02 {

	public static void main(String[] args) {


		KiaCar kcar = new KiaCar(4,"K5", 0xFFFF0000, "123가1234");
		kcar.powerOn();
		kcar.changeGear('D');
		for(int i = 0; i <30; i++) {
			kcar.accelerator();
		}
		kcar.print();
		for(int i =0; i <30;i++) {
			kcar.breaker();
		}
	kcar.changeGear('P');
	kcar.powerOff();
	}

}

/* 자동차(Car)클래스, 타이어(Tire)클래스, 기아자동차(KiaCar)클래스,  현대자동차 (HyundaiCar) 클래스를 만들기 
  * 자동차
  *  - 타이어, 타이어수, 차종, 색상, 번호, 시동, 속력, 기어, 제조사
  *   - 전원 켜기/끄기, 기어 변경, 속력업/다운
  *  타이어
  *   - 제조사, 크기, 종류(스노우/일반)
  *   - 상태 출력
  *   기아자동차
  *    - 제조사가 기아, 자동차 상속
  *    현대자동차
  *    -  제조사가 현대, 자동차 상속
  * */ 
 


class Tire{
		public String company;
		public int size;
		public boolean isSnow;
		public boolean isStop;
		public void print() {
			if(isStop) {
				System.out.println("정지해있습니다.");
			}
		else {
					System.out.println("굴러가는 중입니다.");
		};
}
}
class Car{
	public Tire[] tries;
	public int tireCount;
	public String type;
	public int color;
	public Car(int tireCount, String type, int color, String carNum, String company) {

		this.tireCount = tireCount <= 0?4 : tireCount ;
		this.type = type;
		this.color = color;
		this.carNum = carNum;
		this.gear = 'P';
		this.company = company;
		tries = new Tire[tireCount];
	}
	
	public void powerOn() {
		power = true;
	}
	public void powerOff() {
		power = false;
	}
	
	public void changeGear(char gear) {
		if(gear == 'P' && speed != 0) {
			 return;
			} 
				this.gear = gear;
			}
	
	public void accelerator() {
		speed += 1;
	}
	
	public void breaker() {
		speed = speed <= 0? 0 : speed -1;
	}
	public void print() {
		System.out.println("전원 : " + (power ? "ON" : "OFF"));
		System.out.println("속력 : " + speed);
		System.out.println("기어 : " +gear);
		System.out.println("회사 : " + company);
		System.out.println("차종 : " + type);
	}
	
	public String carNum;
	public boolean power;
	public int speed;
	public char gear;
	public String company;
}

class KiaCar extends Car{
	public void hand() {
		System.out.println("트렁크가 수동입니다.");
	}
	
	public KiaCar(int tireCount, String type, int color, String carNum) {
		super(tireCount, type, color, carNum, "기아");
		this.company = "기아";
		
		}
}
class HyundaiCar extends Car{
	
	public void auto() {
		System.out.println("트렁크가 자동입니다.");
	}
	
		public HyundaiCar(int tireCount, String type, int color, String carNum) {
			super(tireCount, type, color, carNum, "현대");
			this.company = "현대";
			
		}
		
	}



