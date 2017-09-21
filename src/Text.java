import java.util.ArrayList;
import java.util.StringTokenizer;

public class Text {

    private ArrayList<Sentence> textList;

    public Text(String text) {
        System.out.println("text= "+text);
        textList = new ArrayList<>();
        String tempString=new String();
        StringTokenizer st = new StringTokenizer(text, "?.!",true);
        while(st.hasMoreTokens()){
            tempString=st.nextToken();
            if(st.hasMoreTokens()) {
                tempString += st.nextToken();
            }
            tempString=tempString.trim();
            textList.add(new Sentence(tempString));
        }

    }

    public int findBeginSentence(char symbol){
        for (Sentence aL :textList) {
            aL.sentenceList
        }

//        textList.get(i);
        return 0;
    }

    public int findEndSentence(char symbol){
        return 0;
    }


    // получаем String "Text"
    // разбиваем на предложения,
    // каждое предложение передаем в Sentance в качестве параметра
    // создаем массив предложений-обьектов класса Sentence



}
