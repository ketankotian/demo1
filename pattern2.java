
public class Pattern3 {
	public static void main(String args []) {
		
			for(int i=1;i<=4;i++) {            //ascending  
				for (int j=4;j>i;j--) 
				{
					System.out.print(" ");
					
				}
				for (int k=1;k<=i;k++) {
					System.out.print('*');
					
				}

				System.out.println();	
			} 
    

			
		/*	for(int i=1;i<=4;i++) {            //descending
				for (int j=1;j<i;j++) 
				{
					System.out.print(" ");
					
				}
				for (int k=4;k>=i;k--) {
					System.out.print('*');
					
				}

				System.out.println();	
			}  */

	}
}

/*
ascending output :
   *
  **
 ***
****

descending output :
****
 ***
  **
   *

both merged :

   *
  **
 ***
****
 ***
  **
   *


*/
