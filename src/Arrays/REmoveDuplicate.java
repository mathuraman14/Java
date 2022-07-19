package Arrays;

public class REmoveDuplicate {
    public static void main(String[] args) {
        int n;
        int[] arr = {21,23,24,26,28,28,29,29,30};
        n = arr.length;
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==arr[i+1])
            {
                index = i+1;
                break;
            }
        }
        for (int i=0;i<index;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
