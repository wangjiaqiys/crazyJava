
import javax.annotation.processing.*;
import javax.lang.model.element.*;
import javax.lang.model.*;

import java.io.*;
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
@SupportedSourceVersion(SourceVersion.RELEASE_11)
// ָ���ɴ���@Persistent��@Id��@Property����ע��
@SupportedAnnotationTypes({"Persistent", "Id", "Property"})
public class HibernateAnnotationProcessor
	extends AbstractProcessor
{
	// ѭ������ÿ����Ҫ�����ĳ������
	public boolean process(Set<? extends TypeElement> annotations,
		RoundEnvironment roundEnv)
	{
		// ����һ���ļ���������������ɶ�����ļ�
		PrintStream ps = null;
		try
		{
			// ����ÿ����@Persistent���ε�class�ļ�
			for (Element t : roundEnv.getElementsAnnotatedWith(Persistent.class))
			{
				// ��ȡ���ڴ���������
				Name clazzName = t.getSimpleName();
				// ��ȡ�ඨ��ǰ��@Persistentע��
				Persistent per = t.getAnnotation(Persistent.class);
				// �����ļ������
				ps = new PrintStream(new FileOutputStream(clazzName
					+ ".hbm.xml"));
				// ִ�����
				ps.println("<?xml version=\"1.0\"?>");
				ps.println("<!DOCTYPE hibernate-mapping PUBLIC");
				ps.println("	\"-//Hibernate/Hibernate "
					+ "Mapping DTD 3.0//EN\"");
				ps.println("	\"http://www.hibernate.org/dtd/"
					+ "hibernate-mapping-3.0.dtd\">");
				ps.println("<hibernate-mapping>");
				ps.print("	<class name=\"" + t);
				// ���per��table()��ֵ
				ps.println("\" table=\"" + per.table() + "\">");
				for (Element f : t.getEnclosedElements())
				{
					// ֻ������Ա�����ϵ�ע��
					if (f.getKind() == ElementKind.FIELD)   // ��
					{
						// ��ȡ��Ա��������ǰ��@Idע��
						Id id = f.getAnnotation(Id.class);      // ��
						// ��@Idע�����ʱ���<id.../>Ԫ��
						if (id != null)
						{
							ps.println("		<id name=\""
								+ f.getSimpleName()
								+ "\" column=\"" + id.column()
								+ "\" type=\"" + id.type()
								+ "\">");
							ps.println("		<generator class=\""
								+ id.generator() + "\"/>");
							ps.println("		</id>");
						}
						// ��ȡ��Ա��������ǰ��@Propertyע��
						Property p = f.getAnnotation(Property.class);  // ��
						// ��@Propertyע�����ʱ���<property.../>Ԫ��
						if (p != null)
						{
							ps.println("		<property name=\""
								+ f.getSimpleName()
								+ "\" column=\"" + p.column()
								+ "\" type=\"" + p.type()
								+ "\"/>");
						}
					}
				}
				ps.println("	</class>");
				ps.println("</hibernate-mapping>");
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (ps != null)
			{
				try
				{
					ps.close();
				}
				catch (Exception ex)
				{
					ex.printStackTrace();
				}
			}
		}
		return true;
	}
}