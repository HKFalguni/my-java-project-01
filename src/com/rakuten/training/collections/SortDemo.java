package com.rakuten.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.rakuten.training.basics.ChemicalElement;

public class SortDemo {
	
	public static String[] strings = {"this","is","a","bunch","of","strange","words","like","xylophone","and","zoo"};
	

	public static void main(String[] args) {
		//simpleStringArraySort();
		//simpleStringListSort();
		//sortAListOfUserDefinedType();
		sortAListOfUserDefinedTypesUsingComparator();
		

	}


	private static void sortAListOfUserDefinedTypesUsingComparator() {
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");
		ChemicalElement ar = new ChemicalElement(18, "Ar", "Argon");
		
		
		List<ChemicalElement> cList = new ArrayList<>();
		cList.add(h);cList.add(k);cList.add(o);cList.add(ar);
		
		System.out.println("befor sorting \n"+cList);
		
//		ChemicalElementNameLengthComparator comparisonLogic = new ChemicalElementNameLengthComparator();
		
//		ChemicalElementNameComparator comparisonLogic = new ChemicalElementNameComparator();
//		Collections.sort(cList, comparisonLogic);
		
		Collections.sort(cList, new Comparator<ChemicalElement>() {
			@Override
			public int compare(ChemicalElement o1, ChemicalElement o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("after sort\n"+cList);
		
	}


	private static void sortAListOfUserDefinedType() {
		ChemicalElement h = new ChemicalElement(1, "H", "Hydrogen");
		ChemicalElement k = new ChemicalElement(19, "K", "Potassium");
		ChemicalElement o = new ChemicalElement(8, "O", "Oxygen");
		
		List<ChemicalElement> cList = new ArrayList<>();
		cList.add(o);cList.add(h);cList.add(k);
		System.out.println("befor sorting \n"+cList);
		
		Collections.sort(cList);
		
		System.out.println("aftr sorting\n"+cList);
		
	}


	private static void simpleStringListSort() {
		List<String> sList = Arrays.asList(strings);
		System.out.println("b4 sort:\n"+sList);
		Collections.sort(sList);
		System.out.println("after sort:\n"+sList);
		
	}


	private static void simpleStringArraySort() {
		System.out.println("before sort\n"+Arrays.asList(strings));
		Arrays.sort(strings);
		System.out.println("after sort\n"+Arrays.asList(strings));
		
	}

}