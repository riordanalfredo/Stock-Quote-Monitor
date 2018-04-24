/**
 * 
 */
package Model;

/**
 *	@author: kjkwo2@student.monash.edu
 *  Created 24 April 2018
 */
//The main engine that will run the application!
public class MVCStockQuote {
	
	StockQuoteView View = new StockQuoteView();
	StockQuoteModel Model = new StockQuoteModel();
	StockQuoteController Controller = new StockQuoteController(View,Model);
			
}
