package ����;
//41
//�޷���ֵ�ķ�������ֱ��ʹ��return�������÷���
public class Fangfa3{
	public static void main(String args[]) {
		print(10);
		print(20);
	}
	public static void print(int x) {
		if(x == 20) {
			return;
		}
		System.out.println("x = " + x);
	}
}