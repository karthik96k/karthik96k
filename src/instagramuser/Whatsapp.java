package instagramuser;

public class Whatsapp extends Instagramuser{
	
	public void mobilenumber() {
		System.out.println("the Mmobilenumer is 1234567625");
	
}
public static void main(String[] args) {
	Whatsapp w = new Whatsapp();
	
	w.mobilenumber();
	
	w.firstName();
	w.LastName();
	w.age();
	
	w.email();
	w.password();
}

}
