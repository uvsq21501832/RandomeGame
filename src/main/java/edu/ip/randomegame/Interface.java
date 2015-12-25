package edu.ip.randomegame;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class Interface extends JFrame{
    public Interface(){
        this.setSize(800, 400);
        
        Container c=this.getContentPane();
        c.setLayout(new BorderLayout());
        
        //CREATION DES PANNEAUX
        PanneauEntete entete=new PanneauEntete(); 
        PanneauCentre centre=new PanneauCentre();
        PanneauBas bas=new PanneauBas();
        PanneauGauche gauche=new PanneauGauche();
        PanneauDroite droite=new PanneauDroite();
        
        //PLACEMENT DES PANNEAUX
        c.add(entete,BorderLayout.NORTH);
        c.add(centre,BorderLayout.CENTER);
        c.add(bas, BorderLayout.SOUTH);
        c.add(gauche, BorderLayout.WEST);
        c.add(droite, BorderLayout.EAST);
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        
    }
    
}
