
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
public class IteratorErrorTest
{
	public static void main(String[] args)
	{
		// �������ϡ����Ԫ�صĴ�����ǰһ��������ͬ
		var books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���Android����");
		// ��ȡbooks���϶�Ӧ�ĵ�����
		var it = books.iterator();
		while (it.hasNext())
		{
			var book = (String) it.next();
			System.out.println(book);
			if (book.equals("���Android����"))
			{
				// ʹ��Iterator���������У������޸ļ���Ԫ��,������������쳣
				books.remove(book);
			}
		}
	}
}

