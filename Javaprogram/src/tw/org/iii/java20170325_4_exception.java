package tw.org.iii;

//例外、繼承

import java.awt.print.PrinterException;
import java.io.IOException;
import java.rmi.RemoteException;

public class java20170325_4_exception {
	public static void main(String[] args)
	{
		
	}
}

class h325_41
{
	void m1() throws IOException {}
}

class h325_42 extends h325_41
{
	//繼承時，例外需與父類別相同，或更少
	//void m1() throws IOException {} --> OK
	//void m1() throws IOException, PrintException {} --> no 比父類別多出別種類的例外
	//void m1() --> OK 沒有例外
	//RemoteException為IOException的子類別 --> OK
	void m1() throws RemoteException
	{
		
	}
}