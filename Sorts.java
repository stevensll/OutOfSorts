public class Sorts{
    public static void bubbleSort(int[]data){
        // use a nested loop. Esentially we're moving the max number to the right, then repeating that for a smaller section of the array.
        for (int i = 0; i<data.length-1; i++){
            for (int  j = 0; j < data.length-1-i;j++){
                //sort statement
                if( data[j] > data[j+1]){
                    int newNext = data[j];
                    data[j] = data[j+1];
                    data[j+1] = newNext;
                }
            }
        }
    }
    private static boolean checkSort(int[]data){
        for(int i = 1; i < data.length-1; i++){
            if(data[i] < data[i-1] || data[i] > data[i+1]) return false;
        }
        return true;
    }
}