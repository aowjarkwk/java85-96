package examples;
//클래스의 다형성
class PartA {
	String name = "PartA";
	void displayNameA() {
		System.out.println( "내 이름은 " + this.name );
	}
}
class PartB extends PartA {
	String name = "PartB";
	void displayNameB() {
		System.out.println( "내 이름은 " + this.name );
	}
}
class PartC extends PartB {
	String name = "PartC";
	void displayNameC() {
		System.out.println( "내 이름은 " + this.name );
	}
}
public class ex88 {
	public static void main(String[] args) {
		PartC c = new PartC();
		System.out.println( c.name );
		c.displayNameC();
		//System.out.println( c.getClass().getName() );
		PartB b = (PartB)c;
		System.out.println( b.name );
		b.displayNameB(); 
		PartA a = (PartA)c;
		System.out.println( a.name );
		PartB b2 = new PartC();
		System.out.println( b2.name );
		PartA a2 = new PartC();
		System.out.println( a2.name );
	}
}