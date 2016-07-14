/**
 * This class holds linked list of CountryNode objects, that can store as many objects
 * as the user wants to add to it. 
 */

public class CountryList {
	
	private CountryNode node; 
	
	public CountryList () {
		this.node = null;
	}
	
	
	/**
	 * A method that gets the country based on the index. 
	 * @param 		index 			The index of that you want 
	 */
	public Country getIndex(int index) {
		CountryNode current = this.node;
		
		for (int i = 0; i < index ; i++) {
			if (current != null && current.getNext() == null ) {
				return null;
			}
			current = current.getNext();
		}
		return current.getCountry();
	}
	
	/**
	 * A method that adds a country object to the end of the list. 
	 * @param 	country			The country object you want to add.
	 */
	public void add(Country country) {
		if( this.node == null) {
		CountryNode first = new CountryNode(country);
		this.node = first;
		
		} else {
		CountryNode add = new CountryNode(country);
		CountryNode current = this.node;
			while ( current.getNext() != null) {
				current = current.getNext();
				
			} 
			current.setNext(add) ;
		
		
		}
	}
	
	/**
	 * A method that returns the size of the list
	 */
	public int size() {
		int size = 0;
		CountryNode CurrNode = this.node;
			while(CurrNode.getNext() != null) {
				CurrNode = CurrNode.getNext();
				size++;
			}
		return size;
	}
	
	/**
	 * A method that checks if the name of the country can be found in the list.
	 * @param 	tmpCountry			the name of the country/object that you want to find.
	 */
	public Country contains(Country tmpCountry) {
		CountryNode tmp = new CountryNode(tmpCountry);
		CountryNode curr = this.node;
		while (curr.getNext() != null) {
			if (this.node == tmp) {
				return tmpCountry;
			} 	
		} 
		return null;
	}
	
	/**
	 * A method that returns a string containing information about every country in the list.
	 * 
	 */
	public String toString(){
		String result = "";
		return result;
		
	} 

}
