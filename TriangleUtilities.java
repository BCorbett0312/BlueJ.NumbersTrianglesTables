 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder rowWidth = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++){
            rowWidth.append("*");
        }
       
        return rowWidth.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder hardTriangle = new StringBuilder();
        for (int i = 1; i <= numberOfRows; i++){
            
                for(int j = i; j > 0; j--){
                hardTriangle.append("*");
            }
            hardTriangle.append("\n");        
        }
        
        return hardTriangle.toString();
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
