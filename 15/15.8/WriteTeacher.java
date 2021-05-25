
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
public class WriteTeacher
{
	public static void main(String[] args)
	{
		try (
			// ����һ��ObjectOutputStream�����
			var oos = new ObjectOutputStream(new FileOutputStream("teacher.txt")))
		{
			var per = new Person("�����", 500);
			var t1 = new Teacher("��ɮ", per);
			var t2 = new Teacher("������ʦ", per);
			// ���ν��ĸ�����д�������
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(per);
			oos.writeObject(t2);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}

