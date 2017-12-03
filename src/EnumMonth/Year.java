package EnumMonth;

public class Year {
	
	Month Month;
	
	public Year(Month Month){
	
	this.Month=Month;
	}
	public void toMonth()
   {
		switch(Month){
		
		case january:
			
			System.out.println("This is january and weather is very cold");
			
		    break;
			
		case february:
			
			System.out.println("This is february and weather is still very cold");
			
			break;
			
        case march:
			
			System.out.println("This is Spring time");
			
		    break;
        case april:
			
			System.out.println("This is april and got a long break");
			
		    break;
		    
           case may:
			
			System.out.println("This is may");
			
		    break; 
           case june:
   			
   			System.out.println("This is rainy season");
   			
   		    break;
           case july:
   			
   			System.out.println("This is july Summer ");
   			
   		    break;
           case august:
   			
   			System.out.println("This is august");
   			
   		    break;
           case september:
   			
   			System.out.println("This is sep. ");
   			
   		    break;
           case october:
   			
   			System.out.println("This is oct.");
   			
   		    break;
           case november:
   			
   			System.out.println("This is nov.");
   			
   		    break;
           case december:
   			
   			System.out.println("This is dec and snow fall beging");
   			
   		    break;
          
   		    
			default:
				System.out.println("Please enter Valid month");
				
				
			
		}
		
		
		
		
		
	}

}
