package examples;

//인터페이스(interface):추상클래스와 거의 비슷한 개념
// 차이점은 오직 추상메소드만 존재, 다중상속 가능
interface Drawing{
	abstract public void draw();
	public void sketch(); //abstract 예약어 생략 가능
	
	//일반함수 불가
//	public void sale() {
//	System.out.println("그림을 판다.");	
//	}
}
interface Sketch{
	abstract public void paint();
}
                // 추상화클래스        // 다중상속 가능
class Painter extends Picture implements Drawing,Sketch{ // 다중상속

	@Override
	public void paint() {
		System.out.println("페인트");
		
	}

	@Override
	public void draw() {
		System.out.println("드로잉");
	}

	@Override
	public void sketch() {
		System.out.println("스케치");
		
	}
	
}

public class ex87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
