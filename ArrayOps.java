public class ArrayOps {
    public static void main(String[] args) {
        //System.out.println(isSorted(new int[] {7, 5, 4, 3, -12}));
        //System.out.println(isSorted(new int[] {1, -2, 3}));
        //System.out.println(isSorted(new int[] {1, 3, 2}));
    }
    
    public static int findMissingInt (int [] array) {
        int missingInt= 0;
       for (int i = 0; i < array.length+1; i++){
        for (int j = 0; j < array.length; j++){
            if (i == array[j]){ 
                break;
            }
            else{ 
                missingInt = i;
            }

        }
        }
       
       return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
        int maxIndex =0;
        int secondMax = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] >= max){
                max = array[i];
                maxIndex=i;
            }
        }
        for (int j=0; j < array.length; j++){
            if ((array[j] >= secondMax) && (j != maxIndex)){
                secondMax = array[j];

            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean equal = false;
        for (int i = 0 ; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array2[j] == array1[i]){
                    equal = true;
                    break;
                    
                }   
                equal = false;    
                }
            if (!equal){
                break;
            }
            }
            
        return equal;
    }

    public static boolean isSorted(int [] array) {
        boolean increasing = true;
        boolean decreasing = true;
        
        for (int i = 1; i < array.length; i++){
            if (array[i] > array[i-1]){
                decreasing = false; 
            }
            else if (array[i]< array[i-1]){
                increasing = false;

            }
            if (!increasing && !decreasing){
                return false;
            }
        }
        return true;
    }

}
