package matableString;

public class test {
    public static void main(String[] args) {
        HtmlTableBuilder htmlTableBuilder = new HtmlTableBuilder();

        htmlTableBuilder.addHeaders("ID","NAME","AVG");

        System.out.println(htmlTableBuilder.build());


    }
}
