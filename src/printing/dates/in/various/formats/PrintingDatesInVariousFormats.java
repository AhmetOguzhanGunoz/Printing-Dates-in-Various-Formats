/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing.dates.in.various.formats;

import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Ahmet Oğuzhan Günöz
 */
public class PrintingDatesInVariousFormats 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     //get the input data
        Scanner sc = new Scanner(System.in);       
        System.out.println("Please enter a date in mm/dd/yyyy: ");
        
        String date = sc.next();
        
        // split string into pieces
        StringTokenizer st = new StringTokenizer(date,"/");
        
        //get the day month year as integers
        
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());
        int year = Integer.parseInt(st.nextToken());
        
        String [] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        String monthname = months[month];
        System.out.printf("Display the date in other format: ");
        System.out.printf("%s %d, %d\n", monthname, day, year);
    }
    
}
