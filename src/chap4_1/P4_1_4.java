package chap4_1;

public class P4_1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

           for(int i=2; i<=4; i++){
			for(int j=1; j<=i; j++){
				int result = 3*j;
				sum += result; 
				
				if(j<i)
				System.out.print(result + "+");
				else
				System.out.print(result);
				
				
			}
			System.out.println("=" + sum);
			
		  }
    
       }
		
	}
