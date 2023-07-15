package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candles {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> results=new ArrayList<Boolean>(Arrays.asList(new Boolean[candies.length]));
        for (int i=0;i<candies.length;i++){
            for(int j=0;j<candies.length;j++){
                if((candies[i]+extraCandies)>=candies[j])
                {
                    results.set(i,true);
                }
                else{
                    results.set(i,false);
                    break;

                }
            }
        }
        return results;
    }

    public static void main(String[] args){
        int[] candies = new int[]{2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));;
    }
}
