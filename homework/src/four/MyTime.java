package four;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void display() {
		System.out.println("时：" + this.hour + " 分：" + this.minute + " 秒：" 
	+ this.second);
	}
	//方法
//加
	public void addSecond(int sec) {
		this.second += sec;
	}

	public void addMinute(int min) {
		this.minute += min;
	}
	public void addHour(int hou) {
		this.hour += hou;
	}
//减
	public void subSecond(int sec) {
		this.second -= sec;
	}
	public void subMinute(int min) {
		this.minute -= min;
	}
	public void subHour(int hour) {
		this.hour -= hour;
	}
	
}
