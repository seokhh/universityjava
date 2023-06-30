package javaprogramming.week15.class3.exam02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Exam08 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = null;
        DataOutputStream out = null;
        out = new DataOutputStream(new BufferedOutputStream
            (new FileOutputStream("c:\\java\\data.bin")));
        out.writeBoolean(false);
        out.writeDouble(3.14);
        out.writeInt(100);
        out.writeUTF("자기자신을 사랑하자");

        out.flush();

        in = new DataInputStream(new BufferedInputStream
            (new FileInputStream("c:\\java\\data.bin")));
        System.out.println(in.readBoolean());
        System.out.println(in.readDouble());
        System.out.println(in.readInt());
        System.out.println(in.readUTF());
        in.close();
        out.close();
    }
}
