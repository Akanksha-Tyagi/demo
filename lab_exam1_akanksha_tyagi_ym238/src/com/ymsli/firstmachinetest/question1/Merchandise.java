package com.ymsli.firstmachinetest.question1;

import java.util.Comparator;

public class Merchandise    {
	private String itemCode;
	private int quantity;
	private double unitPrice;

	public Merchandise() {

	}

	public Merchandise(String itemCode, int quantity, double unitPrice) {

		this.itemCode = itemCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Merchandise [itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
	}
	

	
	
}
class MerchandiseComparator implements Comparator<Merchandise> { 
	public int compare(Merchandise merchandise1, Merchandise  merchandise2) 
    { 
        if ( merchandise1.getUnitPrice() ==  merchandise2.getUnitPrice()) 
            return 0; 
        else if ( merchandise1.getUnitPrice() >  merchandise2.getUnitPrice()) 
            return -1; 
        else
            return 1; 
    } }
