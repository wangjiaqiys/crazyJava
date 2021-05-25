
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
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
public class RandomFileChannelTest
{
	public static void main(String[] args)
		throws IOException
	{
		var f = new File("a.txt");
		try (
			// ����һ��RandomAccessFile����
			var raf = new RandomAccessFile(f, "rw");
			// ��ȡRandomAccessFile��Ӧ��Channel
			FileChannel randomChannel = raf.getChannel())
		{
			// ��Channel����������ӳ���ByteBuffer
			ByteBuffer buffer = randomChannel.map(FileChannel
				.MapMode.READ_ONLY, 0, f.length());
			// ��Channel�ļ�¼ָ���ƶ������
			randomChannel.position(f.length());
			// ��buffer�������������
			randomChannel.write(buffer);
		}
	}
}
