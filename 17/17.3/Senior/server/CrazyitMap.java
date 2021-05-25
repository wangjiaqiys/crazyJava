
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
// ͨ�����HashMap������ʵ��CrazyitMap��CrazyitMapҪ��valueҲ�����ظ�
public class CrazyitMap<K, V>
{
	// ����һ���̰߳�ȫ��HashMap
	public Map<K, V> map = Collections.synchronizedMap(new HashMap<K, V>());
	// ����value��ɾ��ָ����
	public synchronized void removeByValue(Object value)
	{
		for (var key : map.keySet())
		{
			if (map.get(key) == value || map.get(key).equals(value))
			{
				map.remove(key);
				break;
			}
		}
	}
	// ��ȡ����value��ɵ�Set����
	public synchronized Set<V> valueSet()
	{
		Set<V> result = new HashSet<>();
		// ��map������value��ӵ�result������
		map.forEach((key, value) -> result.add(value));
		return result;
	}
	// ����value����key��
	public synchronized K getKeyByValue(V val)
	{
		// ��������key��ɵļ���
		for (var key : map.keySet())
		{
			// ���ָ��key��Ӧ��value�뱻������value��ͬ���򷵻ض�Ӧ��key
			if (map.get(key) == val || map.get(key).equals(val))
			{
				return key;
			}
		}
		return null;
	}
	// ʵ��put()�������÷���������value�ظ�
	public synchronized V put(K key, V value)
	{
		// ��������value��ɵļ���
		for (var val : valueSet() )
		{
			// ���ĳ��value����ͼ���뼯�ϵ�value��ͬ
			// ���׳�һ��RuntimeException�쳣
			if (val.equals(value)
				&& val.hashCode()== value.hashCode())
			{
				throw new RuntimeException("CrazyitMapʵ���в��������ظ�value!");
			}
		}
		return map.put(key, value);
	}
}
