
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
public class WriteObject
{
	public static void main(String[] args)
	{
		try (
			// ����һ��ObjectOutputStream�����
			var oos = new ObjectOutputStream(new FileOutputStream("object.txt")))
		{
			var per = new Person("�����", 500);
			// ��per����д�������
			oos.writeObject(per);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

