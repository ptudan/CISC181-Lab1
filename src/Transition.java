
public class Transition {
	
	//function
	public static double celsius_to_fahrenheit(double cdeg){
		return 32.0 + (cdeg * 1.8);
	}
	
	//Repetition (recursive function, performs root find
	//midpoint algorithm on exponential functions)
	public static int root(int n, int start, int end, int base){
		if(end <= start){
			return start;
		}
		else{
			int mid = (end + start) / 2;
			int guess = (int) Math.pow(mid, base);
			if(guess < n){
				return root(n, mid+1, end, base);
			}
			else if(guess > n){
				return root(n, start, mid, base);
			}
			else{
				return mid;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//expression
		System.out.println(5 + 10);
		
		//Definition/Variable assignment
		double LBS_TO_KILO = 0.45359237;
		System.out.println(175 * LBS_TO_KILO);
		
		//Variable re-assignment (mutation)
		int age = 19;
		System.out.println(age);
		age = age + 1;
		System.out.println(age);
		
		//Selection (conditional)
		int JOE_AGE = 25;
		if (JOE_AGE < 25){
			System.out.println("minor");
		}
		else if(JOE_AGE < 65){
			System.out.println("adult");
		}
		else{
			System.out.println("senior");
		}
		
		//Function
		System.out.println(celsius_to_fahrenheit(25.0));
		
		//Repetition (definite/fixed iteration loop)
		//Definite FOR loop with mutation
		int total = 0;
		for(int i = 0; i < 10; i++){
			total += i;
		}
		System.out.println(total);
		
		//Repetition (indefinite/conditional loop)
		// "WHILE" conditional loop
		int guess = 1;
		while(guess % 7 != 0){
			guess = new java.util.Random().nextInt(100);
		}
		System.out.println(guess);
		
		//Repetition (recursive function, performs root find
		//midpoint algorithm on exponential functions)
		System.out.println(root(16, 0, 16, 2));
		System.out.println(root(24, 0, 24, 2));
		

	}

}
