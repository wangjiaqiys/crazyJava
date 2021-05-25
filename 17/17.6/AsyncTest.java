
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
public class AsyncTest
{
	public static void main(String[] args) throws Exception
	{
		// ΪCookieHandler����Ĭ�ϵ�Cookie������
		CookieHandler.setDefault(new CookieManager());
		HttpClient client = HttpClient.newBuilder()
			.version(HttpClient.Version.HTTP_2)
			.followRedirects(HttpClient.Redirect.NORMAL)
			.connectTimeout(Duration.ofSeconds(20))
			// ����Ĭ�ϵ�Cookie������
			.cookieHandler(CookieHandler.getDefault())
			.build();
		// ��������POST�����request
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("http://localhost:8888/foo/login.jsp"))
			.timeout(Duration.ofMinutes(2))
			// ָ�����ύ���ķ�ʽ����������
			.header("Content-Type", "application/x-www-form-urlencoded")
			// ͨ���ַ������������壬Ȼ����ΪPOST������������
			.POST(HttpRequest.BodyPublishers.ofString("name=crazyit.org&pass=leegang"))
			.build();
		// ��������GET�����request
		HttpRequest getReq = HttpRequest.newBuilder()
			.uri(URI.create("http://localhost:8888/foo/secret.jsp"))
			.timeout(Duration.ofMinutes(2))
			.header("Content-Type", "text/html")
			.GET()
			.build();
		// �����첽��POST���󣬷���CompletableFuture����
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
			// ��CompletableFuture���ʱ�������Lambda���ʽ�Ը÷���ֵ����ת��
			.thenApply(resp -> new Object[] {resp.statusCode(), resp.body()})
			// ��CompletableFuture���ʱ�������Lambda���ʽ����÷���ֵ
			.thenAccept(rt -> {
				System.out.println("POST�������Ӧ��:" + rt[0]);
				System.out.println("POST�������Ӧ��:" + rt[1]);
				// �����첽��GET���󣬷���CompletableFuture����
				client.sendAsync(getReq, HttpResponse.BodyHandlers.ofString())
					// ��CompletableFuture���ʱ�������Lambda���ʽ����÷���ֵ
					.thenAccept(resp -> {
						System.out.println("GET�������Ӧ��:" + resp.statusCode());
						System.out.println("GET�������Ӧ��:" + resp.body());
					});
			});
		System.out.println("--�������--");
		Thread.sleep(1000);
	}
}
