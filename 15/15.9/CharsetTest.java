
import java.nio.charset.*;
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
public class CharsetTest
{
	public static void main(String[] args)
	{
		// ��ȡJava֧�ֵ�ȫ���ַ���
		SortedMap<String, Charset> map = Charset.availableCharsets();
		for (var alias : map.keySet())
		{
			// ����ַ����ı����Ͷ�Ӧ��Charset����
			System.out.println(alias + "----->"
				+ map.get(alias));
		}
	}
}
