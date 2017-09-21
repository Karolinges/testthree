import java.util.ArrayList;

public class Word extends Temp{
    public static int wordCount;
    private ArrayList<Letter> wordList;

    public Word(String word) {
        System.out.println("word= "+word);
        wordList=new ArrayList<>();
        for (int i = 0; i <word.length() ; i++) {
            wordList.add(new Letter(word.charAt(i)));
        }
        ++wordCount;
    }

    // получаем String "Word"
    // разбиваем на буквы
    // каждую букву передаем в Letter в качестве параметра
    // создаем массив букв-обьектов класса Letter


}
