package 数据类型;
//9
public class Byte{
	public static void main(String args[]) {
		byte num = 10;//10是int类型，在byte范围内。
		//10是int类型，理论上需要强制转换
		//实际上没有转换，因为其数据类型没有超出byte范围，符合byte要求
		System.out.println(num);
	}
}