package 运算符;
//26
//三目运算你也可以写成if判断，但是代码量会增加很多。
public class Math5{
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int result = 0;
		if(a > b) {
			result = a;
		}else {
			result = b;
		}
		System.out.println(result);//20
	}
}