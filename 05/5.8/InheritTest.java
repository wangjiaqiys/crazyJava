

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
class Animal
{
	private void beat()
	{
		System.out.println("��������...");
	}
	public void breathe()
	{
		beat();
		System.out.println("��һ��������һ������������...");
	}
}
// �̳�Animal��ֱ�Ӹ��ø����breathe()����
class Bird extends Animal
{
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
// �̳�Animal��ֱ�Ӹ��ø����breathe()����
class Wolf extends Animal
{
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class InheritTest
{
	public static void main(String[] args)
	{
		var b = new Bird();
		b.breathe();
		b.fly();
		var w = new Wolf();
		w.breathe();
		w.run();
	}
}
