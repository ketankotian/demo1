public class Pattern {
public static void main (String args[]){

	for(int i=1;i<=4;i++) {
	for (int j=1;j<=i;j++) //ascending star pattern
	{
		System.out.print('*');
		
	}

	System.out.println();	
}
	for(int i=1;i<=4;i++) {
		for (int j=4;j>i;j--) //descending star pattern
		{
			System.out.print('*');
			
		}

		System.out.println();	
	}
}
}
 
/*

output : 
*
**
***
****
***
**
*

*/
