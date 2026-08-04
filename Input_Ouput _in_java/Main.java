import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int x=br.read();  //it reads a single character from the input stream and returns its ASCII value as an integer.
        // System.out.println("x = " + x);

        // int x=Integer.parseInt(br.readLine());  //it reads a line of text from the input stream and returns it as a string. The string is then parsed into an integer using Integer.parseInt() method.
        // System.out.println("x = " + x);

        // float x=Float.parseFloat(br.readLine());  //it reads a line of text from the input stream and returns it as a string. The string is then parsed into a float using Float.parseFloat() method.
        // System.out.println("x = " + x);

        // char x=(char)br.read();  //it reads a single character from the input stream and returns it as a character.
        // System.out.println("x = " + x);


        int x = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(x));
        bw.newLine();
        bw.close();
    }
}
