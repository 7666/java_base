package ��������;
//5
public class Long_int{
	public static void main(String args[]) {
		//�κ�������Ĭ�����Ͷ���int,���Ǹ������Ѿ�������int���Ա�������ݷ�Χ.
		//��ô������Ҫ��ȷ��������һ��long��
		long num = 2147483648L;//����һ��long���ͣ���׺Ϊ��l�����ߡ�L��
		int result = (int)num;//������ͱ�ΪС���������ͱ���ǿ��
		//ǿ����������������,���ܻᵼ����ʧ���ݾ���.
		System.out.println(result);//-2147483648
	}
}