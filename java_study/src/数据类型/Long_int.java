package 数据类型;
//5
public class Long_int{
	public static void main(String args[]) {
		//任何整型其默认类型都是int,但是该数据已经超过了int可以保存的数据范围.
		//那么现在需要明确表明这是一个long型
		long num = 2147483648L;//定义一个long类型，后缀为‘l’或者‘L’
		int result = (int)num;//大的类型变为小的数据类型必须强制
		//强制设置其数据类型,可能会导致损失数据精度.
		System.out.println(result);//-2147483648
	}
}