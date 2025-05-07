import java.util.ArrayList;

public class Repository {
    ArrayList<Document> repo= new ArrayList<>();

    public Repository(ArrayList<Document> repo) {
        this.repo = repo;
    }
    public void delete(int id){
        for (Document d:repo){
            if(d.getId()==id){
                repo.remove(id);
                break;
            }
        }
    }
    public ArrayList<Document> find(int id){
        for(Document d:repo){
            if(d.getId()==id){
             return repo;
            }
        }
        return null;
    }
    public void find(String word){
        for(Document d:repo){
            if(d.findWord(word)){
                System.out.println(d);
            }
        }
    }
    public boolean cronologic(int date){
        for(Document d:repo){
            if(d.getCreationDate().equals(date)){
                return true;
            }
        }
        return false;
    }

    public void add(Document document) {
        repo.add(document);
    }
}
