public class Main {

    public static final String STRING = "test word words test 1 10 1";

    public static void main(String[] args) {


        /*WordHistogramHeritage wordHistogram = new WordHistogramHeritage(STRING);
        System.out.println("MAP has " + wordHistogram.size() + " distinct words");

        for (String word : wordHistogram) {
            System.out.println(word + " : " + wordHistogram.get(word));*/

            WordHistogramComposition wordHistogram = new WordHistogramComposition(STRING);
            System.out.println("MAP has " + wordHistogram.map.size() + " distinct words");

            for (String word : wordHistogram) {
                System.out.println(word + " : " + wordHistogram.map.get(word));
        }
    }
}