package javaprogramming2.midtermexam;

import java.util.Scanner;

public class Lecture implements Manageable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void read(Scanner scanner) {

    }

    @Override
    public void print() {

    }

    @Override
    public boolean matches(String kwd) {
        return false;
    }
}
