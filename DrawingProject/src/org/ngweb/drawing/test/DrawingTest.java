package org.ngweb.drawing.test;
import org.ngweb.drawing.shapes.*;

public class DrawingTest {
	public static void main(String[] args) {
		MyRectangle rect = new MyRectangle() ;
		MyLocation rl = new MyLocation(20, 30);
		rect.setMyLocation(rl);
		rect.setHeight(150);
		rect.setWidth(100);
		System.out.println("移动前的横坐标是：" + rect.getMyLocation().getX() + ",移动前的纵坐标是："+ rect.getMyLocation().getY());
		rect.drawing();
		rect.moveTo(new MyLocation (50, 50));
		System.out.println("移动后的横坐标是："+rect.getMyLocation().getX()+"，移动后的纵坐标是："+rect.getMyLocation().getY());
		System.out.println("************");
		MyCircle circle = new MyCircle() ;
		MyLocation cl = new MyLocation(30, 20);
		circle.setMyLocation(cl);
		circle.setRadius(3.5);
		System.out.println("移动前的横坐标是："+circle.getMyLocation().getX()+"，移动前的纵坐标是："+circle.getMyLocation().getY());
		circle.drawing();
		circle.moveTo(new MyLocation (50, 50));
		System.out.println("移动后的横坐标是："+circle.getMyLocation().getX()+"，移动后的纵坐标是："+circle.getMyLocation().getY());
	}
}

