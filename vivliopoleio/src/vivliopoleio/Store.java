package vivliopoleio;

public class Store {
	
	private String link;
	private String phone;
	private String email;
	protected Product p;
	
	// vasikos constructor ths klashs store
	public Store(String link, String phone, String email) {
		
		this.link = link;
		this.phone = phone;
		this.email = email;
		this.p = new Product();
		
	}
	
	// emfanisei vasikwn stoixeiwn katasthmatos
	public String stoixeia() {
		
		return "\nLink: " + link + "\nStoixeia Epikoinwnias \nthlefwno: " + phone + "\nemail: " + email;
	}
	
	//prosthiki proiontos
	public void add_prod(String category, String available, double price, String desc) {
		
		this.p = new Product(category, available, price, desc);
	}
	
	
	

}
