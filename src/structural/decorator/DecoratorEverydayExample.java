package structural.decorator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecoratorEverydayExample {

    public static void main(String[] args) throws IOException {

        File file = new File("output.txt");
        file.createNewFile();
        OutputStream output = new FileOutputStream(file);
        DataOutputStream dataStream = new DataOutputStream(output);
        dataStream.writeChars("simple decorator pattern example");

        dataStream.close();
        output.close();

    }
}
