

/**
 * Description:
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 5.0
 */
public class IdentityHashCodeTest
{
	public static void main(String[] args)
	{
		// ���������s1��s2��������ͬ����
		var s1 = new String("Hello");
		var s2 = new String("Hello");
		// String��д��hashCode()����������Ϊ�����ַ����м���hashCodeֵ��
		// ��Ϊs1��s2���ַ�������ͬ���������ǵ�hashCode��������ֵ��ͬ
		System.out.println(s1.hashCode()
			+ "----" + s2.hashCode());
		// s1��s2�ǲ�ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1)
			+ "----" + System.identityHashCode(s2));
		var s3 = "Java";
		var s4 = "Java";
		// s3��s4����ͬ���ַ��������������ǵ�identityHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s3)
			+ "----" + System.identityHashCode(s4));
	}
}
