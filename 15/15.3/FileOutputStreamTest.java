
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
public class FileOutputStreamTest
{
	public static void main(String[] args)
	{
		try (
			// �����ֽ�������
			var fis = new FileInputStream("FileOutputStreamTest.java");
			// �����ֽ������
			var fos = new FileOutputStream("newFile.txt"))
		{
			var bbuf = new byte[32];
			var hasRead = 0;
			// ѭ������������ȡ������
			while ((hasRead = fis.read(bbuf)) > 0)
			{
				// ÿ��ȡһ�Σ���д���ļ�����������˶��٣���д���١�
				fos.write(bbuf, 0, hasRead);
			}
		}
		catch (IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
