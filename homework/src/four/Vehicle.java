package four;

public class Vehicle {
	public int speed;
	public int size;
	public String model;
	public void move() {
		
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void speedUp() {
		this.speed += 5;
		System.out.println("加速！此时速度为：" + this.speed + "ks/h");
	}
	public void speedDown() {
		this.speed -= 10;
		System.out.println("减速！此时速度为：" + this.speed + "ks/h");
	}
}
