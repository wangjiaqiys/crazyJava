

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
public class Primitive2String
{
	public static void main(String[] args)
	{
		var intStr = "123";
		// ��һ���ض��ַ���ת����int����
		var it1 = Integer.parseInt(intStr);
		var it2 = Integer.valueOf(intStr);
		System.out.println(it2);
		var floatStr = "4.56";
		// ��һ���ض��ַ���ת����float����
		var ft1 = Float.parseFloat(floatStr);
		var ft2 = Float.valueOf(floatStr);
		System.out.println(ft2);
		// ��һ��float����ת����String����
		var ftStr = String.valueOf(2.345f);
		System.out.println(ftStr);
		// ��һ��double����ת����String����
		var dbStr = String.valueOf(3.344);
		System.out.println(dbStr);
		// ��һ��boolean����ת����String����
		var boolStr = String.valueOf(true);
		System.out.println(boolStr.toUpperCase());


// itStr��ֵΪ"5"
var itStr = 5 + "";
	}
}
