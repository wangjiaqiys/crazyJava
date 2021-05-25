
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
public class ListIteratorTest
{
	public static void main(String[] args)
	{
		String[] books = {
			"���Java����", "���iOS����",
			"������Java EE��ҵӦ��ʵս"
		};
		var bookList = new ArrayList();
		for (var i = 0; i < books.length; i++)
		{
			bookList.add(books[i]);
		}
		var lit = bookList.listIterator();
		// ��ǰ������
		while (lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("-------�ָ���-------");
		}
		System.out.println("=======���濪ʼ�������=======");
		// �Ӻ���ǰ����
		while (lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
