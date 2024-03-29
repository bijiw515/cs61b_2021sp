package deque;

import org.junit.Test;

import java.util.Comparator;

public class MaxArrayDeque<T> extends ArrayDeque<T> {
    private Comparator<T> comparator;
    public MaxArrayDeque(Comparator<T> c){
        this.comparator = c;
    }

    public T max(){
        if (this.isEmpty())return null;
        T max = this.get(0);
        for (int i = 0 ; i < this.size() ; i += 1) {
            if (this.comparator.compare(this.get(i) , max) > 0){
                max = this.get(i);
            }
        }
        return max;
    }

    public T max(Comparator<T> c){
        if (this.isEmpty())return null;
        T max = this.get(0);
        for (int i = 0 ; i < this.size() ; i += 1) {
            if (c.compare(this.get(i) , max) > 0){
                max = this.get(i);
            }
        }
        return max;
    }
}