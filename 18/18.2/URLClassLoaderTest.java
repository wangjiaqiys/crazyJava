
import java.sql.*;
import java.util.*;
import java.net.*;
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
public class URLClassLoaderTest
{
	private static Connection conn;
	// ����һ����ȡ���ݿ����ӷ���
	public static Connection getConn(String url,
		String user, String pass) throws Exception
	{
		if (conn == null)
		{
			// ����һ��URL����
			URL[] urls = {new URL(
				"file:mysql-connector-java-8.0.13.jar")};
			// ��Ĭ�ϵ�ClassLoader��Ϊ��ClassLoader������URLClassLoader
			var myClassLoader = new URLClassLoader(urls);
			// ����MySQL��JDBC������������Ĭ��ʵ��
			var driver = (Driver) myClassLoader
				.loadClass("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			// ����һ������JDBC�������Ե�Properties����
			var props = new Properties();
			// ������ҪΪ�ö�����user��password��������
			props.setProperty("user", user);
			props.setProperty("password", pass);
			// ����Driver�����connect������ȡ�����ݿ�����
			conn = driver.connect(url, props);
		}
		return conn;
	}
	public static void main(String[] args) throws Exception
	{
		System.out.println(getConn(
			"jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC",
			"root", "32147"));
	}
}

