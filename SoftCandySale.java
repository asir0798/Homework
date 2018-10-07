/**
 * 
 */
package edu.ilstu;

/**
 * @author Anthony
 *
 */
public class SoftCandySale {
	
	//constants
	private final double TAFFY = 7.00;
	private final double CHOCOLATE = 25.00;
	private final double GUMMI_BEARS = 12.00;
	
	private final double PROFITSHARE1 = .07;
	private final double PROFITSHARE2 = .12;
	
	//variables
	private double numOfTaffy;
	private double numOfChocolate;
	private double numOfGummi;
	
	private double totalCost;
	
	//methods
	
	/**
	 * getter that returns the number of Taffy
	 * @return
	 */
	public double getTaffy() {
		return numOfTaffy;
	}
	
	/**
	 * getter that returns the number of Chocolate
	 * @return
	 */
	public double getChocolate() {
		return numOfChocolate;
	}
	
	/**
	 * getter that returns the number of gummi bears
	 * @return
	 */
	public double getGummi() {
		return numOfGummi;
	}
	
	/**
	 * getter that returns the price of taffy
	 * @return
	 */
	public double getTaffyPrice() {
		return TAFFY;
	}
	
	/**
	 * getter that returns the price of chocolate
	 * @return
	 */
	public double getChocolatePrice() {
		return CHOCOLATE;
	}
	
	/**
	 * getter that returns the price of gummi bears
	 * @return
	 */
	public double getGummiPrice() {
		return GUMMI_BEARS;
	}
	
	/**
	 * getter that returns the first profit share rate
	 * @return
	 */
	public double getProfitShare1() {
		return PROFITSHARE1;
	}
	
	/**
	 * getter that returns the second profit share rate
	 * @return
	 */
	public double getProfitShare2() {
		return PROFITSHARE2;
	}
	
	/**
	 * setter that takes a double through parameter and sets it equal
	 * to the number number of taffy
	 * @param numOfTaffy
	 */
	public void setTaffy(double numOfTaffy) {
		this.numOfTaffy = numOfTaffy;
	}
	
	/**
	 * setter that takes a double through the parameter and sets it equal
	 * to the number of chocolate
	 * @param numOfChocolate
	 */
	public void setChocolate(double numOfChocolate) {
		this.numOfChocolate = numOfChocolate;
	}
	
	/**
	 * setter that takes a double through the parameter and sets it equal
	 * to the number of gummi bears
	 * @param numOfGummi
	 */
	public void setGummi(double numOfGummi) {
		this.numOfGummi = numOfGummi;
	}
	
	/**
	 * method that calculates the total cost of the soft candy by taking the amount of candies
	 * and multiplying them by their respective price
	 * @return
	 */
	public double calculateSoftCandyCost() {
		totalCost = (numOfTaffy * TAFFY) + (numOfChocolate * CHOCOLATE) + (numOfGummi * GUMMI_BEARS) ;
		return totalCost;
	}
	
}
