package methodOverriding;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		ch.SayHello("Good Morning");
		
		Parent p = new Parent();
		
		p.SayHello("Have A Nice Day");
		
		Parent p1 = new Parent();
		p1.SayHello("Bye");
		
		//Child ch1 = new Parent();
		//ch1.SayHello("BYE");
	}

}
