
package yeeku;
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

public class OutputFieldTest
{
	public static void main(String[] args)
	{
		// ������һ�����е�Output�ӿڵ�MAX_CACHE_LINE
		System.out.println(lee.Output.MAX_CACHE_LINE);
		// ������佫����"Ϊfinal������ֵ"�ı����쳣
		// lee.Output.MAX_CACHE_LINE = 20;
		// ʹ�ýӿ��������෽��
		System.out.println(lee.Output.staticTest());
	}
}