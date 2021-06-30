package examples;
//String 클래스 : 문자열에 대한 전반적인 처리하는 클래스
public class ex96 {
	public static void main(String[] args) {
		//String 클래스 생성
		String greeting = "안녕하세요";
		System.out.println(greeting);
		String hello = new String("안녕하세요");
		System.out.println(hello);
		//문자열 비교
		if( greeting.equals(hello) ) {
			System.out.println("값이 동일합니다.");
		}else {
			System.out.println("값이 다릅니다.");
		}
		//문자열을 포함하고 있는지 검사
		if( greeting.contains("안녕") ) {
			System.out.println("안녕 있음.");
		}
		if( greeting.contains("반가워요") ) {
			System.out.println("반가워요 있음.");
		}else {
			System.out.println("반가워요 없음.");
		}
		String str = "This is java programming.";
		//문자열에서 문자 한자를 받아옴
		char c = str.charAt(0);  // 'T'
		System.out.println(c);
		c = str.charAt(8);
		System.out.println(c);  //'j'
		//문자열에서 문자(문자열)의 위치(index)를 가져옴.
		int index = str.indexOf("java");
		System.out.println(index);
		index = str.indexOf('j');
		System.out.println(index);
		index = str.indexOf('s');
		System.out.println(index);
		//문자열의 길이
		int length = str.length();
		System.out.println(length);
		//문자열의 치환(바꾸기)
		String str2 = str.replace("java", "android");
		System.out.println( str2 );
		//replaceAll("정규식", "바뀌는 문자열")
		String str3 = "testa1testbccc2testccc3";
		String str4 = str3.replaceAll("[^0-9]", ""); //숫자만 가져오기 정규식
		System.out.println(str4); //"123"
		//문자열의 분리
		String animals = "dog,cat,pig,cow,chicken";
		String[] animalList = animals.split(",");
		for( String animal : animalList)
			System.out.println(animal);
		//문자열의 일부만 가져오기
		String ment = "Today_is_beautiful_day!";
		String part = ment.substring(5); //index로 지정한 위치부터 가져옴.
		System.out.println(part);
		String part2 = ment.substring(9, 18); //startindex부터 endindex까지 가져옴.
		System.out.println(part2);
		//대문자로 변환
		String upper = ment.toUpperCase();
		System.out.println(upper);
		//소문자로 변환
		String lower = ment.toLowerCase();
		System.out.println(lower);
		//숫자를 문자열로 변환
		String num = String.valueOf(100);
		System.out.println(num);
		//문자열을 숫자로
		int number = Integer.parseInt("123"); //아라비아숫자만 입력!
		System.out.println( number );
	}
}