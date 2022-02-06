package demo2;

public class ClassArrayTest {
	public static void main(String[] args) {
		Student[] stu = new Student[20];
		//随机生成的20个学生
		for(int i = 0;i < stu.length;i++) {
			//给数组元素赋值
			stu[i] = new Student();
			stu[i].number = i+1;
			//年级1-6
			stu[i].state = (int)(Math.random() * (6 - 1 + 1) + 1);
			//成绩0-100
			stu[i].score = (int)(Math.random() * (100 - 0 + 1));
		}
		//先遍历看一下生成的20个学生
		for(int i = 0;i < stu.length;i++) {
			System.out.println(stu[i].info());
		}
		System.out.println("***********************");
		//问题1：打印3年级的学生信息
		for(int i = 0;i < stu.length;i++) {
			if(stu[i].state == 3) {
				System.out.println(stu[i].info());
			}
		}
		System.out.println("***********************");
		//问题2：使用冒泡排序法按学生成绩排序
		for(int i = 0;i < stu.length;i++) {
			for(int j = 0;j < stu.length - 1 - i;j++) {
				if(stu[j].score < stu[j+1].score) {
					//是交换数组元素，而不是分数score
					Student temp = stu[j+1];
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
class Student{
	int number;
	int state;
	int score;
	
	public String info() {
		return ("学号：" + number + "；" + "年级：" + state + "；" + "成绩：" + score);
	}
}
