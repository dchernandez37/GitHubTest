package csis113b;

public class Main
{
    
    public static void main(String[] args)
    {
        // write your code here
        int firstNumber = 3;
        firstNumber++;
        ++firstNumber;
        
        // declare and initialize a second number
        var secondNumber = 7;
        var result = firstNumber + secondNumber;
        var anotherNumber = result++;
        var lastNumber = ++result;
    
        var counter = 0;
        
        // create an inner scope to demonstrate garbage disposal
        {
            counter++;
            var hiddenNumber = counter;
            counter++;
        }
        
        ++counter;
        
        // find the sum of numbers in the inclusive range of 1 and 5
        var sum = sumNumbersInRange(1, 5);
    }
    
    public static boolean max(int first, int second) {
        return first >= second;
    }
    
    public static boolean min(int first, int second) {
        return first <= second;
    }
    
    public static int sumNumbersInRange(int start, int stop) {
        var sum = 0;
        
        for(var i = start; i <= stop; i++) {
            sum += i;
        }
        
        return sum;
    }
}
