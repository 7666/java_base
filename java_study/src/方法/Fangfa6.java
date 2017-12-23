package 方法;
//44
//方法递归实现1-100的加和
public class Fangfa6{
	public static void main(String args[]) {
		System.out.println(num(100));
	}
	public static int num(int x) {
		if(x == 1) {      //结束条件
			return 1;
		}
		return x + num(x - 1);  //做出变更
	}
}
