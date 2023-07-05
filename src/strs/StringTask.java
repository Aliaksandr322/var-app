package strs;

import java.util.Locale;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        String text = new String("Java is a programming language originally developed by Sun Microsystems and released in 1995" +
                " as a core component of Sun's Java platform. The language derives much of its Syntax from C and C++ but has a simpler " +
                "object model and fewer low-level facilities. Java applications are typically compiled to bytecode which can run on any Java virtual " +
                "machine (JVM) regardless of computer architecture.\n" +
                "\n" +
                "The original and reference implementation Java compilers, virtual machines, and class libraries were developed" +
                " by Sun from 1995. As of May 2007, in compliance with the specifications of the Java Community Process, Sun made " +
                "available most of their Java technologies as Virtual Machine under the GNU General Public License. Others have" +
                " also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java and GNU Classpath.\n" +
                "\n" +
                "Java's design, industry backing and portability have made Java one of the fastest-growing and " +
                "most widely used programming languages in the modern computing industry.Template:Fact");

        Scanner sc = new Scanner(System.in);
        String word = sc.next().toLowerCase();
        boolean isWord = text.contains(word);
        System.out.println(isWord);
        if (isWord){
            System.out.println(text.toLowerCase().indexOf(word.toLowerCase()));
            System.out.println(text.toLowerCase().lastIndexOf(word.toLowerCase()));
        }


    }
}
