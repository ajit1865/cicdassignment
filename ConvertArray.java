import java.util.HashMap;
import java.util.Arrays;
class ConvertArray
{
    /* Function to map index value*/
    
    public static void convert(int arrOrg[], int arrLen)
    {
        int temp[] = arrOrg.clone();
        Arrays.sort(temp);
        
        /* One by one insert elements of sorted
         temp[] and assign them values from 0 to arrLen-1 */
        
        HashMap<Integer, Integer> umap = new HashMap<>();
        int val = 0;
        for (int index = 0; index < arrLen; index++)
            umap.put(temp[index], val++);
       
        // Convert array by taking positions from umap
        for (int index = 0; index < arrLen; index++)
        {
            arrOrg[index] = umap.get(arrOrg[index]);
            System.out.print(arrOrg[index] + " ");
        }
    }
    public static void main(String[] args)
    {
        int array[] = {20,10,35,42,8};
        int arrLen = array.length;
        //passing array and length of array
        convert(array, arrLen);
    }
}
