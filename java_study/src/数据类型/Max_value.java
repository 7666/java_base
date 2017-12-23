package 数据类型;
//第二个程序，整型溢出
public class Max_value{
	public static void main(String args[]) {
		int num = Integer.MAX_VALUE;//最大值		
		System.out.println(num + 1);//数据溢出，加1变为最小值
	}
}