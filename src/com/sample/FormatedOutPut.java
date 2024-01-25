package com.sample;

import java.util.ArrayList;
import java.util.Formattable;
import java.util.List;
import java.util.Scanner;

public class FormatedOutPut {

	public static void main(String[] args) {
		
		List<Integer> x= new ArrayList<Integer>();
		List<String> s1 = new ArrayList<>();
		
		 Scanner sc=new Scanner(System.in);
         System.out.println("================================");
         for(int i=0;i<3;i++)
         {
             s1.add(sc.next());
             x.add(sc.nextInt());
             //Complete this line

         }
         
         System.out.println("================================");
         
         for(int i=0;i<s1.size();i++) {
        	 String formatted = String.format("%-15s %03d",s1.get(i), x.get(i));
        	 System.out.println(formatted);	 
         }
         System.out.println("================================");
	}

}
