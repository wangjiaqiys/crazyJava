

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
class StaticOut
{
	// ����һ����̬�ڲ��࣬��ʹ�÷��ʿ��Ʒ���
	// ��ͬһ������������ɷ��ʸ��ڲ���
	static class StaticIn
	{
		public StaticIn()
		{
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}
public class CreateStaticInnerInstance
{
	public static void main(String[] args)
	{
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		/*
		�������ɸ�Ϊ�������д��룺
		ʹ��OuterClass.InnerClass����ʽ�����ڲ������
		StaticOut.StaticIn in;
		ͨ��new�������ڲ��๹����������̬�ڲ���ʵ��
		in = new StaticOut.StaticIn();
		*/
	}
}
