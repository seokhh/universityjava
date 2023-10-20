package javaprogramming2.week7.exam01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager2 <Lecture extends Manageable> {
    ArrayList<Lecture> mList = new ArrayList<>();

    public void readAll(String filename, Factory2<javaprogramming2.week7.exam01.Lecture> fac) {
        Scanner filein = openFile(filename);
        Manageable m = null;
        while (filein.hasNext()) {
            m = fac.create();
            m.read(filein);
            mList.add((Lecture) m);
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
        for (Lecture m: mList)
            m.print();
    }

    public void search(Scanner scan) {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Lecture m : mList) {
                if (m.matches(kwd))
                    m.print();
            }
        }
    }
    public Manageable find(String kwd){
        for (Lecture m: mList) {
            if (m.matches(kwd))
                return m;
        }
        return null;
    }
}
