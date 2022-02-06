package service;
//表示员工的状态
//FREE空闲 BUSY已加入开发团队 VOCATION正在休假
public class Status {
	private final String NAME;
	private Status(String name) {
		this.NAME = name;
	}
	public static final Status FREE = new Status("FREE");
	public static final Status BUSY = new Status("BUSY");
	public static final Status VOCATION = new Status("VOCATION");

	public String getNAME() {
		return NAME;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return NAME;
	}
}
