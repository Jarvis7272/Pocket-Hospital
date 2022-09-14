/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pocket.hospital;

import javax.swing.JOptionPane;

/**
 *
 * @author aahir
 */
public class PocketHospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Loading loading = new Loading();
        loading.setVisible(true);
        

        
        
        try{
            for(int i=0; i<=100; i++){
                Thread.sleep(100);
                loading.loadvalue.setText(i +"%");
                
                if(i==10){
                loading.loadlabel.setText("Turning On Modules.....");
            }
            
            if(i==30){
                loading.loadlabel.setText("Turned On Modules Succesfully.....");
            }
            
            if(i==50){
                loading.loadlabel.setText("Connecting Database.....");
            }
            
            if(i==70){
                loading.loadlabel.setText("Database Connected Succesfully.....");
            }
            
            if(i==90){
                loading.loadlabel.setText("Loading Software.....");
            }
            
            if(i==100){
                loading.setVisible(false);
                LoginAs loginas = new LoginAs();
                loginas.setVisible(true);
                
               
            }
            
            
            loading.load.setValue(i);
            }
        }
        
        catch(InterruptedException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
