package com.Login.maven_archetype_Login;

import java.io.IOException;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AfterLoginController {
	
	
	@FXML
	private MFXButton logout;

	public void userLogOut(ActionEvent event) throws IOException{
		Main m = new Main();
		m.changeScene("Scene.fxml"); 
	}
}
