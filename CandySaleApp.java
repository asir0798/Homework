/**
 * 
 */
package edu.ilstu;
import java.util.Scanner;
/**
 * @author Anthony
 *
 */
public class CandySaleApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double numOfPeanut;
		double numOfPeppermint;
		double numOfTaffy;
		double numOfChocolate;
		double numOfGummi;
		
		HardCandySale hard = new HardCandySale();
		SoftCandySale soft = new SoftCandySale();
		
		System.out.print("Hard Candy\n\n\tPeanut Brittle\t$11.00\n\tPeppermint\t$8.00\n");
		System.out.print("\nSoft Candy\n\n\tTaffy\t\t$7.00\n\tChocolate\t$25.00\n\tGummi Bears\t$12.00");
		
		System.out.print("\n\nEnter number of Peanut Brittle Hard Candy: ");
		numOfPeanut = input.nextDouble();
		hard.setPeanut(numOfPeanut);
		
		System.out.print("Enter number of Peppermint Hard Candy: ");
		numOfPeppermint = input.nextDouble();
		hard.setPeppermint(numOfPeppermint);
		
		System.out.print("Enter number of Taffy Soft Candy: ");
		numOfTaffy = input.nextDouble();
		soft.setTaffy(numOfTaffy);
		
		System.out.print("Enter number of Chocolate Soft Candy: ");
		numOfChocolate = input.nextDouble();
		soft.setChocolate(numOfChocolate);
		
		System.out.print("Enter number of Gummi Bears Soft Candy: ");
		numOfGummi = input.nextDouble();
		soft.setGummi(numOfGummi);
		
		System.out.println("\n\nOrder Summary\n\n\tCandy Sale");
		System.out.println("Hard candy ordered: " + (hard.getPeanut() + hard.getPeppermint()));
		System.out.println("Soft candy ordered: " + (soft.getTaffy() + soft.getChocolate() + soft.getGummi()));
		
		System.out.println("\nHard candy sale: $" + hard.calculateHardCandyCost());
		System.out.println("Soft candy sale: $" + soft.calculateSoftCandyCost());
		
		System.out.println("\nSchool Profit: $" + (calculateHardCandySchoolProfit(hard) + calculateSoftCandySchoolProfit(soft)));
		System.out.println("Total Sale: $" + calculateTotalNetCost(hard, soft));
	}

	
	public static double calculateHardCandySchoolProfit(HardCandySale hard) {
		double schoolProfit;
		
		if(hard.getPeanut() + hard.getPeppermint() > 9) {
			schoolProfit = hard.getProfitShare2() * hard.calculateHardCandyCost();
			return schoolProfit;
		}
		else {
			schoolProfit = hard.getProfitShare1() * hard.calculateHardCandyCost();
			return schoolProfit;
		}
	}
	
	public static double calculateSoftCandySchoolProfit(SoftCandySale soft) {
		double schoolProfit;
		
		if(soft.getTaffy() + soft.getChocolate() + soft.getGummi() > 7) {
			schoolProfit = soft.getProfitShare2() * soft.calculateSoftCandyCost();
			return schoolProfit;
		}
		else {
			schoolProfit = soft.getProfitShare1() * soft.calculateSoftCandyCost();
			return schoolProfit;
		}
	}
	
	public static double calculateTotalNetCost(HardCandySale hard, SoftCandySale soft) {
		double totalSale;
		totalSale = hard.calculateHardCandyCost() + soft.calculateSoftCandyCost();
		return totalSale;
	}
	
}
