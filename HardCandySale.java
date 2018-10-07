/**
 * 
 */
package edu.ilstu;

/**
 * @author Anthony
 *
 */
public class HardCandySale {
	
	//constants
	private final double PEANUT_BRITTLE = 11.00;
	private final double PEPPERMINT = 8.00;
	
	private final double PROFITSHARE1 = .07;
	private final double PROFITSHARE2 = .12;
	
	//variables
	private double numOfPeanut;
	private double numOfPeppermint;
	
	private double totalCost;
	
	//methods
	
	/**
	 * getter that returns the number of peanut brittle
	 * @return
	 */
	public double getPeanut() {
		return numOfPeanut;
	}
	
	/**
	 * getter that returns number of peppermint
	 * @return
	 */
	public double getPeppermint() {
		return numOfPeppermint;
	}
	
	/**
	 * getter that returns the price of peanut brittle
	 * @return
	 */
	public double getPeanutPrice() {
		return PEANUT_BRITTLE;
	}
	
	/**
	 * getter that returns the price of peppermint
	 * @return
	 */
	public double getPeppermintPrice() {
		return PEPPERMINT;
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
	 * a setter that takes a double through the parameter and sets the
	 * number of peanut brittle equal to it
	 * @param numOfPeanut
	 */
	public void setPeanut(double numOfPeanut) {
		this.numOfPeanut = numOfPeanut;
	}
	
	/**
	 * setter that takes a double through the parameter and sets the
	 * number of peppermints equal to it
	 * @param numOfPeppermint
	 */
	public void setPeppermint(double numOfPeppermint) {
		this.numOfPeppermint = numOfPeppermint;
	}
	
	/**
	 * calculates the total cost of the number of peanut brittle and the number of peppermint
	 * by taking the amounts of the items and multiplying it by their respective prices
	 * @return
	 */
	public double calculateHardCandyCost() {
		totalCost = (numOfPeanut * PEANUT_BRITTLE) + (numOfPeppermint * PEPPERMINT);
		return totalCost;
	}
	
	
	
	
	

}
