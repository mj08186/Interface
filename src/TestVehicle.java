
public class TestVehicle extends Vehicle implements Human, Bird{

		public static void main(String[] args) {
			TestVehicle tv = new TestVehicle();
			System.out.println(tv);
			tv.run();
			System.out.println(tv.age);
			boolean test = tv instanceof Human;
			System.out.println("is instance of " + test);
		}
		
		@Override
		public String whatAmI() {
			return null;
		}

		@Override
		public void run() {
			System.out.println("Running like the wind");
			
		}

		@Override
		public void wave() {
			System.out.println("Waving like the queen");
			
		}

}