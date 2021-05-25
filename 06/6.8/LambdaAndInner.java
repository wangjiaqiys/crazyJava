

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
@FunctionalInterface
interface Displayable
{
	// ����һ�����󷽷���Ĭ�Ϸ���
	void display();
	default int add(int a, int b)
	{
		return a + b;
	}
}
public class LambdaAndInner
{
	private int age = 12;
	private static String name = "��������������";
	public void test()
	{
		var book = "���Java����";
		Displayable dis = ()->{
			// ���ʡ�effectively final���ľֲ�����
			System.out.println("book�ֲ�����Ϊ��" + book);
			// �����ⲿ���ʵ�������������
			System.out.println("�ⲿ���ageʵ������Ϊ��" + age);
			System.out.println("�ⲿ���name�����Ϊ��" + name);
			// ���Ե��ýӿ��е�Ĭ�Ϸ������������ᱨ��
//			System.out.println(add(3, 5));
		};
		dis.display();
		// ����dis����ӽӿ��м̳е�add()����
		System.out.println(dis.add(3, 5));	  // ��
	}
	public static void main(String[] args)
	{
		var lambda = new LambdaAndInner();
		lambda.test();
	}
}
