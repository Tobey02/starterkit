/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.unsw.infs2605.calculator3;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/**
 *
 * @author malshika
 */
public class SecondaryController {
    private double placeholder = 0;
    @FXML
    Label lblresult;
    
    @FXML
    TextField txtInput1;
    
    @FXML
    TextField txtInput2;
    
    @FXML 
    private void multiplyComp (ActionEvent event) {
         
        placeholder = Double.valueOf(txtInput1.getText()) * Double.valueOf(txtInput2.getText());
        lblresult.setText(Double.toString(placeholder));
    }
    
    @FXML 
    private void divideComp (ActionEvent event) {
         
        placeholder = Double.valueOf(txtInput1.getText()) / Double.valueOf(txtInput2.getText());
        lblresult.setText(Double.toString(placeholder));
    }
    
    @FXML 
    private void addComp (ActionEvent event) {
         
        placeholder = Double.valueOf(txtInput1.getText()) + Double.valueOf(txtInput2.getText());
        lblresult.setText(Double.toString(placeholder));
    }
    
    @FXML 
    private void subtractComp (ActionEvent event) {
         
        placeholder = Double.valueOf(txtInput1.getText()) - Double.valueOf(txtInput2.getText());
        lblresult.setText(Double.toString(placeholder));
    }
     
    
    
}