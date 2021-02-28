
package com.rakuten.training.collections;

import java.util.Comparator;

import com.rakuten.training.basics.ChemicalElement;

public class ChemicalElementNameLengthComparator implements Comparator<ChemicalElement> {

	@Override
	public int compare(ChemicalElement o1, ChemicalElement o2) {
		return o1.getName().length() - o2.getName().length();
		
	}

}



ChemicalElementNameComparator implements Comparator<ChemicalElement> {

	@Override
	public int compare(ChemicalElement o1, ChemicalElement o2) {
		return o1.getName().length() - o2.getName().length();
		
	}

}