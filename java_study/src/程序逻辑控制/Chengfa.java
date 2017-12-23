package 程序逻辑控制;
//37
//99乘法表
public class Chengfa{
	public static void main(String args[]) {
		for(int i = 1;i <=9 ;i++) {
			for(int j = 1;j <= i;j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "  ");
			}
			System.out.print("\n");
		}
	}
}