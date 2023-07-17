package Java;

public class TeemoAshe {

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int dur=0;
        for (int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i]+duration>timeSeries[i+1]){
                dur+=timeSeries[i+1]-timeSeries[i];
            }
            else{
                dur+=duration;
            }
        }

        return dur+duration;
    }

    public static void main(String[] args){
        int[] timeSeries=new int[]{1,3,5,7,9,11,13,15};
        System.out.println(findPoisonedDuration(timeSeries,3));
    }
}
