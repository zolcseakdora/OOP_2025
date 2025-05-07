
public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2005, 10, 12);
        MyDate date2 = new MyDate(2006, 10, 12);
        System.out.println("A ket datum megegyezik-e:");
        System.out.println(date.equals(date2));
        System.out.println("A az elso datum nagyobb-e min a masodik?");
        System.out.println(date.isAfter(date2));
        Document document = new Document("dora", date);
        document.addLine("ez egy java parcialis");
        document.addLine("ez nemlesz jo");
        System.out.println("\na documentum tartalma");
        System.out.println(document);
        document.addLine("tenyleg nem megy");
        document.saveDocument("document.txt");
        document.saveDocument(System.out.toString());
        Document document1 = new Document("mate", date2);
        document1.addLinesFromFile("parci.txt");
        System.out.println(document1);
        Repository repo = new Repository(new Document("azta", date));
        repo.add(document);
        repo.add(document1);
        repo.add(null);
        /*
        System.out.println("\nA haramas id ures? ");
        for (Repository r : repo)
            if (repo.find(3).isEmpty()) {
                System.out.printf("igen");

            } else {
                System.out.println("nem");
            }
        repo.delete(3);
        System.out.println("a kovetkezo dokumentum tartalmazza a -nem= szot");
        for (Repository r : repo){
            if (repo.find("nem")) {
                System.out.println(repo);
            }
        }*/
    }
}