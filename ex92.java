package examples;
//익명 객체(Anonymous) - 오버라이드 3가지 경우
//일반클래스
class TestClass {
	public void echo1() {
		System.out.println("Hello1");
	}
	public void echo2() {
		System.out.println("Hello2");
	}
}
//추상화클래스
abstract class TestAbstractClass {
	abstract public void echo();
}
//인터페이스
interface TestInterface {
	public void echo();
}
public class ex92 {
	public static void main(String[] args) {
		//일반클래스의 익명 객체를 만든다.
		TestClass t = new TestClass() {
			//오버라이드 - 재정의 - 부모클래스의 함수는 무시한다.
			@Override
			public void echo2() {
				System.out.println("Hello3");
			}
		};
		t.echo1();
		t.echo2();
		//추상화 클래스
		TestAbstractClass t2 = new TestAbstractClass() {
			@Override
			public void echo() {
				System.out.println("Hello4");
			}
		};
		t2.echo();
		//인터페이스 
		TestInterface t3 = new TestInterface() {
			@Override
			 public void echo() {
				 System.out.println("Hello5");
			 }
		};
		t3.echo();
	}
}