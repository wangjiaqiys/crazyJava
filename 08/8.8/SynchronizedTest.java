
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
public class SynchronizedTest
{
	public static void main(String[] args)
	{
		// ������򴴽����ĸ��̰߳�ȫ�ļ��϶���
		var c = Collections
			.synchronizedCollection(new ArrayList());
		var list = Collections.synchronizedList(new ArrayList());
		var s = Collections.synchronizedSet(new HashSet());
		var m = Collections.synchronizedMap(new HashMap());
	}
}
