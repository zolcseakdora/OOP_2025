package evkozi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Dora","Zolcseak");
        teacher.newProject(new Project("info","Bence",10));
        teacher.newProject(new Project("matek","Bence",5));
        teacher.newProject(new Project("matek alapok","Bence",-1));
        teacher.printInformation();
        ArrayList<Teacher> teachers=readFromCSVFile("tanarok.csv");
        for(Teacher t:teachers){
            t.printInformation();
        }
        printIdTeacher(teachers);
        readFromCSVFile2("dolgozatok.csv",teachers);
        for(Teacher t:teachers){
            t.printInformation();
        }
        for(Teacher t2:teachers){
            t2.printProjects(7);
        }
        for(Teacher t3:teachers){
            for(String name:t3.ledStudents()){
                System.out.println(name);
            }
        }
    }

    public static ArrayList<Teacher> readFromCSVFile(String filename){
        ArrayList<Teacher> teachers=new ArrayList<>();
        try(Scanner scanner=new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                if(line.isEmpty()){continue;}
                String[] data=line.split(",");
                teachers.add(new Teacher(data[0].trim(),data[1].trim()));
            }

    }catch(FileNotFoundException e){
        e.printStackTrace();
        }
        return teachers;
    }
    public static void printIdTeacher(ArrayList<Teacher> teachers){
        for(Teacher t:teachers){
            System.out.println(t.getFirstName()+" "+t.getLastName()+" "+t.getID());
        }
    }
    public static void readFromCSVFile2(String filename,ArrayList<Teacher> teachers){
        try(Scanner scanner=new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                if(line.isEmpty()){continue;}
                String[] data=line.split(",");
                int id=Integer.parseInt(data[0].trim());
                String name=data[1].trim();
                String projectTitle=data[2].trim();
                int grade=Integer.parseInt(data[3].trim());
                for(Teacher t:teachers){
                    if(t.getID()==id){
                        t.newProject(new Project(projectTitle,name,grade));
                        break;
                    }
                }

            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }

    }

}
