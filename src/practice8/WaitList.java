package practice8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList <E>{
    protected ConcurrentLinkedQueue content;

    public WaitList() {

    }
    public WaitList(Collection<E> c){

    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
