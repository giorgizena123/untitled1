//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1)
        int a=5;
        int b=7;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
//2
        double c=10.34;
        int k=(int) c;
        System.out.println(c-k);

//3
        int t=394;
        if(t/100>=1 && t/100 <=9){
            System.out.println("samnishnaa");
        }
        else{
            System.out.println("ar aris samnishna");
        }
//4)
        char q='t';
        char y=(char)(q-32);

        System.out.println(y);

//5)
        double o=14.4;
        int u=(int) o;
        double l=o-u;
        if(l<0.5){
            System.out.println(u);
        }
        else{
            System.out.println((int)(o+l));
        }
//6)
        int ar=8;
        int br=9;
        int kr=0;
        if(ar*br<=kr*kr){
            System.out.println(kr);;
        }
        else{
            kr++;
        }
//7)
        int sec=7852;
        int qe=3600;
        int le=60;
        int hour=(sec/3600);
        int min=(sec-hour*3600)/le;
        int seconds=sec-hour*3600-min*60;
        System.out.println(hour+":"+min+":"+seconds);

        //8)     if-ebis gareshea ukve

         }
     }

