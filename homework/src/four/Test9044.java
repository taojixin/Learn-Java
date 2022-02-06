package four;

public class Test9044 {
	public static void main(String[] args) {
		//实例化交通工具对象
		Vehicle vehicle = new Vehicle();
		//初始化speed、size和型号
		vehicle.speed = 40;
		vehicle.size = 1200;
		vehicle.model = "宝马x3";
		System.out.println("车速：" + vehicle.speed + "ks,体重：" 
							+ vehicle.size + "kg,型号：" + vehicle.model);
		//加速
		vehicle.speedUp();
		//减速
		vehicle.speedDown();
	}
}
