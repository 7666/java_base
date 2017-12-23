package 运算符;
//25
//三目运算，将两个变量中的最大值赋给一个变量。
public class Math4{
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		//如果a>b的条件为true，result的内容就是a，如果不满足result的内容就是b。
		int result = a > b ? a : b;
		System.out.println(result);//20
	}
}