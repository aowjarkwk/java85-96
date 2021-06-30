package examples;

//기술면접
//추상화 클래스 vs 인터페이스 차이점/장단점

//추상화클래스 vs 인터페이스 공통점
//1.가상함수를 이용한 오버라이딩 사용

//추상화클래스 vs 인터페이스 차이점
//1.일반 메소드(abstract가 아닌)가 들어갈 수 있다. vs 오직 추상메소드(가상함수)만 가능
//2.다중 상속이 불가<=>다중상속 가능
//3.abstract 키워드<=>interface 키워드
//4.상속시 extends 사용<=>implements 사용

//추상클래스(abstract class) : 애매모호한 , 명확하지 않음.
//                           : 가상함수 - 선언만 있고 본체는 없다.
//                           : 본체는 오버라이딩(재정의)을 통해 Child Class가 구현한다.

//가상함수(추상메소드), 추상화클래스, 인터페이스를 사용하는 이유
//설계와 구현의 관점으로 이해하면 됨.
//집을 지을 때, 설계사무소와 시공사가 있음.
//단시간내에 전체구조와 기능을 설계하고,
//실제적인 기능 구현은 코더가 구현한다.

abstract class Picture{
	//가상함수
	abstract public void draw();//메소드 코드 본체없이 그냥 끊어버림 선언만 함. 가상함수. 정의만 있음.
	                            //구현은 자식클래스가 한다.
	//일반함수
	public void sale() {
		System.out.println("그림을 판다.");
	}
}
class Sale {
	
}
class Picasso extends Picture /*,Sale 다중상속이 안됨.*/{
	//@Override : 어노테이션 - 예약어,컴파일 지시어
	@Override
	public void draw() {
		System.out.println("그림을 그린다.");
		
	}
	
}

public class ex86 {

	public static void main(String[] args) {
		Picasso picasso = new Picasso();
		picasso.draw();
		

	}

}
