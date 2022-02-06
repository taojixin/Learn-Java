package domain;

public class Architect extends Designer{
	private int stock;//股票
//构造器

	public Architect() {
		super();
	}

	public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus,int stock) {
		super(id, name, age, salary, equipment, bonus);
		this.stock = stock;
	}
//get set方法

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getDetails() + "\t架构师" + "\t" + getStatus() +"\t" + getBonus() + "\t" + stock + "\t" + getEquipment().getDescription();
	}
	public String getDetailsForTeam() {
		return getTeamBaseDetails() + "\t架构师\t" + getBonus() + "\t" + getSalary();
	}
}
