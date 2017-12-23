package 方法;
//45
//方法递归实现60！
public class Fangfa7{
	public static void main(String args[]) {
		System.out.println(nul(60));
	}
	public static double nul(int x) {
		if(x == 1) {      //结束条件
			return 1;
		}
		return x * nul(x - 1);  //做出变更
	}
}
