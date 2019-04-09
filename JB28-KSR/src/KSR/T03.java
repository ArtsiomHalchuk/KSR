package KSR;

public class T03 {

	public static void main(String[] args) {
		int X=1992;//start year
		int Y=2008;//end year
		int x=3;//start month
		int y=11;//end month
		int dayscounter=0;//variable used for count of days

		while (X!=Y) {
			
			if((X % 4 == 0 && X % 100 != 0) || X % 400 == 0) {
				dayscounter+=(daysCount( x , 12 )+1);
			}else {
				dayscounter+=daysCount( x , 12 );
			}
			X++;//go to next year
			x=1;//for next iteration year should start from the beginning
			
		}
		//adding the latest iteration which ends with y month
		if((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0) {
			dayscounter+=(daysCount( 1 , y )+1);
		}else {
			dayscounter+=daysCount( 1 , y );
		}
		System.out.println(dayscounter+" дней");
	}

	public static int daysCount (int x,int y) { //ordinary year
		int dayscounter=0;
		while (x<=y) {
			if (x==4||x==6||x==9||x==11) {
				
				dayscounter+=30;
			}else if(x==2) {
				dayscounter+=28;
			}else {
				dayscounter+=31;
			}
			x++;
		}
		return dayscounter;
	}
	
	
}
