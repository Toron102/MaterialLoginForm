package com.Login.maven_archetype_Login;

import java.io.IOException;

import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

	public Controller() {
		
	}
	
	@FXML
	private MFXButton button;
	
	@FXML
	private Label wrongLogIn;
	
	@FXML
	private MFXTextField username;
	
	@FXML
	private MFXPasswordField password;
	
	
	public void userLogIn(ActionEvent event) throws IOException	{
		checkLogin();
	}
	
	private void checkLogin() throws IOException {
		Main m = new Main();
		if(username.getText().toString().equals("toron") && password.getText().toString().equals("qwerty")) {
			wrongLogIn.setText("Success!");
			
			m.changeScene("afterLogin.fxml");
		}
		
		else if(username.getText().isEmpty() && password.getText().isEmpty()) {
			wrongLogIn.setText("You didn't fill all nesessary boxes");

		}
		else if(username.getText().toString().equals("toron") == false) {
			wrongLogIn.setText("Wrong Login");

		}
		else {
			wrongLogIn.setText("Wrong data entered");
		}
		
	}
}
