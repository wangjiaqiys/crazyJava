

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
public class StringJoinTest
{
	public static void main(String[] args)
	{
		var s1 = "���Java";
		// s2�������õ��ַ������Ա���ʱ��ȷ��������
		// ���s2ֱ�����ó����������е�"���Java"�ַ���
		var s2 = "���" + "Java";
		System.out.println(s1 == s2); // ���true
		// ����2���ַ���ֱ����
		var str1 = "���";     // ��
		var str2 = "Java";     // ��
		// ��str1��str2������������
		var s3 = str1 + str2;
		System.out.println(s1 == s3); // ���false

	}
}
