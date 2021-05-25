

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
public class Outer
{
	private int outProp = 9;
	class Inner
	{
		private int inProp = 5;
		public void accessOuterProp()
		{
			// �Ǿ�̬�ڲ������ֱ�ӷ����ⲿ���privateʵ������
			System.out.println("�ⲿ���outPropֵ:"
				+ outProp);
		}
	}
	public void accessInnerProp()
	{
		// �ⲿ�಻��ֱ�ӷ��ʷǾ�̬�ڲ����ʵ������,
		// ���������ֱ������
		// System.out.println("�ڲ����inPropֵ:" + inProp);
		// ��������ڲ����ʵ��������������ʽ�����ڲ������
		System.out.println("�ڲ����inPropֵ:"
			+ new Inner().inProp);
	}
	public static void main(String[] args)
	{
		// ִ��������룬ֻ�������ⲿ����󣬻�δ�����ڲ������
		var out = new Outer();      // ��
		out.accessInnerProp();
	}
}
