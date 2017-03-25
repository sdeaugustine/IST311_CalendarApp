/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalendar;

/**
 *
 * @author zifengxia
 */
public class NavigationCntl {
        
    private MainMenuUI theMainMenuUI = null;
  
    public NavigationCntl(){
        System.out.println("Made it to NavigationCntl");
        theMainMenuUI = new MainMenuUI(this);
        theMainMenuUI.setLocationRelativeTo(null);
        theMainMenuUI.setVisible(true);
    }
    
    public void getMediaCntl(){
        theMainMenuUI.setVisible(false);
     
    }
    
    public void getNavigationCntl(){
        if(theMainMenuUI == null){
            theMainMenuUI = new MainMenuUI(this);
            theMainMenuUI.setLocationRelativeTo(null);
            theMainMenuUI.setVisible(true);
        }else{
            theMainMenuUI.setVisible(true);
        }
    }
    

    
}
