package org.ngweb.drawing.shapes;

public class MyCircle extends MyShape implements IShape{
	//属性
	private double radius;
	//重写抽象类的行为
	public void setMyLocation(MyLocation location) {
		this.location = location;
	}
	public void moveTo(MyLocation location) { // 移动到新的位置
		this.location.setX(this.location.getX() + location.getX());
		this.location.setY(this.location.getY() + location.getY());
	}
	//实现接口的行为
	public MyLocation getMyLocation() {
		return this.location;
	}
	public double area() {//计算面积
		return (double)Math.round((3.14 * this.radius * this.radius) * 1000) / 1000;//保留三位小数
	}
	public void drawing() {// 绘制自己
			System.out.println("在x=" + this.location.getX() + "，y=" + 
	this.location.getY() + "处绘制一个圆。该图面积为" + this.area());
	}
	//自身特有行为
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return this.radius;
	}
}
