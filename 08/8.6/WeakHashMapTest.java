
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
public class WeakHashMapTest
{
	public static void main(String[] args)
	{
		var whm = new WeakHashMap();
		// ��WeakHashMap����������key-value�ԣ�
		// ����key���������ַ�������û���������ã�
		whm.put(new String("����"), new String("����"));
		whm.put(new String("��ѧ"), new String("����"));
		whm.put(new String("Ӣ��"), new String("�е�"));
		//�� WeakHashMap������һ��key-value�ԣ�
		// ��key��һ��ϵͳ������ַ�������
		whm.put("java", new String("�е�"));    // ��
		// ���whm���󣬽�����4��key-value�ԡ�
		System.out.println(whm);
		// ֪ͨϵͳ����������������
		System.gc();
		System.runFinalization();
		// ͨ������£���ֻ����һ��key-value�ԡ�
		System.out.println(whm);
	}
}