package org.ngweb.drawing.shapes;

public abstract class MyShape {
	//属性：所有形状都有一个参考位置（左上角）
	protected MyLocation location;
	//行为：所有形状的下述行为是相同的
	abstract void setMyLocation(MyLocation location);
	abstract void moveTo(MyLocation location); // 移动到新的位置
}
