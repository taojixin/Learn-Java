package org.ngweb.drawing.shapes;

public class MyLocation {
	//私有属性
	private int x;
	private int y;
	// 构造方法
	public MyLocation() {
		
	}
	public MyLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//方法
	public void setLocation(int x, int y) { // 设置值
		this.x = x;
		this.y = y;
	}
	public int getX() {// getters 和 setters
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
