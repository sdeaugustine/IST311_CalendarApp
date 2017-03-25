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
public class LoginCntl {
    
    private UserList theUserList;
    private  LoginUI theLoginUI;
    private NavigationCntl theNavigationCntl;
    
    public LoginCntl(){
        theUserList = new UserList();
       
        theLoginUI = new LoginUI(this);
        theLoginUI.setLocationRelativeTo(null);
        theLoginUI.setVisible(true);
    }
    
    public void requestNavigationCntl(){
        theLoginUI.setVisible(false);
        theNavigationCntl = new NavigationCntl();
    }
    
    public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck){
        boolean authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);
        return authenticated;
    }
     
}
