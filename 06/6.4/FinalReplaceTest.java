

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
public class FinalReplaceTest
{
	public static void main(String[] args)
	{
		// ���涨����4��final���������
		final var a = 5 + 2;
		final var b = 1.2 / 3;
		final var str = "���" + "Java";
		final var book = "���Java���壺" + 99.0;
		// �����book2������ֵ��Ϊ�����˷����������޷��ڱ���ʱ��ȷ������
		final var book2 = "���Java���壺" + String.valueOf(99.0);  // ��
		System.out.println(book == "���Java���壺99.0");
		System.out.println(book2 == "���Java���壺99.0");
	}
}
