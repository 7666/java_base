package 程序逻辑控制;
//29
//多条件判断
public class If2{
	public static void main(String args[]) {
		int age = 16;
		if(age <= 18) {
			System.out.println("未成年");
		}else if(age > 18 && age < 23) {
			System.out.println("还在上学！");
		}else {
			System.out.println("随便折腾吧！！");
		}
	}
}