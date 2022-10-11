import java.util.*;
import java.util.function.Consumer;

public class WordHistogramHeritage extends HashMap <String, Integer> implements Iterable <String> {


    public WordHistogramHeritage(String string) {
        String[] words = string.split(" ");

        for (String w : words) {
            this.put(w, containsKey(w) ? get(w)+1 : 1);
        }
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<String> iterator() {
        return this.keySet().iterator();
    }
}



