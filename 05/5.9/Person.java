

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
public class Person
{
	// ���涨��һ��ʵ����ʼ����
	{
		var a = 6;
		if (a > 4)
		{
			System.out.println("Personʵ����ʼ���飺�ֲ�����a��ֵ����4");
		}
		System.out.println("Person��ʵ����ʼ����");
	}
	// ����ڶ���ʵ����ʼ����
	{
		System.out.println("Person�ĵڶ���ʵ����ʼ����");
	}
	// �����޲����Ĺ�����
	public Person()
	{
		System.out.println("Person����޲���������");
	}
	public static void main(String[] args)
	{
		new Person();
	}
}

