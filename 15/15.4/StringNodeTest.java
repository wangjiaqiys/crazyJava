
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
public class StringNodeTest
{
	public static void main(String[] args)
	{
		var src = "����������һ���Ҹ�����\n"
			+ "ι��������������\n"
			+ "�������𣬹�����ʳ���߲�\n"
			+ "����һ�����ӣ��泯�󺣣���ů����\n"
			+ "�������𣬺�ÿһ������ͨ��\n"
			+ "���������ҵ��Ҹ�\n";
		var buffer = new char[32];
		var hasRead = 0;
		try (
			var sr = new StringReader(src))
		{
			// ����ѭ����ȡ�ķ��ʶ�ȡ�ַ���
			while ((hasRead = sr.read(buffer)) > 0)
			{
				System.out.print(new String(buffer, 0, hasRead));
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
		try (
			// ����StringWriterʱ��ʵ������һ��StringBuffer��Ϊ����ڵ�
			// ����ָ����20����StringBuffer�ĳ�ʼ����
			var sw = new StringWriter(20))
		{
			// ����StringWriter�ķ���ִ�����
			sw.write("��һ�������������磬\n");
			sw.write("����Զ������,\n");
			sw.write("����������ĺ��ӣ�\n");
			sw.write("���й���ľ���\n");
			System.out.println("----������sw���ַ����ڵ��������----");
			// ʹ��toString()��������StringWriter���ַ����ڵ������
			System.out.println(sw.toString());
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
