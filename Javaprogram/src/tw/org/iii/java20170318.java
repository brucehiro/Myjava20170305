package tw.org.iii;

public class java20170318 {

	public static void main(String[] args) {
		System.out.println(hiro_class.b);//因為b為static與物件無關，所以可以使用類別呼叫b(hiro_class.b)；static{}也與物件無關，且在載入類別時會被執行一次，所以此行程式碼執行後，也會執行static{}內的程式碼。
		
		//static{}與物件無關，且只會執行一次
		//在建構式前物件即會被建立，所以{}中的程式會被執行
		hiro_class b1 = new hiro_class();
		hiro_class b2 = new hiro_class();
		hiro_class b3 = new hiro_class();
		

	}

}
