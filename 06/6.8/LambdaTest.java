

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
@FunctionalInterface
interface FkTest
{
	void run();
}

public class LambdaTest
{
	public static void main(String[] args)
	{
		// Runnable�ӿ���ֻ����һ���޲����ķ���
		// Lambda���ʽ�������������ʵ����Runnable�ӿ���Ψһ�ġ��޲����ķ���
		// ��������Lambda���ʽ������һ��Runnable����
		Runnable r = () -> {
			for (var i = 0; i < 100; i++)
			{
				System.out.println(i);
			}
		};
//		// ������뱨��: �����ݵ�����: Object���Ǻ����ӿ�
//		Object obj = () -> {
//			for (var i = 0; i < 100; i++)
//			{
//				System.out.println(i);
//			}
//		};

		Object obj1 = (Runnable)() -> {
			for (var i = 0; i < 100; i++)
			{
				System.out.println(i);
			}
		};

		// ͬ����Lambda���ʽ���Ա����ɲ�ͬ��Ŀ�����ͣ�Ψһ��Ҫ���ǣ�
		// Lambda���ʽ���β��б��뺯��ʽ�ӿ���Ψһ�ĳ��󷽷����β��б���ͬ
		Object obj2 = (FkTest)() -> {
			for (var i = 0; i < 100; i++)
			{
				System.out.println();
			}
		};

	}
}
