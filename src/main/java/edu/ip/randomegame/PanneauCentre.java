package edu.ip.randomegame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanneauCentre extends JPanel{
    
    public static JTextField champJoueur;
    public static JTextField champMachine;
    public static JTextArea resultat;
    
    public PanneauCentre(){
        this.setPreferredSize(new Dimension(600, 200));
        this.setLayout(new FlowLayout());
        
        JLabel joueur=new JLabel("JOUEUR");
        JLabel machine=new JLabel("MACHINE");
        champJoueur=new JTextField(60);
        champMachine=new JTextField(60);
        JLabel deliberation=new JLabel("RESULTAT");
        resultat=new JTextArea(10,10);
        
        this.add(joueur);
        this.add(champJoueur);
        this.add(machine);
        this.add(champMachine);
        champMachine.setEnabled(false);
        this.add(deliberation);
        this.add(resultat);
        resultat.setEnabled(false);
        Font f=new Font("",Font.BOLD,20);
        resultat.setFont(f);
        
    }
    
}
