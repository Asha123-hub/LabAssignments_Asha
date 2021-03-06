/** 
 * Desc  :  The program simply enter details of car 
 *          and check if there is available space
 *          and prints the output
 * Author:  Asha Vinod
 * Date  :  23-10-2020 
 * 
 */

   import java.util.Scanner;
    class CarOwner{                                                             //class containing car details
	private String name;
	private String regNo;
	public CarOwner(String name,String regNo)                              //contructor to initialize car members
	{
		this.name=name;
		this.regNo=regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
    }
    public class CarParking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.Park Car\n2.Get Car\n3.Get Available Space");        //print statements to get the user choice
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		String arr[][]=new String[5][];                                           //Jagged Array declaration and Instantiation for floorwise
		arr[0]=new String[100];
		arr[1]=new String[70];
		arr[2]=new String[50];
		arr[3]=new String[20];
		arr[4]=new String[10];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]="null";
			}
		}
		switch(choice)
		{                                                                           //Logic for car parking
		    case 1 :                                                              
		    	System.out.println("Enter the name and RegNo");
		    	Scanner sc=new Scanner(System.in);
		    	String name=sc.nextLine();
		    	String regNo=sc.nextLine();
		    	CarOwner c=new CarOwner(name,regNo);
		    	for(int i=0;i<arr.length;i++)
		    	{
		    		for(int j=0;j<arr[i].length;j++)
		    		{
		    			if(arr[i][j].equals("null"))                      // checks if empty space is available or not
		    			{
		    				c.setRegNo(regNo);
		    				arr[i][j]=c.getRegNo();
		    				break;
		    			}
		    		}
		    	}
		    	break;
		    case 2:                                                                // Logic for getting the parked car.
		    	System.out.println("Enter the name and RegNo");
		    	Scanner sb=new Scanner(System.in);
		    	String Name=sb.nextLine();
		    	String RegNo=sb.nextLine();
		    	CarOwner car=new CarOwner(Name,RegNo);
		    	for(int i=0;i<arr.length;i++)
		    	{
		    		for(int j=0;j<arr[i].length;j++)
		    		{
		    			if(arr[i][j].equals(RegNo))                      // checking with the register number
		    			{
		    				arr[i][j]="null";
		    				break;
		    			}
		    		}
		    	}
		    	break;
		    case 3:                                                              // Logic for finding empty place
		    	int count=0;
		    	System.out.println("Available Space in Car is:");
		    	for(int i=0;i<arr.length;i++)
		    	{
		    		for(int j=0;j<arr[i].length;j++)
		    		{
		    			if(arr[i][j].equals("null"))                     // checks if empty place is available.
		    			{
		    				count++;
		    			}
		    		}
		    		
		    	}
		    	System.out.println(count);
		    	break;
		 }
		
	}

}
