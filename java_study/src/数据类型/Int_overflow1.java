package 数据类型;
//第4个程序，解决int类型溢出问题
public class Int_overflow1{
	public static void main(String args[]) {
		int num = Integer.MAX_VALUE;
		long result = (long)num + 1;
		System.out.println(result);
	}
}