

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

@interface NotNull{}
interface Predator
{
	void prey(@NotNull String animal);
}
public class VarInLambda
{
	public static void main(String[] args)
	{
		// ʹ��Lambda���ʽ��var������ֵ
		// ������ʽָ��Lambda���ʽ��Ŀ������
		var run = (Runnable)() -> {
			for (var i = 0; i < 100; i++)
			{
				System.out.println();
			}
		};
		// ʹ��var����Lambda���ʽ���β����ͣ�
		// ��������ΪLambda���ʽ���β����@NotNullע��
		Predator predator = (@NotNull var animal) -> {
			System.out.println("��ӥ�����Բ�" + animal);
		};
		predator.prey("����");
	}
}
