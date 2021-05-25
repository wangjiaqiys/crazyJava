
import java.lang.ref.*;
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
public class ReferenceTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ����һ���ַ�������
		var str = new String("���Java����");
		// ����һ�������ã��ô����������õ�"���Java����"�ַ���
		var wr = new WeakReference(str);  // ��
		// �ж�str���ú�"���Java����"�ַ���֮�������
		str = null;   // ��
		// ȡ�������������õĶ���
		System.out.println(wr.get());  // ��
		// ǿ����������
		System.gc();
		System.runFinalization();
		// �ٴ�ȡ�������������õĶ���
		System.out.println(wr.get());  // ��
	}
}
