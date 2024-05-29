package org.example;

import java.util.ArrayList;
import java.util.List;

public class SplitStringsBySeparator2788 {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        test.add("one.two.three");
        test.add("four.five");
        test.add("six");
        System.out.println(splitWordsBySeparator(test,'.'));

    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String>list=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String test[]=words.get(i).split("["+separator+"]");
            for (String word:test){
                if (word!=""){
                    list.add(word);
                }
            }
        }
        return list;
    }
}
