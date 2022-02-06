package demo2;

public class ValueTransferTest {
	public static void main(String[] args) {
		ValueTransferTest v = new ValueTransferTest();
		v.printAreas(new Circle(), 5);
		
	}
	
	public void printAreas(Circle c ,int time) {
		System.out.println("radius\t\tarea");
		for(int i = 1;i <= time;i++) {
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		c.radius = time + 1;
		System.out.println("new radius = " + c.radius);
	}
}


class Circle{
	double radius;
	public double findArea() {
		return radius*radius*3.14;
	}
}