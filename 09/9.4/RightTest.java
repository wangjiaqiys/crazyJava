
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
public class RightTest
{
	// ����һ�����ͷ������÷��ͷ����д�һ��T�β�
	static <T> void test(Collection<? extends T> from, Collection<T> to)
	{
		for (var ele : from)
		{
			to.add(ele);
		}
	}
	public static void main(String[] args)
	{
		List<Object> ao = new ArrayList<>();
		List<String> as = new ArrayList<>();
		// ���������ȫ����
		test(as, ao);
	}
}
