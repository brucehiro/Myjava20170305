package tw.org.iii;

//介面、多型

public class Java20170319_6 {

	public static void main(String[] args) {
		
		//將物件宣告為介面(Geometry)，但以不同實作介面的類別來初始化該物件
		Geometry a1 = new Triangle(3,4,5,4);
		Geometry a2 = new Squre(4);
		calarea(a1);
		calarea(a2);

	}
	
	static void calarea(Geometry a)
	{
		//因為傳入的物件都是介面，所以可以使用介面中的方法。但實作時，會依照傳入的物件被何種類別初始化，在計算上有所不同。
		//傳入的物件是a1時，是用Triangle初始化，所以會用Triangle類別的calArea來執行
		//此為多型的方法之一
		System.out.println(a.calArea());
	}

}

interface Geometry
{
	double callength();
	double calArea();
}

class Triangle implements Geometry
{
	private double s1, s2, s3, h1;
	
	Triangle(double s1, double s2, double s3, double h1)
	{
		this.s1 = s1; this.s2 = s2; this.s3 = s3; this.h1 = h1;
	}
	
	public double callength()
	{
		return s1+s2+s3;
	}
	public double calArea()
	{
		return (s1*h1)/2;
	}
}

class Squre implements Geometry
{
	private double s1;
	
	Squre(double s1)
	{
		this.s1 = s1;
	}
	
	public double callength()
	{
		return s1*4;
	}
	public double calArea()
	{
		return s1*s1;
	}
}
