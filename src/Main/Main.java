package Main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		
		DisplayOptions dp = new DisplayOptions();
		Scanner input = new Scanner(System.in);
		int userOption;
		boolean show = true;
		
		do {
			dp.getOptions();
			userOption = input.nextInt();
			dp.setOption(userOption);
		
			if(userOption==6)show = false;
				
			
		}
		while(show) ;
		dp.setOption(userOption);
	}

}
