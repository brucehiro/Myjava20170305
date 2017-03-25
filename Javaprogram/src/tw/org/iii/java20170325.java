package tw.org.iii;

	public class java20170325 {
		public static void main(String[] args) {
			Car c1 = new Car();
			Car c2 = new Ferrari();
				
			SpeedUp(c1,2);
			SpeedUp(c2,2);
			System.out.println("The speed of c1 is: " + c1.getSpeed());
			System.out.println("The speed of c2 is: " + c2.getSpeed());
				
			SpeedDown(c1,2);
			SpeedDown(c2,2);
			System.out.println("The speed of c1 is: " + c1.getSpeed());
			System.out.println("The speed of c2 is: " + c2.getSpeed());
		}
		
			
		static double SpeedUp(Car c, int stage)
		{
			c.upSpeed(stage);
			c.upSpeed(stage);
			return c.getSpeed();
		}
			
		static double SpeedDown(Car c, int stage)
		{
			c.downSpeed(stage);
			c.downSpeed(stage);
			return c.getSpeed();
		}
	}

		
		class Car
		{
			private int colorNumber; 
			private String[] color = {"black","white","yellow","blue","brown","purple"};
			double speed;
				
			Car()
			{
				this(1);
				speed = 0;
			}
			
			Car(int setCol)
			{
				colorChange(setCol);
			}
				
			void colorChange(int cNum)
			{
				switch(cNum)
				{
					case 0:
						colorNumber = 0;
						break;
					case 1:
						colorNumber = 1;
						break;
					case 2:
						colorNumber = 2;
						break;
					case 3:
						colorNumber = 3;
						break;
					case 4:
						colorNumber = 4;
						break;
					case 5:
						colorNumber = 5;
						break;
							
					default:
						System.out.println("Incorrect input!");
						break;
				}
					
				}

			void upSpeed(int stage)
			{
				speed = (speed==0)?1:speed*(1.2*stage);
			}
				
			void downSpeed(int stage)
			{
				speed = (speed<0.1)?0:speed*(0.7/stage);
			}
				
			String getColor()
			{
				return "The color of car is " + color[colorNumber]; 
			}
			
			double getSpeed()
			{
				return speed;
			}
		}

		class Ferrari extends Car
		{
			void upSpeed(int stage)
			{
				super.upSpeed(stage);
				speed *= 1.2; 
			}
				
			void downSpeed(int stage)
			{
				super.downSpeed(stage);
				speed *= 0.7; 
			}
		}

	
