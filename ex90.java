package examples;
class Button {
	//내부 인터페이스 선언
	interface onClickEvent {
		void onClick(); //가상함수(버튼클릭 이벤트)
	}
	onClickEvent event; //인터페이스 변수(버튼클릭 이벤트)
	//일반함수 : 인터페이스 설정(버튼클릭 이벤트)
	void setOnClickEvent(onClickEvent event) {
		this.event = event;
	}
	void touch() {
		event.onClick();
	}
}
//인터페이스 구현 방법1
class MyButton implements Button.onClickEvent {
	@Override
	public void onClick() {
		System.out.println("버튼 클릭됨.");
	}
}
//인터페이스 구현방법 2

class MyButton2 extends Button{
	
}

public class ex90 {
	public static void main(String[] args) {
		//인터페이스 구현 방법1
		MyButton myButton = new MyButton();
		myButton.onClick();
		
		//인터페이스 구현방법 2
		MyButton2 mybutton2 = new MyButton2();
		//인터페이스 익명 객체-함수(이름없는 함수)
		mybutton2.setOnClickEvent(new Button.onClickEvent() {
			
			@Override
			public void onClick() {
				System.out.println("버튼2 클릭됨.");
				
			}
		});
		mybutton2.touch();
	}
}