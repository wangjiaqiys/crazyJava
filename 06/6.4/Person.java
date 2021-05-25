

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
class Name
{
	private String firstName;
	private String lastName;
	public Name(){}
	public Name(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	// ʡ��firstName��lastName��setter��getter����
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getLastName()
	{
		return this.lastName;
	}
}
public class Person
{
	private final Name name;
	public Person(Name name)
	{
//		this.name = name;
		// ����nameʵ������Ϊ��ʱ������Name���󣬸ö����firstName��lastName
		// �봫���name������firstName��lastName��ͬ
		this.name = new Name(name.getFirstName(), name.getLastName());
	}
	public Name getName()
	{
//		return name;
		// ����һ���������󣬸ö����firstName��lastName
		// ��ö������name��firstName��lastName��ͬ
		return new Name(name.getFirstName(), name.getLastName());
	}
	public static void main(String[] args)
	{
		var n = new Name("���", "��");
		var p = new Person(n);
		// Person�����name��firstNameֵΪ"���"
		System.out.println(p.getName().getFirstName());
		// �ı�Person����name��firstNameֵ
		n.setFirstName("�˽�");
		// Person�����name��firstNameֵ����Ϊ"�˽�"
		System.out.println(p.getName().getFirstName());
	}
}
