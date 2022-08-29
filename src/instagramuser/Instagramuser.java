package instagramuser;

public class Instagramuser extends instagram {
	
	public void firstName() {
		System.out.println("the firstName is karthi");
	}
	public void LastName() {
		System.out.println("the lastName is k");
	}
		public void age() {
			System.out.println("the age is 25");
		
	}
	public static void main(String[] args) {
		Instagramuser i = new Instagramuser();
		i.firstName();
		i.LastName();
		i.age();
		
		i.email();
		i.password();
	}
}