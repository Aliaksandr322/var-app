package matableString;

public class MutableStringTest {
    public static void main(String[] args) {
        StringBuffer buffer;
        StringBuilder builder = new StringBuilder();

        builder.append("Hello");
        String str = null ;
        builder.append(str);
        System.out.println(builder);


        StringBuilder builder1 = new StringBuilder(128);
        builder1.append("Hello world!");
        builder1.append("Hello world!");
        builder1.append("Hello world!");
        System.out.println(builder1);

        StringBuilder builder2 = new StringBuilder("1024");
        StringBuilder builder3 = new StringBuilder(builder);
        builder.length();

        System.out.println(builder3.reverse());


        System.out.println("capacity: " + builder3.capacity());
        System.out.println("length: " + builder3.length());
        System.out.println("free: " + (builder3.capacity() - builder3.length()));

        String words[] = builder1.toString().split(" ");
        for (String word : words){
            System.out.println(word);
        }




    }
}
