
import java.util.Objects;
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
public class ObjectsTest
{
	// ����һ��obj����������Ĭ��ֵ��null
	static ObjectsTest obj;
	public static void main(String[] args)
	{
		// ���һ��null�����hashCodeֵ�����0
		System.out.println(Objects.hashCode(obj));
		// ���һ��null�����toString�����null
		System.out.println(Objects.toString(obj));
		// Ҫ��obj����Ϊnull�����objΪnull�������쳣
		System.out.println(Objects.requireNonNull(obj,
			"obj����������null��"));
	}
}