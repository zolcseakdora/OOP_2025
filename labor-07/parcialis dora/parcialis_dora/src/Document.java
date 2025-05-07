import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.StringBuffer;
public class Document extends ArrayList<Document> {
    private final int id;
    private static int counter;
    private String name;
    private MyDate creationDate;
    private StringBuffer content=new StringBuffer();

    public Document(String name, MyDate creationDate) {
        this.id=++counter;
        this.name = name;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    private String getContent(){
        return content.toString();
    }
    public MyDate getCreationDate() {
        return creationDate;
    }
    public void addLine(String line){
        content.append(line+"\n");
    }
    private void printDocument(PrintStream ps){
        ps.println("id,name,creation date,content");
            ps.println(id+","+name+","+creationDate+","+content);
    }
    public void  saveDocument(String filename){
        try(PrintStream out=new PrintStream(filename)){
            printDocument(out);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public int getLineCount(){
       int lineCount= content.toString().split("\n").length;
       return lineCount;
    }
    public boolean isEmpty(){
        if(content.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public void addLinesFromFile(String filename){
        try(Scanner scanner =new Scanner(new File(filename))){
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] parts=line.split(",");
                for(int i=0; i<parts.length; ++i){
                content.append(parts[i]+"\n");
                }
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }
    }
    public boolean findWord(String word){
       /* for(int i=0; i< content.length();i++)
            if (content.equals(word)) {
                return true;
            }
        return false;*/
        return content.toString().contains(word);
    }
    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", line count =" + getLineCount() +
                '}';
    }
}
