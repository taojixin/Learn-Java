package protect1;

public class Test {
	public static void main(String[] args) {
		Cust a = new Cust("asf",1,"sdfs",10750);
		Cust b = new Cust("bsdf",2,"sdfs",104400);
		Cust c = new Cust("cfs",3,"sdfs",100);
		Cust d = new Cust("dfsaf",4,"sdfs",1010);
		a.sort(a,b,c,d);
	}
}
