

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
public class DivTest
{
	public static void main(String[] args)
	{
		try
		{
			var a = Integer.parseInt(args[0]);
			var b = Integer.parseInt(args[1]);
			var c = a / b;
			System.out.println("�����������������Ľ���ǣ�" + c );
		}
		catch (IndexOutOfBoundsException ie)
		{
			System.out.println("����Խ�磺���г���ʱ����Ĳ�����������");
		}
		catch (NumberFormatException ne)
		{
			System.out.println("���ָ�ʽ�쳣������ֻ�ܽ�����������");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("�����쳣");
		}
		catch (Exception e)
		{
			System.out.println("δ֪�쳣");
		}
	}
}

