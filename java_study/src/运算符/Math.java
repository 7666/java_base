package 运算符;
//21
//复杂数学运算谁都看不懂的那种尽量不要出现
public class Math{
	public static void main(String args[]) {
		int x = 10;
		int y = 20;
		int result = x - y++ + x * y -- - --x * y / x--;
		System.out.println(result);//180
	}
}