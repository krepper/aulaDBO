/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emailserver;

import java.util.List;

/**
 *
 * @author felipe
 */
public class MailClient {
    private String username;
    private List<MailItem> inbox;
    private List<MailItem> sentBox;
    private List<MailItem> trashBox;
    
    public MailItem abrir(int id){
        return null;
    }
    
    public MailItem escrever(String to, List<String> from, String message, String subject){
        MailItem email = new MailItem(to, from, message, subject); 
        return email;
    }
    
    public void enviar(MailItem email){
        
        
    }
    
}
