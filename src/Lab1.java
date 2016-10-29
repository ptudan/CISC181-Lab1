
public class Lab1 {
	
	public static double compute_tax(double income, int exemptions, boolean non_profit){
		double adjusted_income = income - (exemptions*5000);
		if(non_profit || adjusted_income < 0){
			return 0;
		}
		else if(adjusted_income < 10000){
			return adjusted_income *.1;
		}
		else if(adjusted_income < 20000){
			return adjusted_income * .15;
		}
		else if(adjusted_income < 50000){
			return adjusted_income * .2;
		}
		else{
			return adjusted_income * .25;
		}
		
	}
	
	public static double gross_income(double income, int exemptions, boolean non_profit){
		return income - compute_tax(income, exemptions, non_profit);
	}
	
	public static double windChillTemperature(double airTemp, double windSpeed){
		double v = Math.pow(windSpeed, .16);
		return (35.74 + (.6215*airTemp) - (35.75*v) +
				.4275*airTemp*v);
	}
	
	public static boolean check76(int testVal){
		return (testVal % 7 == 0) ^ (testVal % 6 == 0);
	}
	
	
	public static void main(String[] args) {
		
		//testing compute_tax
		System.out.println("Testing compute_tax: ");
		System.out.println(compute_tax(30000, 2, false));
		System.out.println(compute_tax(10000, 6, false));
		System.out.println(compute_tax(75000, 1, false));
		System.out.println(compute_tax(75000, 1, true));
		System.out.println("");
		
		//Testing gross_income
		System.out.println("Testing gross_income: ");
		System.out.println(gross_income(30000, 2, false));
		System.out.println(gross_income(10000, 6, false));
		System.out.println(gross_income(75000, 1, false));
		System.out.println(gross_income(75000, 1, true));
		System.out.println("");
		
		//Testing Wind Chill
		System.out.println("Testing Wind Chill: ");
		System.out.println(windChillTemperature(32, 10));
		System.out.println("");
		
		//Testing check76
		System.out.println("Testing check76: ");
		System.out.println(check76(12));
		System.out.println(check76(14));
		System.out.println(check76(42));
		System.out.println(check76(3));

	}

}
