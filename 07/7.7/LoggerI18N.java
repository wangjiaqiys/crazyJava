
import java.util.logging.*;
import java.util.*;
/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2020, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 5.0
 */
public class LoggerI18N
{
	public static void main(String[] args) throws Exception
	{
		// ���ع��ʻ���Դ��
		var rb = ResourceBundle.getBundle("logMess",
			Locale.getDefault(Locale.Category.FORMAT));
		// ��ȡSystem.Logger����
		var logger = System.getLogger("fkjava", rb);
		// ����ϵͳ��־����
		Logger.getLogger("fkjava").setLevel(Level.INFO);
		// ����ʹ��a.xml������־��¼
		Logger.getLogger("fkjava").addHandler(new FileHandler("a.xml"));
		// ����3�������ĵڶ��������ǹ��ʻ���Ϣ��key
		logger.log(System.Logger.Level.DEBUG, "debug");
		logger.log(System.Logger.Level.INFO, "info");
		logger.log(System.Logger.Level.ERROR, "error");
	}
}
