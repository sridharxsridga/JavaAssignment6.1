/* 
 * This program is to generate the number of days in a given month
 * 		Problem Statement 3:  Using two arrays, one to store the names of months and the other one to
		store the days in each month, write a program to find the number of days in a
		given month.
 * 
 */

package arraysUsage;

import java.util.Scanner;

public class NoOfDays {

	public static void main(String[] args) {
		String[] months = {"January","February",
			"March","April","May","June","July","August","September","October","November","December"};//String array to hold months
		int[] days = new int[months.length];//integer array to hold the days in a mont
		int counter=0;//index for days array
		
		for(String daysInMonth:months){//looping through each month to store no of days in a month
			switch (daysInMonth){
			case "January" : case "March" : case "May" : case "July" : 
			case "August" :case "October" : case "December" : days[counter]=31;//assigning days 
			break;
			case"April" :case "June" : case "September": case "November" : days[counter]=30; //assigning days 
			break;
			case "February" : days[counter]=28;//assigning day default to 28 since year has not been mentioned in the problem statement
			break;
			default: System.out.println("Invalid month");
			break;
			
			
			}
			counter++;//incrementing index
		}
		System.out.print("Months :{");
		for(String printMonth:months){//Loop to print the months
			System.out.print(printMonth+" , ");
		}
		System.out.print("}");
	
		System.out.println("\nEnter the month to find the number of days:");
		Scanner scanner = new Scanner(System.in);//Scanner to get user input
		String getMonth =scanner.next();//Accepting month as input
		for(int init=0 ;init<months.length;init++){
			if(getMonth.equalsIgnoreCase(months[init])){//check if the month entered by user is same as available in String array months 
				System.out.println("Days in this month:"+days[init]);//printing the equivalent days in a month
			}
			
			
		}
			
			
			
			
			
			
			
		}
		
	
	}


