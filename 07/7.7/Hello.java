
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
public class Hello
{
	public static void main(String[] args)
	{
		// ȡ��ϵͳĬ�ϵĹ���/���Ի���
		var myLocale = Locale.getDefault(Locale.Category.FORMAT);
		// ����ָ������/���Ի���������Դ�ļ�
		var bundle = ResourceBundle.getBundle("mess", myLocale);
		// ��ӡ����Դ�ļ���ȡ�õ���Ϣ
		System.out.println(bundle.getString("hello"));
	}
}
