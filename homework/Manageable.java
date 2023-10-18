package javaprogramming2.week6.homework;

import java.util.Scanner;

public interface Manageable {
    public void read(Scanner scan);
    public String toString();
    public boolean matches(String kwd);
}