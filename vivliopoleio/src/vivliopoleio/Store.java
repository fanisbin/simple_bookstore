package vivliopoleio;

public class Store {
	
	private String link;
	private String phone;
	private String email;
	
	// vasikos constructor ths klashs store
	public Store(String link, String phone, String email) {
		
		this.link = link;
		this.phone = phone;
		this.email = email;
		
	}
	
	public String stoixeia() {
		
		return "\nLink: " + link + "\nStoixeia Epikoinwnias \nthlefwno: " + phone + "\nemail: " + email;
	}

}
