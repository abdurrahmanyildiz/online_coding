// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        if(binaryString.indexOf("1") == binaryString.lastIndexOf("1")){
            return 0;
        }

        binaryString = binaryString.substring(0, binaryString.lastIndexOf("1"));

        String[] gaps = binaryString.split("1");
        int max =0;
        
        for(String i: gaps){
            if(i.length()> max){
                max = i.length();
            }
        }

        return max;        
    }
    
}
