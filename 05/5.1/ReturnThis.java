

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
public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		// return this���ص��ø÷����Ķ���
		return this;
	}
	public static void main(String[] args)
	{
		var rt = new ReturnThis();
		// ������������ͬһ������
		rt.grow()
			.grow()
			.grow();
		System.out.println("rt��age��Ա����ֵ��:" + rt.age);
	}
}

