package com.ymsli.firstmachinetest.question1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class MerchandiseInventoryTest {
	public static void main(String[] args) {
		
		
		 String itemCode;
		 int quantity;
		 double unitPrice;
		 
		 //list to store merchandise records
		 List<Merchandise> allMerchandise=new ArrayList<>();

		String line=null;
		
		// first open stream to read the records(we use buffer to increase performance)
		
		try (BufferedReader bufferReader = new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym238\\Desktop\\ymslimachinetests\\lab_exam1_akanksha_tyagi_ym238\\src\\com\\ymsli\\record\\input.dat")))){
			
			//Loop to iterate through all the Merchandise Record
			
			while((line=bufferReader.readLine())!=null) {
				
				//i need to read all the values of particular Merchandise
				
				String []recordtokens=line.split(" ");
				itemCode=recordtokens[0];
				quantity=Integer.parseInt(recordtokens[1]);
				unitPrice=Double.parseDouble(recordtokens[2]);
				allMerchandise.add(new Merchandise(itemCode,quantity,unitPrice));
				
				
			}
			//close the stream because if we don't then leakage occurs
			
			bufferReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("List of Merchandise before applying sorting.");
		System.out.println("------------------------------------");
		allMerchandise.forEach((merchandise) -> System.out.println(merchandise));
		
		System.out.println("------------------------------------");
		System.out.println("List of Merchandise sorted by name in  ascending order");
		System.out.println("------------------------------------");
		
		Collections.sort(allMerchandise, (merchandise1, merchandise2) -> merchandise1.getItemCode().compareTo(merchandise2.getItemCode()));
		allMerchandise.forEach((merchandise) -> System.out.println(merchandise));
		System.out.println("------------------------------------");
		
		System.out.println("List of Merchandise sorted by price in  descending order");
		System.out.println("------------------------------------");
		Collections.sort(allMerchandise, new MerchandiseComparator());
		
		allMerchandise.forEach((merchandise) -> System.out.println(merchandise));
		System.out.println("------------------------------------");
	}

}
