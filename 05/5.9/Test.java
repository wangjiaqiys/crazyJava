

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
class Root
{
	static{
		System.out.println("Root�����ʼ����");
	}
	{
		System.out.println("Root��ʵ����ʼ����");
	}
	public Root()
	{
		System.out.println("Root���޲����Ĺ�����");
	}
}
class Mid extends Root
{
	static{
		System.out.println("Mid�����ʼ����");
	}
	{
		System.out.println("Mid��ʵ����ʼ����");
	}
	public Mid()
	{
		System.out.println("Mid���޲����Ĺ�����");
	}
	public Mid(String msg)
	{
		// ͨ��this����ͬһ�������صĹ�����
		this();
		System.out.println("Mid�Ĵ������������������ֵ��"
			+ msg);
	}
}
class Leaf extends Mid
{
	static{
		System.out.println("Leaf�����ʼ����");
	}
	{
		System.out.println("Leaf��ʵ����ʼ����");
	}
	public Leaf()
	{
		// ͨ��super���ø�������һ���ַ��������Ĺ�����
		super("���Java����");
		System.out.println("ִ��Leaf�Ĺ�����");
	}
}
public class Test
{
	public static void main(String[] args)
	{
		new Leaf();
		new Leaf();
	}
}

