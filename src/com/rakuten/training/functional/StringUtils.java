package com.rakuten.training.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.rakuten.training.collections.SortDemo;

public class StringUtils {
	
	int instanceVar = 10;
	
	public static int eChecker(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	
	public static String betterString(String s1,String s2,TwoStringPredicate decider) {
		if(decider.isFirstBetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	
	
	
	
	
	public  void lambdaScopeAndLocalDemo() {
		
//		String s1 = "abc";
		int i = 42;
		Arrays.sort(SortDemo.strings, (s1,s2)->{ 
			
			this.instanceVar++;
			System.out.println(i);
			return s1.substring(0,1).compareTo(s2.substring(0,1));
		
		});
		
//		i++;
		System.out.println(Arrays.asList(SortDemo.strings));
		
		
		
	}
	
	
	
	public static List<String> allMatches(List<String> list,Predicate<String> testCondition){
		List<String> result = new ArrayList<String>();
		for(String anEntry : list) {
			if(testCondition.test(anEntry)) {
				result.add(anEntry);
			}
		}
		return result;
	}
	
	
	public static List<String> transformedList(List<String> list, Function<String,String> transformer){
		List<String> result = new ArrayList<>();
		for(String anEntry : list) {
			String transformedVaule = transformer.apply(anEntry);
			result.add(transformedVaule);
		}
		return result;
	}
	
	public static void main(String[] args) {
		
//		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.length() - s2.length());
//		System.out.println(Arrays.asList(SortDemo.strings));
//		Arrays.sort(SortDemo.strings, (s1,s2)-> s2.length() - s1.length());
//		System.out.println(Arrays.asList(SortDemo.strings));
//		Arrays.sort(SortDemo.strings, (s1,s2)-> s1.substring(0,1).compareTo(s2.substring(0,1)));
//		System.out.println(Arrays.asList(SortDemo.strings));
//		StringUtils obj = new StringUtils();
		Arrays.sort(SortDemo.strings,StringUtils::eChecker);
//		System.out.println(Arrays.asList(SortDemo.strings));
//		
//		String longer = ElementUtils.betterElement("Hi","Hello", (s1, s2) -> s1.length() > s2.length());
//		System.out.println(longer);
		
		List<String> words = Arrays.asList(SortDemo.strings);
		
//		List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
//		System.out.println(shortWords);
//		List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
//		System.out.println(wordsWithB);
//		List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
//		System.out.println(evenLengthWords);
//		
//		List<String> shortWords2 = ElementUtils.allMatches(words, s -> s.length() < 4);
//		System.out.println(shortWords2);
		
		List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
		System.out.println(excitingWords);
		List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
		System.out.println(eyeWords);
		List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords);
		
		List<String> upperCaseWords2 = ElementUtils.transformedList(words, String::toUpperCase);
		System.out.println(upperCaseWords2);
		
		List<Integer> lengths = ElementUtils.transformedList(words, s -> s.length());

		
	}

}