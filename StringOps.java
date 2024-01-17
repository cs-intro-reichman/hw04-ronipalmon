public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println(allIndexOf("Hello world",'l'));
    }

    public static String capVowelsLowRest (String string) {
        String ans = "";
        for ( int i=0; i < string.length(); i++){
            char c= string.charAt(i);
            if ( c == 97 || c== 101 || c == 105 || c == 111 || c == 117){
                c -= 32;
                ans += c;
            } else if ( c == 65 || c == 69 || c == 73 || c == 79 || c == 85){
                ans += c;
            }else if (c > 65 && c <= 90){
                c += 32;
                ans += c;
            } else {
                ans += c;
            }
            
        }
        
        return ans;
    
}
    

    public static String camelCase (String string) {
        String retString = "";
        int j = 0;
        while (j < string.length() && string.charAt(j) == 32 ){
            j++;
        }
    
        while (j < string.length() && string.charAt(j) != 32){
            if (string.charAt(j) >= 'a'){
                retString += (char)string.charAt(j);
            }else{
                retString += (char)(string.charAt(j) + 32);
            }
            j++;
        }
        
        for (int i = j; i < string.length(); i++){
            if (string.charAt(i) != 32){
                    if (string.charAt(i - 1) != 32){
                        if (string.charAt(i) >= 'a'){
                            retString += (char)string.charAt(i);
                        }else{
                            retString += (char)(string.charAt(i) + 32);
                        }
                    }else{
                        if (string.charAt(i) >= 'a'){
                            retString += (char)(string.charAt(i) - 32);
                        }else{
                            retString += (char)(string.charAt(i));
                        
                        } 
                    }
            }
            
            }
        return retString;
        }
    



    public static int[] allIndexOf (String string, char chr) {
        
       
        int count = 0;
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i)==chr){
                count ++;
            }
        }
        int [] result= new int [count];
        int j=0;
        for (int i = 0; i<string.length(); i++){
            if (string.charAt(i)==chr){
            result[j]=i;
            j++;
        }
    }
        return result;
    }
}
