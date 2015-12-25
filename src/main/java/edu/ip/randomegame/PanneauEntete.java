package edu.ip.randomegame;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauEntete extends JPanel{
    public PanneauEntete(){
        this.setPreferredSize(new Dimension(800,100));
        this.setLayout(new FlowLayout());
        
    }
    @Override
    public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File(""));
            g.drawImage(img, 0,0, 800, 100, this);
        }catch(IOException e){
        }
        Font font=new Font("Jokerman",Font.ITALIC,50);
        g.setFont(font);
        g.drawString("ILLY Random Game", 150, 60);
        g.setFont( new  Font("Arial Black",Font.ITALIC,15));
        g.drawString("version 1.0", 350, 90);
        g.drawLine(0, 100, 800, 100);
    }
    
}
