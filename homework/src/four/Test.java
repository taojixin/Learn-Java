package four;

public class Test {
	public static void main(String[] args) {
		MyTime time = new MyTime(2020,10,9044);
		time.display();
		//add
		time.addSecond(59);
		time.addMinute(58);
		time.addHour(1);
		time.display();
		//sub
		time.subSecond(1);
		time.subMinute(59);
		time.subHour(2);
		time.display();
	}
}
