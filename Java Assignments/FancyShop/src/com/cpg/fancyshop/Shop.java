package com.cpg.fancyshop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Shop {
private Map<Integer, String> productMap=new  TreeMap<>();

public Map<Integer, String> geProductMap(){
	return productMap;
}

public void setProductMap(Map<Integer, String> productMap) {
	this.productMap=productMap;
}

public void getProductMap(Map<Integer, String> productMap) {
	this.productMap=productMap;
}

public void addProductDetails(int serialNumber, String productName) {
	productMap.put(serialNumber, productName);
}

public List<String> searchBasedOnProduct(String productType){
	List<String> list=new ArrayList<>();
	
	for(String temp : productMap.values()) {
		if(temp.contains(productType)) {
			list.add(temp);
		}
	}
	return list;
}
}
