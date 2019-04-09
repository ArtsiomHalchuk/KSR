package KSR;

public class T01 {

	public static void main(String[] args) {
		double x;
		double max=-1000;
		double min=1000;
		
		for(int i=0;i<100; i++) {
			x=Math.random() * 2000 - 1000; //Случайные числа принадлежат промежутку [-1000;1000)
			if (x>max) {
				max=x;
			}
			else if (x<min) {
				min=x;
			}
			//System.out.println(i+". "+"x="+x+" max="+max+" min="+min);
			
			}
		System.out.println("Миниальное "+min+", максимальное "+max );
		}
		

	}


