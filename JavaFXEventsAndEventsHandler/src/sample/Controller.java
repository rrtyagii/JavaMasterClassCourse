package sample;

import javafx.application.Platform;
import javafx.beans.NamedArg;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    @FXML
   private TextField nameField;
//    @FXML
//    private TextField nameFeild;
    @FXML
    private Button YoYoButton;
    @FXML
    private Button NoNoButton;
    @FXML
    private CheckBox ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void initialize(){
        YoYoButton.setDisable(true);
        NoNoButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        if(e.getSource().equals(YoYoButton)){
            System.out.println("Hello There, "+nameField.getText());
        }
        else if(e.getSource().equals(NoNoButton)){
            System.out.println("See ya, " +nameField.getText()+" !");
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            ourLabel.setText("We did something");
                        }
                    });

                } catch(InterruptedException event){
                    // we don't care about this
                }
            }
        };
        new Thread(task).start();

        if(ourCheckBox.isSelected()){
            nameField.clear();
            YoYoButton.setDisable(true);
            NoNoButton.setDisable(true);
        }

    }
    @FXML
    public void handleKeyRelesed(){
        String text= nameField.getText();
        boolean disableButtons= text.isEmpty()||text.trim().isBlank();
        YoYoButton.setDisable(disableButtons);
        NoNoButton.setDisable(disableButtons);
    }
    @FXML
    public void handleChange(){
        System.out.println("THe checkbox is "+ (ourCheckBox.isSelected()?"checked":"not Checked "));
    }

}
