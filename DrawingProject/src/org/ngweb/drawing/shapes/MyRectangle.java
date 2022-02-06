package org.ngweb.drawing.shapes;

public class MyRectangle extends MyShape implements IShape{
	private double width;
	private double height;
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
		return (int) (this.width * this.height);
	}
	public void drawing() {// 绘制自己
		System.out.println("在x=" + this.location.getX() + "，y=" + 
	this.location.getY() + "处绘制一个长方形。该图面积为" + this.area());
	}
	//特有行为
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return this.width;
	}
	public void setHeight(double Height) {
		this.height = Height;
	}
	public double getHeight() {
		return this.height;
	}
}
