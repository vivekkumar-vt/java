// printing numbers 1 to N

public class Num {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=0;i<=n;i++){
            System.out.print(i + " ");
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
