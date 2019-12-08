package intelligent.toDoList.dataModels;

import java.time.LocalDate;

public class ToDoItem {
    private String shortDescription;
    private String details;
    private LocalDate deadLine;

    //Constructor
    public ToDoItem(String shortDescription, String details, LocalDate deadLine){
       this.deadLine=deadLine;
       this.details=details;
       this.shortDescription=shortDescription;
    }
//Getter starts
    public String getShortDescription(){
        return this.shortDescription;
    }

    public String getDetails(){
        return this.details;

    }

    public LocalDate getDeadLine(){
        return this.deadLine;
    }
 // Getter ends

//Setter Starts
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }
//Setter ends


    @Override
    public String toString() {
        return shortDescription ;
    }
}
