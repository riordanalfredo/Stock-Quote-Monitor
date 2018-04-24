/**
 * 
 */
package Model;

/**
 *  @author: kjkwo2@student.monash.edu
 *  Created 24 April 2018
 */
//
//TODO Associate with Observer abstract class -----------------------------
//Model class for Stock Quote.
//Contains Storage of the Data from the Proxy server
public class StockQuoteModel {
	//Create an arraylist for the data that is stored (may need to change to static)
	private ArrayList<String> Storage = new ArrayList<String>();
	
	
	//Method that adds the symbol into the interface
	public void addStock(String symbol){
		
		
		
		}

	//Method that removes the symbol from the interface
	public void removeStock(String symbol){
			
			
			
		}

	//Method for the View class to retrieve the storage of the symbols/data.
	public ArrayList<String> getStockStorage(){
		
		return Storage;
		
		}
	
}
