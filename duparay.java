import java.util.Scanner;

public class duparay {
    public static void dup(int[] a,int n){
        if(n<=1)
        {
            System.out.println("not valid");
        }
        int sl=a[0];
        int f=a[a[0]];
        while(f!=sl) {
            sl = a[sl];
            f = a[a[f]];}
            f = 0;
            while (sl != f) {
                sl = a[sl];
                f = a[f];
            }
            System.out.println(sl);
        }

    public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int k = s.nextInt();
            System.out.println("enter array elements");
            int[] a = new int[k];
            int n = a.length;
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            dup(a, n);

        }}
