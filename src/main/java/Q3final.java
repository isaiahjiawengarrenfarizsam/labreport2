

public class Q3 {
    public static void main(String[] args){
        String s = "?141";
        int k = 3;
        int result = TotalNumber(s,k);
        System.out.println(result);
        
        s = "???" ;
        k = 11;
        result = TotalNumber(s,k);
        System.out.println(result);
        
        s = "9?2253??";
        k = 7;
        result = TotalNumber(s,k);
        System.out.println(result);
    }
        
    public static int TotalNumber(String s, int k){        
        //change string s to char array
        char[] chars = s.toCharArray();
        
        //to record the number of "?" in String s
        int counter = 0;
        
        //to determine whether the first character of the String s is "?"
        boolean firstLetter = false;
        
        //the pattern to match
        String old = "\\?";
        
        //the string representation of each number that are going to replace the '?'
        String[] rep = {"0","1","2","3","4","5","6","7","8","9"};
       
        //iterate the array to find the number of "?" in a string
        for(int i = 0; i < s.length();i++){
            if(chars[i] == '?'){
                if(i == 0){
                    //determine whether the first character of the String s is "?"
                   firstLetter = true;
               }
               counter++;   
            }
        }   
        
        //ensure the s.length is at most 8 and wildcards at most 3
        if((s.length() > 8) || (counter > 3))
            return -1;
        
        //ensure first place wildcard is not zero
        int initial = 0;
        if(firstLetter){
           initial = 1;
        }
        
        int output = 0;
        
        //based on the number of "?" in String s, choose the relative method : 1 loop solve 1 "?"
        switch(counter){
            case 1 -> {
                for(int i = initial; i < 10; i++){
                    String temp1 = s.replaceFirst(old,rep[i]);
                    int temp2 = Integer.parseInt(temp1);
                    
                    if((temp2 % k) == 0){
                        output++;
                    }
                }
                }
     
            case 2 -> {
                for(int i = initial; i < 10 ; i++){
                    String temp1 = s.replaceFirst(old,rep[i]);
                    for(int j = 0 ; j < 10 ; j++){
                        String temp2 = temp1.replaceFirst(old,rep[j]);
                        int temp3 = Integer.parseInt(temp2);
                        
                        if((temp3 % k ) == 0){
                            output++;
                        }
                    }
                }
                } 
            case 3 -> {
                for(int i = initial; i < 10 ; i++){
                    String temp1 = s.replaceFirst(old,rep[i]);
                    for(int j = 0 ; j < 10 ; j++){
                        String temp2 = temp1.replaceFirst(old,rep[j]);
                        for(int l=0 ; l < 10 ; l++){
                            String temp3 = temp2.replaceFirst(old,rep[l]);
                            int temp4 = Integer.parseInt(temp3);
                            
                            if((temp4 % k ) == 0){
                                output++;

                            }
                        }
                    
                    }
                    
                }
                }  
    }return output;
        }
       
    }
