package com.rakuten.training.functional;

import java.util.Optional;

import com.rakuten.training.basics.ChemicalElement;

public class TestOfTest {

	public static void main(String[] args) {
		Test.first.isAlkaliMetal();
		System.out.println("adddd");//System.out::println
		
		Optional<ChemicalElement> opt = Test.readFromDB(115);
		//ChemicalElement c = opt.orElse(new ChemicalElement(1, "h", "hy"));
		if(opt.isPresent()) {
			ChemicalElement e = opt.get();
			if(e.getSymbol().equalsIgnoreCase("Unu")) {
				System.out.println("This is unobtainium......");
			}
		}
		
	}

}