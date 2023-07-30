import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int num[]={2,44,23,76,44,9,22,67};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int ans=Linear(num,target);
        System.out.println(ans);
    }
    static int Linear(int[] num, int target) {
        if(num.length==0){
            return -1;
        }
        for(int i=0;i<num.length;i++){
            if(num[i]==target){
                return i;
            }
        }
        return -1;
    }
}
