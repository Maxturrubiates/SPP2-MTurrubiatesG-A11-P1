/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.a11.p1;
import java.awt.*;
/**
 *
 * @author Max
 */
public class ventana2 extends Frame {
    //Botones
    private final  Button btnNorte, btnSur, btnEste, btnOeste, btnCentro;
    
    @SuppressWarnings ("OverridableMethodCallInConstructor")
    public ventana2(){
        super ("Ventana 2");
        setLayout (new BorderLayout());
        
        btnNorte= new Button ("NORTE");
        add (btnNorte, BorderLayout.NORTH); 
        
        btnSur= new Button ("SUR");
        add (btnSur, BorderLayout.SOUTH);
        
        btnEste= new Button ("ESTE");
        add (btnEste, BorderLayout.EAST);
        
        btnOeste= new Button ("OESTE");
        add (btnOeste, BorderLayout.WEST);
        
        btnCentro= new Button ("CENTRO");
        add (btnCentro, BorderLayout.CENTER);
        
        setSize (800,600);
        setVisible (true);
    }
}