package SwitchClass;

public class SwCl {
public String day;


	public void setDay(String day) {
		this.day = day;
	}


	public String getDay() {
	switch(day){
	
	case "monday":
		System.out.println("Today is monday");
		break;
		
	case "tuesday":
		System.out.println("Today is Tuesday");
		break;
	 
	default:
		 
		 System.out.println("Please Enter valid day");
	
	
	
	}
		
		
		
		return day;
	}
 
}
