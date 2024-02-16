package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginFormController {

    @FXML
    private TextField userNameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        String username = userNameTextField.getText();
        String password = passwordField.getText();
        // You can add your authentication logic here

        // For now, let's just print the entered username and password
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
