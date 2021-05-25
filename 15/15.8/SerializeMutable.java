
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
public class SerializeMutable
{
	public static void main(String[] args)
	{

		try (
			// ����һ��ObjectOutputStream������
			var oos = new ObjectOutputStream(new FileOutputStream("mutable.txt"));
			// ����һ��ObjectInputStream������
			var ois = new ObjectInputStream(new FileInputStream("mutable.txt")))
		{
			var per = new Person("�����", 500);
			// ϵͳ��per����ת���ֽ����в����
			oos.writeObject(per);
			// �ı�per�����nameʵ������
			per.setName("��˽�");
			// ϵͳֻ��������л���ţ����Ըı���name���ᱻ���л�
			oos.writeObject(per);
			var p1 = (Person) ois.readObject();    // ��
			var p2 = (Person) ois.readObject();    // ��
			// �������true���������л���p1����p2
			System.out.println(p1 == p2);
			// ������Ȼ�������"�����"�����ı���ʵ������û�б����л�
			System.out.println(p2.getName());
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}