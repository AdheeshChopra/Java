public class Casting {
    public static void main(String[] args){
//        Implicit Casting
//        byte>short>int>long>float>double
//        short x=1;
//        int y=x+2;
//        System.out.println(y);

//        Explicit Casting
//        double x=1.1;
//        int y= (int)x+2;
//        System.out.println(y);

//        Parsing
        String x="1.1";
        double y= Double.parseDouble(x) +2;
        System.out.println(y);
    }
}
