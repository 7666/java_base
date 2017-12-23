package 方法;
//41
//无返回值的方法可以直接使用return来结束该方法
public class Fangfa3{
	public static void main(String args[]) {
		print(10);
		print(20);
	}
	public static void print(int x) {
		if(x == 20) {
			return;
		}
		System.out.println("x = " + x);
	}
}