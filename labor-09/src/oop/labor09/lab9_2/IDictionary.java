package oop.labor09.lab9_2;

public interface IDictionary {
    public final String DICTIONARY_FILE="dic.txt";
    public boolean add(String word);
    public boolean find(String words);
    public int size();
}
