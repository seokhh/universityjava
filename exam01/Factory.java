package javaprogramming2.week7.exam01;

public interface Factory <Student extends Manageable> {
    public Student create();
}