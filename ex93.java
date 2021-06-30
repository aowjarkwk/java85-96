package examples;
//JDK (Java development Kit) : Class의 모음
//JDK 문서 : https://docs.oracle.com/javase/8/docs/api/
//기본 API 클래스들 (java.lang.*, java.util.*) 
//java.lang.Object : 가장 루트(Root)가 되는 최상위 클래스(객체)
//최상위 Object를 이용하여 (다형성을 이용해서) 모든 객체타입을 담을 수 있다.
//변수 : 참조변수 vs 값변수(실제값을 가지고 있음. int long short byte float double boolean char)
//       배열,객체..
//       주소값(숫자)-> 정수4바이트
public class ex93 {
	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = new Object();
		System.out.println(object1); //참조변수값(주소값)을 출력(들어있는값이 아님) 15db9742
		System.out.println(object2);
		//주소값을 비교
		if( object1 == object2 ) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//값(내용)을 비교
		if( object1.equals(object2) == true ) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		String s1 = "123";
		//String s2 = "123"; //리터럴(데이타)로 선언
		String s2 = new String("123"); //클래스 생성자로 선언
		System.out.println( s1 );
		System.out.println( s2 );
		if( s1 == s2 ) { //주소값을 비교
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//값(내용)을 비교
		if( s1.equals(s2) == true ) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}
}