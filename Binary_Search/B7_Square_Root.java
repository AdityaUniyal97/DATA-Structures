package Binary_Search;

public class B7_Square_Root {
    static int square(int x)
    {
        int low = 1;
        int high = x;
        int ans = -1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            int msq = mid * mid;
            if(msq == x)
            {
                return mid;
            }
            else if(msq >  x)
            {
                high = mid - 1;
            }
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(square(10));
    }
}
