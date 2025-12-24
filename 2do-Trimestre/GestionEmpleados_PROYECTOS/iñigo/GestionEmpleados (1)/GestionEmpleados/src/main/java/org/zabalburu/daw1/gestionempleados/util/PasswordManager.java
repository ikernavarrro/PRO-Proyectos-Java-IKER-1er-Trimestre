/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.gestionempleados.util;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author ichueca
 */
public class PasswordManager {
    
    public String getHash(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    
    public boolean checkPassword(String password, String hash){
        return BCrypt.checkpw(password, hash);
    }
    
    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager();
        String hash = pm.getHash("12345");
        System.out.println(hash);
        String hash2 =pm.getHash("12345");
        System.out.println(hash2);
        System.out.println(pm.checkPassword("12345", hash));
        System.out.println(pm.checkPassword("12345", hash2));
        System.out.println(pm.checkPassword("123451", hash));
    }
}
