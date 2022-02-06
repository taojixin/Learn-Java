package demo2;

public class ClassArrayTest1 {
	public static void main(String[] args) {
		Student1[] stu = new Student1[20];
		//随机生成的20个学生
		for(int i = 0;i < stu.length;i++) {
			//给数组元素赋值
			stu[i] = new Student1();
			stu[i].number = i+1;
			//年级1-6
			stu[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			//成绩0-100
			stu[i].score = (int)(Math.random() * (100 - 0 + 1));
		}
		ClassArrayTest1 test = new ClassArrayTest1();
		//先遍历看一下生成的20个学生
		test.print(stu);
		System.out.println("***********************");
		//问题1：打印3年级的学生信息
		test.message(stu);
		System.out.println("***********************");
		//问题2：使用冒泡排序法按学生成绩排序
		test.maopao(stu);
		
	}

	//封装遍历数组的方法（此方法要写在main函数外
	public void print(Student1[] stu){
		for(int i = 0;i < stu.length;i++) {
			System.out.println(stu[i].info());
		}
	}
	//打印三年级的学生信息
	public void message(Student1[] stu) {
		for(int i = 0;i < stu.length;i++) {
			if(stu[i].state == 3) {
				System.out.println(stu[i].info());
			}
		}
	}
	//使用冒泡排序对学生成绩进行排序
	public void maopao(Student1[] stu) {
		for(int i = 0;i < stu.length;i++) {
			for(int j = 0;j < stu.length - 1 - i;j++) {
				if(stu[j].score < stu[j+1].score) {
					Student1 temp = stu[j+1];
					stu[j+1] = stu[j];
					stu[j] = temp;
				}
			}
		}
		for(int i = 0;i < stu.length;i++) {
			System.out.println(stu[i].info());
		}
	}
}
class Student1{
	int number;
	int state;
	int score;
	
	public String info() {
		return ("学号：" + number + "；" + "年级：" + state + "；" + "成绩：" + score);
	}
}
