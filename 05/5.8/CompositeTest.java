

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
class Bird
{
	// ��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Bird(Animal a)
	{
		this.a = a;
	}
	// ���¶���һ���Լ���breathe()����
	public void breathe()
	{
		// ֱ�Ӹ���Animal�ṩ��breathe()������ʵ��Bird��breathe()������
		a.breathe();
	}
	public void fly()
	{
		System.out.println("����������ڵķ���...");
	}
}
class Wolf
{
	// ��ԭ���ĸ�����ϵ�ԭ�������࣬��Ϊ�����һ����ϳɷ�
	private Animal a;
	public Wolf(Animal a)
	{
		this.a = a;
	}
	// ���¶���һ���Լ���breathe()����
	public void breathe()
	{
		// ֱ�Ӹ���Animal�ṩ��breathe()������ʵ��Wolf��breathe()������
		a.breathe();
	}
	public void run()
	{
		System.out.println("����½���ϵĿ��ٱ���...");
	}
}
public class CompositeTest
{
	public static void main(String[] args)
	{
		// ��ʱ��Ҫ��ʽ��������ϵĶ���
		var a1 = new Animal();
		var b = new Bird(a1);
		b.breathe();
		b.fly();
		// ��ʱ��Ҫ��ʽ��������ϵĶ���
		var a2 = new Animal();
		var w = new Wolf(a2);
		w.breathe();
		w.run();
	}
}
