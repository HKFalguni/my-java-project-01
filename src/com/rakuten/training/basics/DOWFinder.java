package com.rakuten.training.basics;

public class DOWFinder {
	
	
	
	public static boolean leapYear(int year)
	{
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            return(true);
        else
            return(false);
    }

	
	public static void findDOW(int day,int month,int year)
	{
		int ry;
		ry = year-1900;
		ry=ry*365;
		ry=ry+((year-1900)/4);
		
		if(leapYear(year) && (month==1||month==2)) 
		{
			ry=ry-1;
		}
		
		ry=ry%7;
		
		switch(ry) {
		case 0 : System.out.println("Sunday");
				 break; 
		case 1 : System.out.println("Monday");
			break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDOW(15,02,2021);
	}

}
