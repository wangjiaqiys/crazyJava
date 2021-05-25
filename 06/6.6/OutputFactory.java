
import lee.Output;

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
public class OutputFactory
{
	public Output getOutput()
	{
//		return new Printer();
		return new BetterPrinter();
	}
	public static void main(String[] args)
	{
		var of = new OutputFactory();
		var c = new Computer(of.getOutput());
		c.keyIn("������Java EE��ҵӦ��ʵս");
		c.keyIn("���Java����");
		c.print();
	}
}
