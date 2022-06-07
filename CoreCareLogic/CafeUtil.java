
public class CafeUtil {
    public int getStreakGoal(int arr [], int n){
        int sum = 0;
        for (int i = 0; i + 1 < n; i++)
        {
            sum = arr[i] + arr[i + 1];
            System.out.print(sum + " ");
        }
    }
}

  