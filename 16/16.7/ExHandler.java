

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
// �����Լ����쳣������
class MyExHandler implements Thread.UncaughtExceptionHandler
{
	// ʵ��uncaughtException�������÷����������̵߳�δ�����쳣
	public void uncaughtException(Thread t, Throwable e)
	{
		System.out.println(t + " �̳߳������쳣��" + e);
	}
}
public class ExHandler
{
	public static void main(String[] args)
	{
		// �������̵߳��쳣������
		Thread.currentThread().setUncaughtExceptionHandler
			(new MyExHandler());
		var a = 5 / 0;     // ��
		System.out.println("��������������");
	}
}
