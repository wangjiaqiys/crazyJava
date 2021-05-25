
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
public class GenericMethodTest
{
	// ����һ�����ͷ������÷��ͷ����д�һ��T�����βΣ�
	static <T> void fromArrayToCollection(T[] a, Collection<T> c)
	{
		for (T o : a)
		{
			c.add(o);
		}
	}
	public static void main(String[] args)
	{
		var oa = new Object[100];
		Collection<Object> co = new ArrayList<>();
		// ���������T����Object����
		fromArrayToCollection(oa, co);
		var sa = new String[100];
		Collection<String> cs = new ArrayList<>();
		// ���������T����String����
		fromArrayToCollection(sa, cs);
		// ���������T����Object����
		fromArrayToCollection(sa, co);
		var ia = new Integer[100];
		var fa = new Float[100];
		var na = new Number[100];
		Collection<Number> cn = new ArrayList<>();
		// ���������T����Number����
		fromArrayToCollection(ia, cn);
		// ���������T����Number����
		fromArrayToCollection(fa, cn);
		// ���������T����Number����
		fromArrayToCollection(na, cn);
		// ���������T����Object����
		fromArrayToCollection(na, co);
		// ���������T����String���ͣ���na��һ��Number���飬
		// ��ΪNumber�Ȳ���String���ͣ�
		// Ҳ�����������࣬���Գ��ֱ������
//		fromArrayToCollection(na, cs);
	}
}

