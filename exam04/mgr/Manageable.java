package javaprogramming2.week6.exam04.mgr;

import java.util.Scanner;

public interface Manageable {
    public void read(Scanner scan);
    public void print();
    public boolean matches(String kwd);
}