package examples;
//java.lang.Object - 해쉬코드(  hashcode ) int형 값으로서 Object의 ID값을 의미.
//                 - new를 통해 객체화될때, 자동적으로 부여되는 숫자값.
public class ex94 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println( obj1.hashCode() );
		System.out.println( obj2.hashCode() );
		int hashcode1 = System.identityHashCode( obj1 );
		int hashcode2 = System.identityHashCode( obj2 );
		System.out.println( hashcode1 );
		System.out.println( hashcode2 );
	}
}