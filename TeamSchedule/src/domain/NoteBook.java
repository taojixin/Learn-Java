package domain;

public class NoteBook implements Equipment{
	private String model;//机器型号
	private double price;//价格
//构造方法
	public NoteBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoteBook(String model,double price) {
		super();
		this.model = model;
		this.price = price;
	}
//get set方法
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String getDescription() {
		return model + "(" + price + ")";
	}
	
}
