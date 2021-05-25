
import java.time.*;
import java.time.format.*;
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
public class NewFormatterParse
{
	public static void main(String[] args)
	{
		// ����һ�������ʽ������ʱ���ַ���
		var str1 = "2014==04==12 01ʱ06��09��";
		// ������Ҫ���������ڡ�ʱ���ַ�������������õĸ�ʽ��
		var fomatter1 = DateTimeFormatter
			.ofPattern("yyyy==MM==dd HHʱmm��ss��");
		// ִ�н���
		var dt1 = LocalDateTime.parse(str1, fomatter1);
		System.out.println(dt1); // ��� 2014-04-12T01:06:09
		// ---��������ٴν�����һ���ַ���---
		var str2 = "2014$$$4��$$$13 20Сʱ";
		var fomatter2 = DateTimeFormatter
			.ofPattern("yyy$$$MMM$$$dd HHСʱ");
		var dt2 = LocalDateTime.parse(str2, fomatter2);
		System.out.println(dt2); // ��� 2014-04-13T20:00

	}
}
