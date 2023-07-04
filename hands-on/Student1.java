package oops;

 class Student1 {
	 private String Name;
	 private int Age;
	 private int Rollno;
	 private String Address;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	 class Student1Main
	 {
		 public static void main(String[] args)
		 {
			 Student1 S= new Student1();
			 S.setName("sami");
			 S.setAddress("vashi new mumbai sec-30");
			 S.setAge(21);
			 S.setRollno(11);
			 
			 System.out.println("Name is:" + S.getName());
			 System.out.println("Age is:" + S.getAge());
			 System.out.println("Address is:" + S.getAddress());
			 System.out.println("Rollno is:" + S.getRollno());
			 
		 }
	 }
		 

	
}
