  package com.rakuten.training.collections;

  import java.util.HashMap;
  import java.util.Map;

  public class MapDemo {

    public static void main(String[] args) {
      simpleMapOps();

    }

    private static void simpleMapOps() {
      Map<String, Integer> runs = new HashMap<>();
      runs.put("Virat", 99);
      runs.put("Rohit", 36);
      runs.put("Ashwin", 100);

      System.out.println("Do we have runs of Virat? "+runs.containsKey("Virat"));
      System.out.println("Do we have runs of Jinx? "+runs.containsKey("Rahane"));
      System.out.println("Runs scored by Virat: "+runs.get("Virat"));
      System.out.println("Has anyone scored a perfect 100? "+runs.containsValue(100));

    }

  }