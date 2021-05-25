

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
interface Product
{
	double getPrice();
	String getName();
}
public class AnonymousTest
{
	public void test(Product p)
	{
		System.out.println("������һ��" + p.getName()
			+ "��������" + p.getPrice());
	}
	public static void main(String[] args)
	{
		var ta = new AnonymousTest();
		// ����test()����ʱ����Ҫ����һ��Product������
		// �˴�����������ʵ�����ʵ��
		ta.test(new Product()
		{
			public double getPrice()
			{
				return 567.8;
			}
			public String getName()
			{
				return "AGP�Կ�";
			}
		});
	}
}
