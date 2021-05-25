
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
public class TransientTest
{
	public static void main(String[] args)
	{
		try (
			// ����һ��ObjectOutputStream�����
			var oos = new ObjectOutputStream(new FileOutputStream("transient.txt"));
			// ����һ��ObjectInputStream������
			var ois = new ObjectInputStream(new FileInputStream("transient.txt")))
		{
			var per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			var p = (Person) ois.readObject();
			System.out.println(p.getAge());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
