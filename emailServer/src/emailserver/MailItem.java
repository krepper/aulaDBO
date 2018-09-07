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
public class MailItem {
    private int id;
    private String to;
    private List<String> from;
    private String message;
    private String sendDate;
    private MailStatus status;
    
    
}
