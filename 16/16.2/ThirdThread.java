
import java.util.concurrent.*;
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

public class ThirdThread
{
	public static void main(String[] args)
	{
		// ����Callable����
		var rt = new ThirdThread();
		// ��ʹ��Lambda���ʽ����Callable<Integer>����
		// ʹ��FutureTask����װCallable����
		FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)() -> {
			var i = 0;
			for ( ; i < 100; i++)
			{
				System.out.println(Thread.currentThread().getName()
					+ " ��ѭ������i��ֵ��" + i);
			}
			// call()���������з���ֵ
			return i;
		});
		for (var i = 0; i < 100; i++)
		{
			System.out.println(Thread.currentThread().getName()
				+ " ��ѭ������i��ֵ��" + i);
			if (i == 20)
			{
				// ʵ�ʻ�����Callable�������������������߳�
				new Thread(task, "�з���ֵ���߳�").start();
			}
		}
		try
		{
			// ��ȡ�̷߳���ֵ
			System.out.println("���̵߳ķ���ֵ��" + task.get());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

