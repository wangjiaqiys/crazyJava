
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
public class TimeZoneTest
{
	public static void main(String[] args)
	{
		// ȡ��Java��֧�ֵ�����ʱ��ID
		String[] ids = TimeZone.getAvailableIDs();
		System.out.println(Arrays.toString(ids));
		TimeZone my = TimeZone.getDefault();
		// ��ȡϵͳĬ��ʱ����ID:Asia/Shanghai
		System.out.println(my.getID());
		// ��ȡϵͳĬ��ʱ�������ƣ��й���׼ʱ��
		System.out.println(my.getDisplayName());
		// ��ȡָ��ID��ʱ�������ƣ�Ŧ������׼ʱ��
		System.out.println(TimeZone
			.getTimeZone("CNT").getDisplayName());
	}
}