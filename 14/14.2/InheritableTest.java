

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
// ʹ��@Inheritable���ε�Base��
@Inheritable
class Base
{
}
// TestInheritable��ֻ�Ǽ̳���Base�࣬
// ��δֱ��ʹ��@Inheritableע������
public class InheritableTest extends Base
{
	public static void main(String[] args)
	{
		// ��ӡTestInheritable���Ƿ����@Inheritable����
		System.out.println(InheritableTest.class
			.isAnnotationPresent(Inheritable.class));
	}
}

