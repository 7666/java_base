package 数据类型;
//13
//小数与整型计算问题
public class Float_int{
	public static void main(String args[]) {
		double num = 1.1;//定义一个小数
		System.out.println(num * 10);//11.0 小数乘以一个整型会得到一个小数
		int num1 = 10;//定义一个整型
		System.out.println(num1 * 1.1);//11.0
		System.out.println(10 / 3);//3 一个整型除以一个整型只会得到一个整型
		System.out.println(10 / 3.0);//3.333333 要想得到一个小数，只能把其中一个变为浮点型
	}
}