package ����;
//45
//�����ݹ�ʵ��60��
public class Fangfa7{
	public static void main(String args[]) {
		System.out.println(nul(60));
	}
	public static double nul(int x) {
		if(x == 1) {      //��������
			return 1;
		}
		return x * nul(x - 1);  //�������
	}
}
