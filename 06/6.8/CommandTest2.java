

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
public class CommandTest2
{
	public static void main(String[] args)
	{
		var pa = new ProcessArray();
		int[] array = {3, -4, 6, 4};
		// �������飬���崦����Ϊȡ���������ڲ���
		pa.process(array, (int element)->{
				System.out.println("����Ԫ�ص�ƽ����:" + element * element);
			});
	}
}
