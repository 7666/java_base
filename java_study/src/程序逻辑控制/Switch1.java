package 程序逻辑控制;
//31
//jdk1.7开始支持String
public class Switch1{
	public static void main(String args[]) {
		String a = "hello";
		switch(a) {			
			case "hello":{
				System.out.println("1");
				break;
			}
			case "world":{
				System.out.println("2");
				break;
			}
			default : {
				System.out.println("没有条件被满足！");
			}
		}
	}
}