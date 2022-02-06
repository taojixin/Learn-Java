package org.ngweb.drawing.shapes;

import org.ngweb.drawing.shapes.MyLocation;

public interface IShape {
	//省略了public和abstract
	 MyLocation getMyLocation(); // 访问参考位置
	 void setMyLocation(MyLocation location);
	 double area(); // 计算面积
	 void drawing(); // 绘制自己
	 void moveTo(MyLocation location); // 移动到新的位置
}
