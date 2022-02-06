package domain;

public class Printer implements Equipment{
	private String name;//机器型号
	private String type;//机器类型
//构造方法
	public Printer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Printer(String model, String type) {
		super();
		this.name = model;
		this.type = type;
	}
//get set方法
	public String getModel() {
		return name;
	}
	public void setModel(String model) {
		this.name = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String getDescription() {
		return name + "(" + type + ")";
	}
	
}
