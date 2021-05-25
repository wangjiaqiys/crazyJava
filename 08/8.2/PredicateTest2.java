
import java.util.*;
import java.util.function.*;
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
public class PredicateTest2
{
	public static void main(String[] args)
	{
		// ����books���ϡ�Ϊbooks�������Ԫ�صĴ�����ǰһ��������ͬ��
		var books = new HashSet();
		books.add("������Java EE��ҵӦ��ʵս");
		books.add("���Java����");
		books.add("���iOS����");
		books.add("���Ajax����");
		books.add("���Android����");
		// ͳ����������������Ӵ���ͼ������
		System.out.println(calAll(books, ele->((String) ele).contains("���")));
		// ͳ������������Java���Ӵ���ͼ������
		System.out.println(calAll(books, ele->((String) ele).contains("Java")));
		// ͳ�������ַ������ȴ���10��ͼ������
		System.out.println(calAll(books, ele->((String) ele).length() > 10));
	}
	public static int calAll(Collection books, Predicate p)
	{
		int total = 0;
		for (var obj : books)
		{
			// ʹ��Predicate��test()�����жϸö����Ƿ�����Predicateָ��������
			if (p.test(obj))
			{
				total++;
			}
		}
		return total;
	}
}
