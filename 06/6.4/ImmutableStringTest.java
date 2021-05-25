

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
public class ImmutableStringTest
{
	public static void main(String[] args)
	{
		var str1 = new String("Hello");
		var str2 = new String("Hello");
		System.out.println(str1 == str2); // ���false
		System.out.println(str1.equals(str2)); // ���true
		// �������������hashCode��ͬ
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
