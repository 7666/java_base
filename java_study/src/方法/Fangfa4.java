package 方法;
//42
//方法重载
public class Fangfa4{
	public static void main(String args[]) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(1.1,2.2));
	}
	public static int add(int x,int y) {
		return x + y;
	}
	public static int add(int x,int y,int z) {
		return x + y + z;
	}
	public static double add(double x,double y) {
		return x + y;
	}
}