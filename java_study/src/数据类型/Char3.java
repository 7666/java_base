package 数据类型;
//17
//大写字母变为小写字母
public class Char3{
	public static void main(String args[]) {
		char a = 'A';
		int num = a + 32;//大写字母与小写字母编码相差32
		char b = (char)num;//将编码数字转换为字符型
		System.out.println(b);
	}
}