
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
public class FilenameFilterTest
{
	public static void main(String[] args)
	{
		var file = new File(".");
		// ʹ��Lambda���ʽ��Ŀ������ΪFilenameFilter��ʵ���ļ���������
		// ����ļ�����.java��β�������ļ���Ӧһ��·��������true
		String[] nameList = file.list((dir, name) -> name.endsWith(".java")
			|| new File(name).isDirectory());
		for (var name : nameList)
		{
			System.out.println(name);
		}
	}
}
