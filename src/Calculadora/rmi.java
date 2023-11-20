/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author dualbert
 */
public class rmi extends UnicastRemoteObject implements Calculadora{
    public rmi() throws RemoteException{
        int a,b;
    }
    public int div(int a, int b) throws RemoteException{
        if(a==0){
            return 0;
        }
        else{
            return a/b;
        }
        
    }
    public int mul(int a, int b) throws RemoteException{
        return a*b;
    }
    public int sum(int a, int b) throws RemoteException{
        return a+b;
    }
    public int res(int a, int b) throws RemoteException{
        return a-b;
    }
    
}
