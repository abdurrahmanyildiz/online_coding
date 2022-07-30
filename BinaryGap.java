// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        String binStr = Integer.toBinaryString(N);

        if(binStr.indexOf("1") == binStr.lastIndexOf("1")){
            return 0;
        }


        binStr = binStr.substring(0, binStr.lastIndexOf("1"));

        String[] gaps = binStr.split("1");
        int max =0;
        for(String i: gaps){
            if(i.length()> max){
                max = i.length();
            }

        }

        return max;

        
    }
}