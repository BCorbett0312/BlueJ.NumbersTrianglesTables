


public class NumberUtilities {

    public static String getRange(int stop) {
        String simpleRange = "";
        
        for (int i = 0; i < stop; i++){
                simpleRange += i;
        }   
     
        return simpleRange;
    }

    public static String getRange(int start, int stop) {
        String slightlyComplicatedRange = "";
        
        for (int i = start; i < stop; i++) {
            slightlyComplicatedRange +=i;
        }
                
        return slightlyComplicatedRange;
    }


    public static String getRange(int start, int stop, int step) {
        String complicatedRange = "";
        
        for(int i = start; i < stop; i += step) {
            complicatedRange += i;
        }
          
        return complicatedRange;
    }

    public static String getEvenNumbers(int start, int stop) {
        String evenNumbers = "";
        
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                evenNumbers += i;
            }
        }
        
        return evenNumbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String oddNumbers = "";
        
        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                oddNumbers += i;
            }
        }
        
        return oddNumbers;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String numExponents = "";
        
        for (int i = start; i <= stop; i++) {
            int exponentX = (int) Math.pow(i, exponent);
            numExponents += exponentX;
        }
        return numExponents;
    }
    
    
    
}
