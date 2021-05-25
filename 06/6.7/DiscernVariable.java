

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
public class DiscernVariable
{
	private String prop = "�ⲿ���ʵ������";
	private class InClass
	{
		private String prop = "�ڲ����ʵ������";
		public void info()
		{
			var prop = "�ֲ�����";
			// ͨ�� �ⲿ������.this.varName �����ⲿ��ʵ������
			System.out.println("�ⲿ���ʵ������ֵ��"
				+ DiscernVariable.this.prop);
			// ͨ�� this.varName �����ڲ���ʵ���ı���
			System.out.println("�ڲ����ʵ������ֵ��" + this.prop);
			// ֱ�ӷ��ʾֲ�����
			System.out.println("�ֲ�������ֵ��" + prop);
		}
	}
	public void test()
	{
		var in = new InClass();
		in.info();
	}
	public static void main(String[] args)
	{
		new DiscernVariable().test();
	}
}
