package basics;

public class Switch1 {

	public static void main(String[] args) {

		 int number = 89;
		    String size;

		    
		    switch (number) {

		      case 29:
		        size = "Small";
		        break;

		      case 42:
		        size = "Medium";
		        break;

		      
		      case 44:
		        size = "Large";
		        break;

		      case 48:
		        size = "Extra Large";
		        break;
		      
		      default:
		        size = "Unknown";
		        break;

		    }
		    System.out.println("Size: " + size);
		  }
		
	}


