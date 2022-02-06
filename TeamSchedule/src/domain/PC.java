package domain;

public class PC implements Equipment{
	private String model;//表示机器型号
	private String display;//表示机器名称
//构造方法
	public PC() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PC(String model,String display) {
		this.display = display;
		this.model = model;
	}
//get set方法
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	
	@Override
	public String getDescription() {
		return model + "(" + display + ")";
	}
	

}
