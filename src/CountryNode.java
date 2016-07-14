
public class CountryNode {
	private Country country;
	private CountryNode next;
	private int data;
	
	/**
	 * Constructor that takes in the object of type Country 
	 * @param 	c					The name of the country 
	 */
	public CountryNode (Country country) {
		this.country = country;
		this.next = null; 
	}
	public CountryNode(int data) {
		this.data = data;
		this.next = null; 
	}
	
	public int getData() {
		return data;
	}
	/**
	 * Constructor that takes in two parameters, an object of type 
	 * Country and an object of type CountryNode.
	 * @param 	x
	 * @param 	object 
	 */
	public CountryNode (Country nameOfCountry , CountryNode node) {
		this.next = node;
		this.country = nameOfCountry;
		
	}
	
	/**
	 * Getter method for Country 
	 * @return 		country 		The name of the country 
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Getter method for CountryNode 
	 * @return 	next 		The next country Node 
	 */
	public CountryNode getNext() {
		return next;
	}
	
	/**
	 * Setter method for next 
	 * @param 	next 		The next country Node 
	 */
	public void setNext(CountryNode next) {
		this.next = next;
	}
	
	
	

}
