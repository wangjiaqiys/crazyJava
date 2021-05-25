
import java.sql.*;
import java.util.*;
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
public class DatabaseMetaDataTest
{
	private String driver;
	private String url;
	private String user;
	private String pass;
	public void initParam(String paramFile) throws Exception
	{
		// ʹ��Properties�������������ļ�
		var props = new Properties();
		props.load(new FileInputStream(paramFile));
		driver = props.getProperty("driver");
		url = props.getProperty("url");
		user = props.getProperty("user");
		pass = props.getProperty("pass");
	}
	public void info() throws Exception
	{
		// ��������
		Class.forName(driver);
		try (
			// ��ȡ���ݿ�����
			Connection conn = DriverManager.getConnection(url, user, pass))
		{
			// ��ȡ��DatabaseMetaData����
			DatabaseMetaData dbmd = conn.getMetaData();
			// ��ȡMySQL֧�ֵ����б�����
			ResultSet rs = dbmd.getTableTypes();
			System.out.println("--MySQL֧�ֵı�������Ϣ--");
			printResultSet(rs);
			// ��ȡ��ǰ���ݿ��ȫ�����ݱ�
			rs = dbmd.getTables("select_test", null, "%", new String[]{"TABLE"});
			System.out.println("--��ǰ���ݿ�������ݱ���Ϣ--");
			printResultSet(rs);
			// ��ȡstudent_table�������
			rs = dbmd.getPrimaryKeys("select_test", null, "student_table");
			System.out.println("--student_table���������Ϣ--");
			printResultSet(rs);
			// ��ȡ��ǰ���ݿ��ȫ���洢����
			rs = dbmd.getProcedures("select_test", null, "%");
			System.out.println("--��ǰ���ݿ���Ĵ洢������Ϣ--");
			printResultSet(rs);
			// ��ȡteacher_table���student_table֮������Լ��
			rs = dbmd.getCrossReference("select_test", null, "teacher_table",
				null, null, "student_table");
			System.out.println("--teacher_table���student_table֮��"
				+ "�����Լ��--");
			printResultSet(rs);
			// ��ȡstudent_table���ȫ��������
			rs = dbmd.getColumns("select_test", null, "student_table", "%");
			System.out.println("--student_table���ȫ��������--");
			printResultSet(rs);
		}
	}
	public void printResultSet(ResultSet rs) throws SQLException
	{
		ResultSetMetaData rsmd = rs.getMetaData();
		// ��ӡResultSet�������б���
		for (var i = 0; i < rsmd.getColumnCount(); i++)
		{
			System.out.print(rsmd.getColumnName(i + 1) + "\t");
		}
		System.out.print("\n");
		// ��ӡResultSet���ȫ������
		while (rs.next())
		{
			for (var i = 0; i < rsmd.getColumnCount(); i++)
			{
				System.out.print(rs.getString(i + 1) + "\t");
			}
			System.out.print("\n");
		}
		rs.close();
	}
	public static void main(String[] args) throws Exception
	{
		var dt = new DatabaseMetaDataTest();
		dt.initParam("mysql.ini");
		dt.info();
	}
}
