package 程序逻辑控制;
//32
//使用while实现1-100的累加
public class While{
	public static void main(String args[]) {
		int a = 0;
		int sum = 0;
		while(a <= 100) {
			sum += a;
			a++;
		}
		System.out.println(sum);
	}
}