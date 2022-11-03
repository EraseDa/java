package day09;

public class ThisEx01 {

	public static void main(String[] args) {

		
		Test03 t1 = new Test03();
		Test03 t2 = new Test03(10);
	}

}

/* this : 해당 클래스를 나타내는 참조변수
 * - 주로 매개변수의 이름과 멤버 변수의 이름이 같은 경우 사용
 * =>메소드에서 매개변수의 이름과 멤버변수의 이름이 같으면 변수를 호출했을 때 매개변수가 불려짐
 * 메소드명이 길 때 자동완성을 위해서 사용
 * this(): 해당 클래스의 다른 생성자를 호출, 생성자에서 첫번째줄에만 추가할 수 있음.
 *  * */
 class Test03{
	 private int num;
	 public void setNum(int num) {
		 num = num;
		 this.num =num;
	 }
	 public int getNum() {
		 return num;
	 }
	 public void print() {
		 System.out.println(this.getNum());
	 }
 public Test03() {
	 this(10);
	 num = 20;
 }
 public Test03(int num) {
	 this.num = num;
 }
 
 }
 
 
 