package 运算符;
//24
//自增运算
public class Math3{
	public static void main(String args[]) {
		int x = 10;
		int y = 20;
		int result = ++x * y;
		//++x先执行成11，然后11 * 20
		System.out.println(result);//220
		System.out.println(x);//11
		int result1 = x++ * y;
		//x*y,然后x自增
		System.out.println(result1);//220
		System.out.println(x);//12
	}
}