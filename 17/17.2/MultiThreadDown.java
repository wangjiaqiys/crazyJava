

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
public class MultiThreadDown
{
	public static void main(String[] args) throws Exception
	{
		// ��ʼ��DownUtil����
		final var downUtil = new DownUtil("http://www.crazyit.org/"
			+ "data/attachment/forum/month_1403/1403202355ff6cc9a4fbf6f14a.png",
			"ios.png", 4);
			http://www.crazyit.org/data/attachment/forum/month_1311/1311092150039af73ef435c9e0.jpg
		// ��ʼ����
		downUtil.download();
		new Thread(() -> {
				while (downUtil.getCompleteRate() < 1)
				{
					// ÿ��0.1���ѯһ���������ɽ��ȣ�
					// GUI�����пɸ��ݸý��������ƽ�����
					System.out.println("����ɣ�" + downUtil.getCompleteRate());
					try
					{
						Thread.sleep(100);
					}
					catch (Exception ex){}
				}
		}).start();
	}
}
