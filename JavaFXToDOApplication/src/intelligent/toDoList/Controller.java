package intelligent.toDoList;

import intelligent.toDoList.dataModels.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Controller {

    private List<ToDoItem> toDoItems;

    @FXML
    private ListView todoListView;

    public void initialise(){
        ToDoItem item1= new ToDoItem("Clean the dishes", "Clean the dishes before going to bed and then " +
                "then put them back in the cupboard", LocalDate.of(2016,6,6));
        ToDoItem item2 = new ToDoItem("Music", "Download Bohemian Rhapsody",
                LocalDate.of(2210,12,28));
        ToDoItem item3 = new ToDoItem("Fitness", "Go to gym and don't eat anything after 9",
                LocalDate.of(2019, 11,25));
        ToDoItem item4 = new ToDoItem("Coding", "Do as much as you can in java course",
                LocalDate.of(2019,6,6));
        ToDoItem item5= new ToDoItem("Reading", "Read atleast one hour today",
                LocalDate.of(2019,6,6));

        toDoItems=new ArrayList<ToDoItem>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);

        todoListView.getItems().setAll(toDoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);


    }

    @FXML
    public void handleClcikListView(){

    }
}
