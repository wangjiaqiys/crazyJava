

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
public class DaemonThread extends Thread
{
	// �����̨�̵߳��߳�ִ��������ͨ�߳�û���κ�����
	public void run()
	{
		for (var i = 0; i < 1000; i++)
		{
			System.out.println(getName() + "  " + i);
		}
	}
	public static void main(String[] args)
	{
		var t = new DaemonThread();
		// �����߳����óɺ�̨�߳�
		t.setDaemon(true);
		// ������̨�߳�
		t.start();
		for (var i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName()
				+ "  " + i);
		}
		// -----����ִ�е��˴���ǰ̨�̣߳�main�̣߳�����------
		// ��̨�߳�ҲӦ����֮����
	}
}
