package math;

public class Util {

    public static void varTester(){
        double d;
        d = 4.5;
        System.out.println(d);
        d += d;
        System.out.println(d);
    }

    /**Returns a double value with a positive sign
     * greater than or equal to 0.0 and less than Max Bound.
     * @param maxBound
     * @return
     */
    public static int genRandom(int maxBound){
        int x = (int)(Math.random() * (maxBound + 1));
        return x;
    }
    public static int genRandom(int minBound ,int maxBound){
        int v = maxBound + 1 - minBound;
        int x = (int)(Math.random() * v + minBound);
        return x;
    }
    public static int genRandom(){
        return genRandom(10);
    }

}
