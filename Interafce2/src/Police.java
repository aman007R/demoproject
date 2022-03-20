
interface I {
	void intId();

	void StringName();

	void doubleFees();

	void intAddress();


}
	
	
	class Student implements I {

		@Override
		public void intId() {
			// TODO Auto-generated method stub

		}

		@Override
		public void StringName() {
			// TODO Auto-generated method stub

		}

		@Override
		public void doubleFees() {
			// TODO Auto-generated method stub

		}

		@Override
		public void intAddress() {
			// TODO Auto-generated method stub

		}

	}

	class Fan extends Student{
		
		@Override
		public void doubleFees() {
			// TODO Auto-generated method stub
			super.doubleFees();
		}
		
		 @Override
		public void StringName() {
			// TODO Auto-generated method stub
			super.StringName();
		}
		 @Override
		public void intId() {
			// TODO Auto-generated method stub
			super.intId();
		}
		 @Override
		public void intAddress() {
			// TODO Auto-generated method stub
			super.intAddress();
		}
		
		
		
	} 
	
	
	class Police{
		public static void main(String[] args) {
			Fan f =new Fan(); 
			f.intId();
			System.out.println(20);
			f.intAddress();
			System.out.println("Nerul");
			f.StringName();
			System.out.println("Amit");
			f.doubleFees();
			System.out.println(5000);
		}
	}