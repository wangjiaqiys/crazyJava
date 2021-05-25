
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
public class IteratorEach
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
		// ʹ��Lambda���ʽ��Ŀ��������Comsumer������������Ԫ��
		it.forEachRemaining(obj -> System.out.println("��������Ԫ�أ�" + obj));
	}
}
