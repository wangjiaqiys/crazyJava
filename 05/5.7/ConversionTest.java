

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
public class ConversionTest
{
	public static void main(String[] args)
	{
		var d = 13.4;
		var l = (long) d;
		System.out.println(l);
		var in = 5;
		// ��ͼ��һ����ֵ���͵ı���ת��Ϊboolean���ͣ��������������
		// ����ʱ�����ʾ: ����ת��������
//		var b = (boolean) in;
		Object obj = "Hello";
		// obj�����ı�������ΪObject��Object��String���ڼ̳й�ϵ������ǿ������ת��
		// ����obj����ʵ����������String���ͣ���������ʱҲ��ͨ��
		var objStr = (String) obj;
		System.out.println(objStr);
		// ����һ��objPri��������������ΪObject��ʵ������ΪInteger
		Object objPri = Integer.valueOf(5);
		// objPri�����ı���ʱ����ΪObject��objPri������ʱ����ΪInteger��Object��Integer���ڼ̳й�ϵ
		// ����ǿ������ת������objPri����ʵ����������Integer���ͣ�
		// ���������������ʱ����ClassCastException�쳣
//		var str = (String) objPri;
	}
}

