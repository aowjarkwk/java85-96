package examples;
//외부클래스 : 클래스밖에 클래스가 있는 것
//내부클래스 : 클래스안에 클래스가 있는 것
//Inner클래스 사용 이유 : 내부에서 소비하고 끝나는 클래스를 지정하면 좋다.
class Outer {
	String name = "Outer";
	class Inner1 {
		String name = "Inner1";
	}
	public static class Inner2 {
		String name = "Inner2";
	}
}
public class ex89 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		System.out.println(outer.name);
		Outer.Inner1 inner1 = outer.new Inner1();
		System.out.println( inner1.name );
		//바깥에서 접근하기 쉬운 구조의 Inner Class
		Outer.Inner2 inner2 = new Outer.Inner2();
		System.out.println( inner2.name );
	}
}