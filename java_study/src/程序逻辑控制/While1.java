package 程序逻辑控制;
//33
//使用while实现1-100的累加
public class While1{
	public static void main(String args[]) {
		int a = 0;
		int sum = 0;
		do {
			sum += a;
			a++;
		}while(a <= 100);
		System.out.println(sum);
	}
}