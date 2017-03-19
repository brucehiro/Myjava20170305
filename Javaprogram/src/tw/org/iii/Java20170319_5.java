package tw.org.iii;

//介面、多型

public class Java20170319_5 {

	public static void main(String[] args) {
		

	}

}

//介面中只會提供抽象方法，不會提供實作方式。abstract可以加可不加。
//主要是提供規格，給其他類別實作(implements)
//因此可以使用介面達到多型
interface c
{
	//介面中，在方法前的修飾字隱含public及abstract
	void m1();
	void m2();
}

//要實作介面(a1)，該類別必須要有介面的方法，且修飾字要是public(大於等於介面)
class c1 implements c
{
	public void m1(){}
	public void m2(){}
}

//或是使用抽象類別來實作介面
abstract class c2 implements c
{
	public void m1(){}
	//public abstract void m1();
}
