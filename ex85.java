package examples;

//객체(클래스) 배열
class Snack{
	String name = "새우깡";
	public Snack( String name ) {
		this.name = name;
	}
}


public class ex85 {

	public static void main(String[] args) {
		// 클래스 객체를 배열로 만들어보자
		int[] nums = new int[5]; // 일반 배열
		
		Snack[] snacks = new Snack[5]; //객체 배열
		for(int i = 0; i<5; i++) {
			snacks[i]= new Snack("짱구"+i);
			
			System.out.println(snacks[i].name);
		}
		
	}

}
