package wordCount; 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FizzBuzz {

    /**
     *Program that prints the numbers from 1 to 100.
     * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
     * For numbers which are multiples of both three and five print “FizzBuzz”.
     */


    /**
     * Private variables to hold both the list and the fizzbuzz List.
     */

    private List range;
    private List fizzBuzzList = new ArrayList();

   //constructor
    public FizzBuzz(int startOfRange, int endOfRange){
        range = IntStream.rangeClosed(startOfRange, endOfRange).boxed().collect(Collectors.toList());
        fizzBuzzIterator(range);
    }


    public boolean divisibleBy(int number, int div){
		//Check if the number is divisible by div
		if(number % div == 0)
			return true;
		else
			return false;
    }


    public void fizzBuzzIterator(List range){        
	
		
		
		for(Object i : range){
                    int j = (int) i;
			if(divisibleBy(j, 3) && divisibleBy(j, 5)){
				System.out.println("FizzBuzz");
				fizzBuzzList.add("FizzBuzz");
			}else if(divisibleBy(j, 3)){
				System.out.println("Fizz");
				fizzBuzzList.add("Fizz");
			}else if(divisibleBy(j, 5)){
				System.out.println("Buzz");
				fizzBuzzList.add("Buzz");
			}else{
				System.out.println(j);
			}
		}
	
    }


    public List getFizzBuzzList() {
        return fizzBuzzList;
    }
    
    public static void main(String[] args){
        
        FizzBuzz fb = new FizzBuzz(1, 100);
        fb.fizzBuzzIterator(fb.range);
        
        
    }
    
}
