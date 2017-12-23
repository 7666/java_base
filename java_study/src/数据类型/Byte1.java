package 数据类型;
//10
//如果你为byte赋值的数据大于其数据范围，那么就需要其数据类型的强制转换。
public class Byte1{
  public static void main(String args[]) {
		byte num = (byte)128;
		System.out.println(num);//-128
	}
}