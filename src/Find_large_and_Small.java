
public class Find_large_and_Small {
    public static void main(String[] args) {
        int[] arr = {10,20,40,50,100,10000};
        int largest = arr[0];
        int smallest = arr[0];

        for(int num : arr){
            if(num > largest){
                largest = num;
            }
            if(num < smallest){
                smallest = num;
            }

        }
        System.out.println("smallest: " +smallest);
        System.out.println("largest: "+largest);



    }
}
