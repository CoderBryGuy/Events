package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox ourCheckBox;

    @FXML
    public void initialize(){
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){

       if(e.getSource().equals(helloButton)){
           System.out.println("hello, " + nameField.getText());
       }else if(e.getSource().equals(byeButton)){
           System.out.println("bye " + nameField.getText());
       }

//       if(checkBox.isSelected()){
//           nameField.clear();
//       }

    }

    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButtons);
        byeButton.setDisable(disableButtons);
    }

    public void handleChange(){
        System.out.println("the checkbox is " + (ourCheckBox.isSelected() ? "checked": "unchecked"));
    }


}
