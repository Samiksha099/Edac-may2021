import java.util.Scanner;
public class Center {
	double CentreId;
	String CentreName;
	String CentreLocation;
	String CentreAddress;
	String CentreCoordinator;

     public Center(double CentreId, String CentreName,String CentreLocation,String CentreAddress,String CentreCoordinator) 
     {
              this.CentreId = CentreId;
              this.CentreName = CentreName;
              this.CentreLocation = CentreLocation;
              this.CentreAddress = CentreAddress;
              this.CentreCoordinator = CentreCoordinator;
              
              
              
     }
     
     public void DisplayDetails() {
    
 		
    	 System.out.println(" CentreId " +CentreId);
    	 System.out.println(" CentreName " +CentreName);
    	 System.out.println(" CentreLocation " +CentreLocation);
    	 System.out.println(" CentreAddress " +CentreAddress);
    	 System.out.println(" CentreCoordinator " +CentreCoordinator);
    	 
    	 
     }

	

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String arr[] = new String[] {"Bangalore" ,"Pune","Mumbai","Hyderabad","Chennai"};
		 int j = 0;
	 		while(j < arr.length) {
	 			System.out.println(arr[j]);
	 			j++;
	 		}
	 		
	 		System.out.println("Enter the CentreLocation ");
			String Location = sc.nextLine();
		
		System.out.println("Enter the CentreID ");
		double ID = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the CentreName ");
		String Name = sc.nextLine();
		
		
		System.out.println("Enter the CentreAddress ");
		String Address = sc.nextLine();
		
		System.out.println("Enter the CentreCoordinator ");
		String Coordinator = sc.nextLine();
		
		

		Center c = new Center(ID,Name,Location,Address,Coordinator );
		 c.DisplayDetails();
		 sc.close();
		
		
		
	}
	}
