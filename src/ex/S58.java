package ex;

import java.io.InputStream;

import com.sun.java_cup.internal.runtime.Scanner;

public class S58{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=((Object) in).nextInt();
        for(int i=0;i<t;i++){
            int a = ((Object) in).nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int [] result;

            for(a=0; a<=50;a++){
                for(b=0;b<=50;b++){
                    for(n=1;n<=15; n++)
                    result[t]=(int) (a*b*Math.pow(2,(n-1)));            
                    System.out.println(result[t]);
                }

            }
        }
        in.close();
    }
}