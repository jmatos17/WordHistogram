import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

public class WordHistogramComposition implements Iterable <String> {

    Map<String, Integer> map = new HashMap<String, Integer>();

    public WordHistogramComposition (String string) {
        String[] words = string.split(" ");

        for (String w : words) {
            map.put(w, map.containsKey(w) ? map.get(w)+1 : 1);
        }
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }


}




