import java.util.Random;
public class Practice1_PhraseGenerator {
    public static void main(String[] args) {
        String[][] arrofwords = {
                {"проникающий", "взаимный", "уполномоченный", "круглосуточный", "динамичный", "умный"},
                {"нацеленный", "фирменный", "трехзвенный", "убойный", "совместный", "ускоренный"},
                {"процесс", "портал", "подход", "старт", "обзор", "выход из положения"}};
        System.out.println("Все, что нам нужно, - это...");
        for(int i = 0; i< arrofwords.length; i++){
            int rand = (int)(Math.random()* arrofwords[i].length);
            String w1 = arrofwords[i][rand];
            System.out.print(w1+" ");

        }
    }
}
