package 程序逻辑控制;
//38
//打印三角形
public class Sanjiao{
	public static void main(String args[]) {
		int line = 10;
		for(int i = 0;i < line;i++) {
			for(int j = 0; j < line - i;j++ ) {
				System.out.print(" ");
			}
			for(int j = 0; j < i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}