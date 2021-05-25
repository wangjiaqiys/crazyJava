
import java.net.http.*;
import java.time.*;
import java.net.*;

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
public class GetTest
{
	public static void main(String[] args) throws Exception
	{
		// �١�����HttpClient����
		HttpClient client = HttpClient.newBuilder()
			// ָ��HTTPЭ��İ汾
			.version(HttpClient.Version.HTTP_2)
			// ָ���ض������
			.followRedirects(HttpClient.Redirect.NORMAL)
			// ָ����ʱ��ʱ��
			.connectTimeout(Duration.ofSeconds(20))
			// ���б�Ҫ����ͨ���÷���ָ�������������ַ
//			.proxy(ProxySelector.of(new InetSocketAddress("proxy.crazyit.com", 80)))
			.build();
		// �ڡ�����HttpRequest����
		HttpRequest request = HttpRequest.newBuilder()
			// ִ�������URL
			.uri(URI.create("http://localhost:8888/foo/secret.jsp"))
			// ָ������ʱ��ʱ��
			.timeout(Duration.ofMinutes(2))
			// ָ������ͷ
			.header("Content-Type", "text/html")
			// ����GET����
			.GET()
			.build();
		// HttpResponse.BodyHandlers.ofString()ָ������������Ӧת�����ַ���
		HttpResponse.BodyHandler<String> bh = HttpResponse.BodyHandlers.ofString();
		// �ۡ��������󣬻�ȡ��������Ӧ
		HttpResponse<String> response = client.send(request, bh);
		// ��ȡ��������Ӧ��״̬��
		System.out.println("��Ӧ��״̬��:" + response.statusCode());
		System.out.println("��Ӧͷ:" + response.headers());
		System.out.println("��Ӧ��:" + response.body());
	}
}
