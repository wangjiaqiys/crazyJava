
import java.io.*;
import java.util.*;
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
public class ReplaceTest
{
	public static void main(String[] args)
	{
		try (
			// ����һ��ObjectOutputStream�����
			var oos = new ObjectOutputStream(new FileOutputStream("replace.txt"));
			// ����һ��ObjectInputStream������
			var ois = new ObjectInputStream(new FileInputStream("replace.txt")))
		{
			var per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			// �����л���ȡ�õ�����ArrayList
			var list = (ArrayList) ois.readObject();
			System.out.println(list);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}

