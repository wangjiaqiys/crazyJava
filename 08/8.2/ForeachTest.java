
import java.util.*;
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
public class ForeachTest
{
	public static void main(String[] args)
	{
		// �������ϡ����Ԫ�صĴ�����ǰһ��������ͬ
		var books = new HashSet();
		books.add(new String("������Java EE��ҵӦ��ʵս"));
		books.add(new String("���Java����"));
		books.add(new String("���Android����"));
		for (var obj : books)
		{
			// �˴���book����Ҳ���Ǽ���Ԫ�ر���
			var book = (String) obj;
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				// ������������ConcurrentModificationException�쳣
				books.remove(book);     // ��
			}
		}
		System.out.println(books);
	}
}
