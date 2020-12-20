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

    public static void selectionSort(int[] data){
        // use a nested loop. This time we're moving the smallest element to the leftmost spot.
        for (int i = 0; i <data.length-1; i++){
            int min = data[i];
            for(int j = i+1; j<data.length-1; j++){
                //sort statement
                if(data[j] < min){
                    int newMin = data[j];
                    data[j] = min;
                    min = newMin;
                }
            }
        }
    }
}