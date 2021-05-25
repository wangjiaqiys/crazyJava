
import java.lang.reflect.*;
import java.util.*;
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
public class NestTest
{
	public class InA
	{
		// �ڲ��������private��Ա
		private int age = 2;
		private void foo()
		{
			System.out.println("private��foo����");
		}
	}
	public class InB
	{
		// �ڲ��������private��Ա
		private String name = "���Java";
		private void bar() throws Exception
		{
			InA a = new InA();
			// ��������һ���ڲ����private��Ա����ȫû����
			a.age = 20;
			System.out.println(a.age);
			a.foo();
			System.out.println("private��bar����");
			// ͨ�������������һ���ڲ����private��Ա
			// ��Java 11֮ǰ����Java 11֮��û������
			Field f = InA.class.getDeclaredField("age");
			f.set(a, 29);           // ��
			System.out.println(f.get(a));    // ��
			Method m = InA.class.getDeclaredMethod("foo");
			m.invoke(a);            // ��
		}
	}
	public void info() throws Exception
	{
		InB b = new InB();
		// �ⲿ������ڲ����private��Ա����ȫû����
		b.name = "crazyit.org";
		System.out.println(b.name);
		b.bar();
		// �ⲿ��ͨ����������ڲ����private��Ա
		// ��Java 11֮ǰ����Java 11֮��û������
		Field f = InB.class.getDeclaredField("name");
		f.set(b, "fkjava.org");           // ��
		System.out.println(f.get(b));     // ��
		Method m = InB.class.getDeclaredMethod("bar");
		m.invoke(b);            // ��
	}
	public static void main(String[] args) throws Exception
	{
		new NestTest().info();
		// ��ȡNestTest��Ƕ�������࣬��������������ⲿ�࣬��˷���������NestTest��
		System.out.println(NestTest.class.getNestHost());
		// ��ȡNestTest.InA��Ƕ�������࣬����NestTest��
		System.out.println(Class.forName("NestTest$InA").getNestHost());
		// ��ȡNestTest������Ƕ�׳�Ա�����ῴ��NestTest��InA��InB����Ƕ�׳�Ա
		System.out.println(Arrays.toString(NestTest.class.getNestMembers()));
		// �ж�NestTest.InA�Ƿ�ΪNestTest.InB��Ƕ��ͬ�飬����true
		System.out.println(Class.forName("NestTest$InA")
			.isNestmateOf(Class.forName("NestTest$InB")));
	}
}