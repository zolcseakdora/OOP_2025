package oop.labor09.lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words  = new ArrayList<>();
    public ArrayListDictionary(){
       try(Scanner scanner = new Scanner(new File(DICTIONARY_FILE))){
           while(scanner.hasNextLine()){
               String word=scanner.nextLine();
               add(word);
           }
           Collections.sort(words);
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }
    }

    @Override
    public boolean add(String word) {
        //contains
        //csak nem letezot teszek be
        if (Collections.binarySearch(words, word) < 0) {
            words.add(word);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String word) {
        //return words.contains(words);
        //binaris kereses
        return Collections.binarySearch(words,word)>=0;
    }

    @Override
    public int size() {
        return words.size();
    }
}
