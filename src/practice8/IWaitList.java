package practice8;


import java.util.Collection;

//default - ?

public interface IWaitList <E>{
     default void add(E element){

    }

    default E remove() {
        return null;
    }

    boolean contains(E element);

    boolean containsAll(Collection <E> c);


    boolean isEmpty();



}
