package 数据类型;
//第三个程序，解决int类型溢出问题
//将int类型的数值赋给long类型，然后再计算
public class Int_overflow{
	public static void main(String args[]) {
		int num = Integer.MAX_VALUE;
		long result = num;
		System.out.println(result + 1);
	}
}