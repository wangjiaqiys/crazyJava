
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
public class PhantomReferenceTest
{
	public static void main(String[] args)
		throws Exception
	{
		// ����һ���ַ�������
		var str = new String("���Java����");
		// ����һ�����ö���
		var rq = new ReferenceQueue();
		// ����һ�������ã��ô����������õ�"���Java����"�ַ���
		var pr = new PhantomReference(str, rq);
		// �ж�str���ú�"���Java����"�ַ���֮�������
		str = null;
		// ȡ�������������õĶ��󣬲�����ͨ�������û�ȡ�����õĶ������Դ˴����null
		System.out.println(pr.get());  // ��
		// ǿ����������
		System.gc();
		System.runFinalization();
		// ��������֮�������ý����������ö�����
		// ȡ�����ö��������Ƚ�������е�������pr���бȽ�
		System.out.println(rq.poll() == pr);   // ��
	}
}
