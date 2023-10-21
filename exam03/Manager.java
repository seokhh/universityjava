package javaprogramming2.week7.exam03;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager <T extends Manageable> {
    public ArrayList<T> mList = new ArrayList<>();

    public void readAll(String filename, Factory<T> fac) {
        Scanner filein = openFile(filename);
        T m = null;
        while (filein.hasNext()) {
            m = fac.create();
            m.read(filein);
            mList.add((T) m);
        }
        filein.close();
    }
    public Scanner openFile(String filename) {
        Scanner filein = null;
        try {
            filein = new Scanner(new File(filename));
        } catch (IOException e)
        {
            System.out.println("파일 입력 오류");
            System.exit(0);
        }
        return filein;
    }

    public void printAll() {
        for (T m: mList)
            m.print();
    }

    public void search(Scanner scan) {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (T m : mList) {
                if (m.matches(kwd))
                    m.print();
            }
        }
    }
    public T find(String kwd){
        for (T m: mList) {
            if (m.matches(kwd))
                return m;
        }
        return null;
    }
}