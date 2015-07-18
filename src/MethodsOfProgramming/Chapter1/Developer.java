package MethodsOfProgramming.Chapter1;

/**
 * Created by tm on 11.07.2015.
 */
public class Developer {
    private String name;
    private String dateOfAccept;
    private String dateOfComplete;

    public String getName(){
        return name;
    }
    public String getDateOfAccept(){
        return dateOfAccept;
    }
    
    public String getDateOfComplete(){
        return dateOfComplete;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDateOfAccept(String date){
        this.dateOfAccept = date;
    }

    public void setDateOfComplete(String date){
        this.dateOfComplete = date;
    }

    public void printDev(){
        System.out.println("name of developer: " + name);
        System.out.println("date of accept the quiz: " + dateOfAccept);
        System.out.println("date of complete the quiz: " + dateOfComplete);
    }
}
