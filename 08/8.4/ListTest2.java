
import java.util.*;
/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 5.0
 */
class A
{
	public boolean equals(Object obj)
	{
		return true;
	}
}
public class ListTest2
{
	public static void main(String[] args)
	{
		var books = new ArrayList();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		System.out.println(books);
		// ɾ�������е�A���󣬽����µ�һ��Ԫ�ر�ɾ��
		books.remove(new A());	 // ��
		System.out.println(books);
		// ɾ�������е�A�����ٴ�ɾ�������еĵ�һ��Ԫ��
		books.remove(new A());	 // ��
		System.out.println(books);
	}
}
