
import java.io.*;
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
public class OverrideThrows
{
	public void test() throws IOException
	{
		var fis = new FileInputStream("a.txt");
	}
}
class Sub extends OverrideThrows
{
	// ���෽�������׳��˱ȸ��෽��������쳣
	// �������淽������
	public void test() throws Exception
	{
	}
}

