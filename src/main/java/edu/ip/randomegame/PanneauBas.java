package edu.ip.randomegame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauBas extends JPanel{
    public PanneauBas(){
        this.setSize(800, 100);
        this.setLayout(new FlowLayout());
        
        JButton valider=new JButton("VALIDER");
        JButton rejouer=new JButton("REJOUER");
        JButton quitter=new JButton("QUITTER");
        
        
        
        //validation
        valider.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                PanneauCentre.champJoueur.setEnabled(false);
                int joueur=Integer.parseInt(PanneauCentre.champJoueur.getText());
                int machine=(int)(Math.random()*5);
                PanneauCentre.champMachine.setText(String.valueOf(machine));
                if(joueur==machine){
                    PanneauCentre.resultat.setBackground(Color.YELLOW);
                    PanneauCentre.resultat.setText("\n\n          Bravo\n      Vous avez\n          gagné");
                }
                else{
                    PanneauCentre.resultat.setBackground(Color.red);
                    PanneauCentre.resultat.setText("      Vous avez\n         perdu\n  Retenter votre\n        chance");
                }
            }
        });
        
        //reinitialisation
        rejouer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                PanneauCentre.champJoueur.setEnabled(true);
                PanneauCentre.champJoueur.setText("");
                PanneauCentre.champMachine.setText("");
                PanneauCentre.resultat.setText("");
                PanneauCentre.resultat.setBackground(Color.white);
            }
        });
        //quitter le jeu
        quitter.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        this.add(valider);
        this.add(rejouer);
        this.add(quitter);
    }
    
}
