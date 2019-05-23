 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder mathTable = new StringBuilder();
        for (int i = 1; i <= tableSize; i++){
                     
            for(int j = 1; j <= tableSize; j++){
                               
                mathTable.append(String.format("%3d |",(j*i)));
            }
                
            mathTable.append("\n");
            }
        
        
        return mathTable.toString();
    }
}
