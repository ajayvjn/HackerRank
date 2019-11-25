/**
 * Created by Ajay on 11/2/16.
 */
public class abc {
    public static void main(String[] args) {
        int coins[]={2,5,8, 3};
        int n = 0;
        int sum = 0;
        for(int i=0; i<coins.length;i++){
            //n*(n+1)/2 = coins[i];
            int j =1;
            for( j = 1; j<=coins[i];j++){
                if(coins[i]-j <= j*(j+1)/2){
                    break;
                }
            }
            System.out.println(j);
            j=1;
        }
    }
}
