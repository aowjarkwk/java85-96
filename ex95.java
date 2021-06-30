package examples;
//Object.toString()  : 객체의 정보를 문자열로 출력 (시리얼라이즈)
class Someone {
	int age = 10;
}
public class ex95 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println( obj1 );
		System.out.println( obj1.toString() );
		Someone someone = new Someone();
		System.out.println( someone.toString() );
	}
}