package javaprogramming2.week6.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Manager {
    static ArrayList<Manageable> mList = new ArrayList<>();
    static HashMap<String, Food> foodMap = new HashMap<>();

    void readAll(String filename, Factory fac) {
        Scanner filein = openFile(filename);
        Manageable m = null;
        while (filein.hasNext()) {
            m = fac.create();
            m.read(filein);
            mList.add(m);
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
        for (Manageable m : mList) {
            System.out.println(m.toString());
        }
    }
    public void search(Scanner scan) {
        String kwd = null;
        while (true) {
            System.out.print(">> ");
            kwd = scan.next();
            if (kwd.equals("end"))
                break;
            for (Manageable m : mList) {
                if (m.matches(kwd))
                    m.toString();
            }
        }
    }
    public static Manageable find(String kwd){
        for (Manageable m: mList) {
            if (m.matches(kwd))
                return m;
        }
        return null;
    }
    public static Food findFood(String n) {
        Food f = foodMap.get(n);
        if (f == null) {
            System.out.println("find null => " + n);
            throw new NullPointerException();
        }
        return f;
    }
}
