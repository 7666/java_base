package 程序逻辑控制;
//34
//使用for循环实现1-100的累加
public class For{
	public static void main(String args[]) {
		int sum = 0;
		for(int a = 0; a <= 100;a++) {
			sum += a;
		}
		System.out.println(sum);
	}
}