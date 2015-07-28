package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an unknown amount of lists, each with an unknown length, I need to generate a singular list with all possible unique combinations. For example, given the following lists:

X: [A, B, C] 
Y: [W, X, Y, Z]
Then I should be able to generate 12 combinations:

[AW, AX, AY, AZ, BW, BX, BY, BZ, CW, CX, CY, CZ]
If a third list of 3 elements were added, I'd have 36 combinations, and so forth.
 * @author raarcot
 *
 */

public class GeneratePermutations {
	public static List<String> result = new ArrayList<String>();
	
	public static void GeneratePermutations(List<List<Character>> Lists, List<String> result, int depth, String current)
	{
	    if(depth == Lists.size())
	    {
	       result.add(current);
	       return;
	     }

	    for(int i = 0; i < Lists.get(depth).size(); ++i)
	    {
	        GeneratePermutations(Lists, result, depth + 1, current + Lists.get(depth).get(i));
	        
	    }
	}
	
	public static void main(String[] args){
		
		List<List<Character>> lists = new ArrayList<List<Character>>();
		
		List<Character> a1 = new ArrayList<Character>();
		a1.add('A');
		a1.add('B');
		List<Character> b1 = new ArrayList<Character>();
		b1.add('1');
		b1.add('2');
		List<Character> c1 = new ArrayList<Character>();
		c1.add('X');
		c1.add('Y');
		lists.add(a1);
		lists.add(b1);
		lists.add(c1);
		
	  // GeneratePermutations(lists, result, 0, "");
	   genPerm(lists, 0, result, "");	
	   System.out.println(result);
	}
	

	public static void genPerm(List<List<Character>> lists, int depth, List<String> result, String current){
		if(depth == lists.size()){
			result.add(current);
			return;
		}
		for (int i = 0 ; i < lists.get(depth).size(); i++){
			genPerm(lists, depth+1, result, current + lists.get(depth).get(i));
		}
		
	}
	
	

	/**
	 * Write a method that returns a country name randomly from the following map such that the country with the highest population,
	 * has the biggest chance of being randomly selected among all countries. So the probability of a country getting selected is
	 * directly proportional to its population.
	 */
	/*public class RandomGenerator {

	    private static Map<String, Long> countryPopulationMap = new HashMap<String, Long>();

	    static {
	        countryPopulationMap.put("China", 1369140000L);
	        countryPopulationMap.put("India", 1297063039L);
	        countryPopulationMap.put("US", 320646000L);
	        countryPopulationMap.put("Indonesia", 1369140000L);
	        countryPopulationMap.put("Brazil", 204129000l);
	        countryPopulationMap.put("Pakistan", 189787000L);
	        countryPopulationMap.put("Nigeria", 183583000L);
	        countryPopulationMap.put("Bangladesh", 158286000L);
	        countryPopulationMap.put("Russia", 146267288L);
	        countryPopulationMap.put("Japan", 126910000L);
	        countryPopulationMap.put("Mexico", 121005815L);
	        countryPopulationMap.put("Philippines", 101256700L);
	        countryPopulationMap.put("Vietnam", 90730000L);
	        countryPopulationMap.put("Ethiopia", 90076012L);
	        countryPopulationMap.put("Egypt", 88311000L);
	        countryPopulationMap.put("Germany", 80925000L);
	    }
	    
	    public long void getTotalPopulation(){
	        List<Long> population = countryPopulationMap.values();
	        long totalPop;
	        for(Long pop : population){
	          totalPop = totalPop + pop;
	        }         
	        return totalPop;
	    }  
	    
	    public Map<String,Double> getPercentage(){
	        Map<String, Double> countryPerc = new HashMap<String, Double>();
	        double perct = 0.0;
	        lont totalPop = getTotalPopulation();
	        for(Map.Entry<String, Long> entry : countryPopulationMap.entrySet()){
	               perct = (entry.getValue() * 100) / totalPop;
	               countryPerc.put(entry.getKey(), perct);
	        }
	    }
	    
	    // Random range 1 - 100
	    
	    public int getRandomNumber(){
	    
	           Random randomGen = new Random();
	           int rand = randomGen.
	 
	     

	    public static void main(String[] args) {
	        System.out.println(countryPopulationMap.size());
	    }

	}*/

}
