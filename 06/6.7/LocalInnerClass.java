

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
public class LocalInnerClass
{
	public static void main(String[] args)
	{
		// ����ֲ��ڲ���
		class InnerBase
		{
			int a;
		}
		// ����ֲ��ڲ��������
		class InnerSub extends InnerBase
		{
			int b;
		}
		// �����ֲ��ڲ���Ķ���
		var is = new InnerSub();
		is.a = 5;
		is.b = 8;
		System.out.println("InnerSub�����a��bʵ�������ǣ�"
			+ is.a + "," + is.b);
	}
}

