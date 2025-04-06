package evkozi;

import java.util.ArrayList;

public class Teacher {
    private final int ID;
    private final String lastName;
    private final String firstName;
    private static int counter = 0;
    ArrayList<Project> projects = new ArrayList<>();

    public Teacher(String lastName, String firstName) {
        //AUTOMATIKUS ID GENERALAS
        this.ID=counter++;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getID() {
        return ID;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    //Az ujDolgozat metódus egy új dolgozatot rendel a tanárhoz (bővíti a dolgozatok tömbjét).
    public void newProject(Project project){
        projects.add(project);
    }
    //A kiirDolgozatok metódus kiírja azon dolgozatok címét, amelyek egy adott jegynél nagyobb minősítést kaptak.
    public void printProjects(int grade){
        for(Project project:projects){
            if(project.getGrade()>grade){
                System.out.println(project);
            }
        }
    }
    //A vezetettDiakok metódus visszatéríti a tanár által vezetett diákok neveit tartalmazó tömböt (ArrayList<String> ).
    public ArrayList<String> ledStudents(){
        ArrayList<String> students=new ArrayList<>();
        for(Project project:projects){
            if(!students.contains(project.getStudentName())){
            students.add(project.getStudentName());
            }
        }
        return students;
    }
   // A kiirInformaciok metódus kiíratja a tanár teljes nevét, majd ezt követően minden vezetett államvizsga dolgozat információit.
    public void printInformation(){
        System.out.println(firstName+" "+lastName);
        for(Project project:projects){
            System.out.println(project);
        }
    }
}

