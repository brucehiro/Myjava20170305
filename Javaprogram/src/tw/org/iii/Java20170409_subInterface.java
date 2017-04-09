package tw.org.iii;

public class Java20170409_subInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface sub01
{
	public void m1();
}

interface sub02 
{
	public void m2();
}

//因為介面無實作，所以不能用implements。但可以繼承父介面的定義。
interface sub03 extends sub01 
{
	//因為sub03是繼承sub01，當更改m1()的回傳值時，會與父介面衝突，所以只能與父介面相同。但既然都繼承父介面，所以就不同重覆再打一次。但可以增加參數值(overload)
	//public int m1();
	//overload(即相同方法名稱，但參數值不同)
	public void m1(int a);
	//又多定一個m3()，所以在實作sub03時，需要實作m1()及m3()。
	public void m3();
}

//介面可以多重繼承
interface sub04 extends sub01, sub02 
{
	//要時作sub04時，需要實作m1()、m2()及m3()。
	public void m3();
}

class sub05c implements sub03
{
	public void m1(){}
	public void m1(int a){}
	public void m3(){}
}

class sub01c implements sub04
{
	public void m1(){}
	public void m2(){}
	public void m3(){}
}

class sub02c extends sub01c
{
	//此為overwrite，方法名稱相同、輸入參數值量及型別相同、回傳型別相同、存取修飾字要高於父類別
	public void m1(){}
}