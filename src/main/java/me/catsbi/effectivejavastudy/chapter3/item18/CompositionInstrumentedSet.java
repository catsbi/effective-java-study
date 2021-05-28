package me.catsbi.effectivejavastudy.chapter3.item18;

import java.util.Collection;
import java.util.Set;

public class CompositionInstrumentedSet<E> extends ForwardingSet<E>{
    private int addCount = 0;

    public CompositionInstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount ++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        addCount += collection.size();
        return super.addAll(collection);
    }

    public int getAddCount() {
        return addCount;
    }
}
