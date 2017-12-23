package 程序逻辑控制;
//30
//观察switch语句
public class Switch{
	public static void main(String args[]) {
		int a = 1;
		switch(a) {
			default : {
				System.out.println("没有条件被满足！");
			}
			case 1:{
				System.out.println("1");
			}
			case 2:{
				System.out.println("2");
			}
		}
	}
}