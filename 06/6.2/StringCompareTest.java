

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
public class StringCompareTest
{
	public static void main(String[] args)
	{
		// s1ֱ�����ó������е�"���Java"
		var s1 = "���Java";
		var s2 = "���";
		var s3 = "Java";
		// s4������ַ���ֵ�����ڱ���ʱ��ȷ������
		// s4ֱ�����ó������е�"���Java"
		var s4 = "���" + "Java";
		// s5������ַ���ֵ�����ڱ���ʱ��ȷ������
		// s5ֱ�����ó������е�"���Java"
		var s5 = "��" + "��" + "Java";
		// s6������ַ���ֵ�����ڱ���ʱ��ȷ��������
		// �������ó������е��ַ���
		var s6 = s2 + s3;
		// ʹ��new���ù��������ᴴ��һ���µ�String����
		// s7���ö��ڴ����´�����String����
		var s7 = new String("���Java");
		System.out.println(s1 == s4); // ���true
		System.out.println(s1 == s5); // ���true
		System.out.println(s1 == s6); // ���false
		System.out.println(s1 == s7); // ���false
	}
}
