package 运算符;
//29
//观察非操作
public class Math8{
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		System.out.println(!(a > b));//true
		//本来10不大于20，应该是false，但是使用了非操作，变为了true
	}
}