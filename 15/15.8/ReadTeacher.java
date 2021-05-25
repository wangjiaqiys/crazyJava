
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
public class ReadTeacher
{
	public static void main(String[] args)
	{
		try (
			// ����һ��ObjectInputStream�����
			var ois = new ObjectInputStream(new FileInputStream("teacher.txt")))
		{
			// ���ζ�ȡObjectInputStream�������е��ĸ�����
			var t1 = (Teacher) ois.readObject();
			var t2 = (Teacher) ois.readObject();
			var p = (Person) ois.readObject();
			var t3 = (Teacher) ois.readObject();
			// ���true
			System.out.println("t1��student���ú�p�Ƿ���ͬ��"
				+ (t1.getStudent() == p));
			// ���true
			System.out.println("t2��student���ú�p�Ƿ���ͬ��"
				+ (t2.getStudent() == p));
			// ���true
			System.out.println("t2��t3�Ƿ���ͬһ������"
				+ (t2 == t3));
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
