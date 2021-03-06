/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba.cuatroenraya2;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author noe
 */
public class Ficha extends Group {
    
    Group grupoFicha = new Group();
    static final short TAM_FICHA = 40;
    
        //Método constructor
    public Ficha(int numJugador){
        Circle circle1 = new Circle();
        circle1.setRadius(TAM_FICHA/2);
        this.getChildren().add(circle1);
        
        Circle circle2 = new Circle();
        circle2.setRadius(TAM_FICHA * 0.35);
        this.getChildren().add(circle2);
        
        
        if(numJugador==1){
            circle1.setFill(Color.RED);
            circle2.setFill(Color.web("0x8B0000"));
        } else {
            circle1.setFill(Color.BLUE);
            circle2.setFill(Color.rgb(0, 0, 175));
        }
    }
}
