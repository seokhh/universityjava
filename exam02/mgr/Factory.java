package javaprogramming2.week9.exam02.mgr;

public interface Factory<T extends Manageable> {
    public T create();
}