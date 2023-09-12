import java.util.*;

public class SortFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3,3,4,5};
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        for (int num: arr){
            frequencyMap.put(num , frequencyMap.getOrDefault(num,0)+1);

        }
        List<Map.Entry<Integer,Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        entryList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        int[] SortedArr = new int[arr.length];
        int Index =0;

        for (Map.Entry<Integer,Integer> entry: entryList){
            int num = entry.getKey();
            int frequency= entry.getValue();

            for (int i =0; i<frequency;i++){
                SortedArr[Index++]=num;

            }
        }

        System.out.println(Arrays.toString(SortedArr));



    }
}
