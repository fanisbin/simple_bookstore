package vivliopoleio;

import java.util.concurrent.atomic.AtomicInteger;

public class Product {
	
	private String category;
	private String available;
	private double price;
	private String desc;
	private int id;
	
	// static metavliti gia thn automath aukshsh tou id kata ena kathe fora pou prosthetw ena product
	private static final AtomicInteger autoid = new AtomicInteger(0); 
	


	//constructor me arxikopoihsh timwn me mhdenikes/kenes times
	public Product() {
		this.category = " ";
		this.available = " ";
		this.price = 0;
		this.desc = " ";
		this.id = autoid.incrementAndGet();
	}
	
	// constructor me parametrous
	public Product(String category, String available, double price, String desc) {
		
		this.category = category;
		this.available = available;
		this.price = price;
		this.desc = desc;
		this.id = autoid.incrementAndGet();
	}
	
	// xarakthrismos proiodos ws diathesimo
	public void avail_yes() {
		this.available = "yes";
	}
	
	// xaraktirismos proiodos ws mh diathesimo
	public void avail_no() {
		this.available = "no";
	}
	
	// elegxos an ena proion einai diathesimo
	public int get_availability() {
		if (this.available.equals("yes")) return 1;
		else return 0;
	}
	
	//emfanhsh stoixeiwn enos proiodos
	public String toString() {
		
		return "\nkathgoria: " + this.category + "\ndiathesimo: " + this.available + "\ntimh: " + this.price + "\nperigrafh: " + this.desc + 
				"\nkwdikos proiodos: " + id;
		
	}
	
}
