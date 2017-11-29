import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float a,b,c,d,e,f,g,h,i,j;
        float max,min;
        a=in.nextFloat();
        b=in.nextFloat();
        c=in.nextFloat();
        d=in.nextFloat();
        e=in.nextFloat();
        f=in.nextFloat();
        g=in.nextFloat();
        h=in.nextFloat();
        i=in.nextFloat();
        j=in.nextFloat();
        max=a;
        if(b>max)
            max=b;
        if(c>max)
            max=c;
        if(d>max)
            max=d;
        if(e>max)
            max=e;
        if(f>max)
            max=f;
        if(g>max)
            max=g;
        if(h >max)
            max=h;
        if(i>max)
            max=i;
        if(j>max)
            max=j;
        System.out.printf("max=");
        System.out.printf("%.2f\n",max);
        min=a;
        if(b<min)
            min=b;
        if(c<min)
            min=c;
        if(d<min)
            min=d;
        if(e<min)
            min=e;
        if(f<min)
            min=f;
        if(g<min)
            min=g;
        if(h<min)
            min=h;
        if(i<min)
            min=i;
        if(j<min)
            min=j;
        System.out.printf("min=");
        System.out.printf("%.2f\n",min);

    }
}
