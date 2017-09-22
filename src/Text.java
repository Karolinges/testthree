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

    public int findEndSentence(char symbol){
        int count;
        count=0;
        for (int i=0; i<textList.size(); i++) {
            if(textList.get(i).getSentenceList().get(textList.get(i).getSentenceList().size()-1) instanceof Punctuation){
                if(((Punctuation) textList.get(i).
                        getSentenceList().get(textList.get(i).getSentenceList().size()-1)).getPunctuation()==symbol){
                    count++;
                }
            }
        }
        return count;
    }

//    public int findEndSentence(char symbol){
//        return 0;
//    }
}
