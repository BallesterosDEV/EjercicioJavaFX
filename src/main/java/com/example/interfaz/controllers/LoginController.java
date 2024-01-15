package com.example.interfaz.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    public LoginController(){

    }

    /*ID del botón de Login*/
    @FXML
    private Button loginBtn;
    /*ID del Label de mensaje de error*/
    @FXML
    private Label errorMessage;
    /*ID del campo de texto donde el usuario introduce su nickname*/
    @FXML
    private TextField nickName;


    public void userLogin(ActionEvent event)throws IOException{
        /*Lleva al método que lleva toda la lógica (validaciones)*/
        checkLogin();
    }

    private void checkLogin()throws IOException{
        /*Aquí vienen las validaciones, comprobar que no esté en la lista el nickname, comprobar que sean más de
         cuatro caracteres, que isBlank() o isEmpty() sean false, que no sea nulo...*/

        /*En caso de tener éxito, cambia a una nueva escena*/

        /*En caso de error, dependiendo del error, coges la variable errorMessage.setText("Este nick no está disponible")
        o errorMessage.setText("Este nick es nulo"), si tiene éxito el Login el errorMessage estará en blanco
        así que ahí no tienes que hacer nada
         */
    }
}
