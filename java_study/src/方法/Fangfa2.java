package 方法;
//40
//有参数有返回值的方法
public class Fangfa2{
	public static void main(String args[]) {
		int result = add(10,20);
		System.out.println(result);
		//既然方法有返回值，那么这些返回值也可以直接输出
		System.out.println(add(100,200));
	}
	public static int add(int x,int y) {
		return x+y;
	}
}