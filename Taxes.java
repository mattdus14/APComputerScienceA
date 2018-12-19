import java.util.Scanner;

public class Taxes {
	private String status;
	private double income;
	
	public Taxes(String s, double i) {
		status = s;
		income = i;
	}
	
	public void setStatus(String s) {
		status = s;
	}
	
	public void setIncome(double i) {
		income = i;
	}
	
	public double federalTax() {
		double tax = 0;
		
		if(status.equalsIgnoreCase("Single")) {
			if(income <= 27050) {
				tax = 0.15*(income);
			} else if(income <= 65550) {
				tax = 4057.5+0.275*(income-27050);
			} else if(income <= 136750) {
				tax = 14645+0.305*(income-65550);
			} else if(income <= 297350) {
				tax = 36361+0.355*(income-136750);
			} else {
				tax = 93374+0.391*(income-297350);
			}
		} else if(status.equalsIgnoreCase("Married")) {
			if(income <= 45200) {
				tax = 0.15*(income);
			} else if(income <= 109250) {
				tax = 6780+0.275*(income-45200);
			} else if(income <= 166500) {
				tax = 24393.75+0.305*(income-109250);
			} else if(income <= 297350) {
				tax = 41855+0.355*(income-166500);
			} else {
				tax = 88306+0.391*(income-297350);
			}
		}
		
		return tax;
	}
	
	public static void main(String[] args) {
		Taxes t = new Taxes("Single",35125);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Taxes");
		System.out.println("=====");
		System.out.print("Enter Status: ");
		t.setStatus(s.nextLine());
		System.out.print("Enter Taxable Income: $");
		t.setIncome(s.nextDouble());
		
		System.out.printf("Federal Tax = $%,.2f",t.federalTax());
	}
}
