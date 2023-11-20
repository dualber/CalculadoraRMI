/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora c = (Calculadora) Naming.lookup("//localhost/Calculadora");
            while (true) {
                int menu = Integer.parseInt(JOptionPane.showInputDialog("Calculadora RMI\n seleccione la opcion \n"
                        + "ingrese (1)..Dividir\n"
                        + "ingrese (2)..Multiplicar\n"
                        + "ingrese (3)..suma\n"
                        + "ingrese (4)..Restar\n"
                        + "ingrese Boton cancelar para salir"));
                int a = Integer.parseInt(JOptionPane.showInputDialog("ingresa el primer numero"));
                int b = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero"));

                switch (menu) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "la Divicion de los dos numeros es:" + c.div(a, b));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "la multiplicacion de los dos numeros es:" + c.mul(a, b));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "la suma  de los dos numeros es:" + c.sum(a, b));
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "la resta de los dos numeros es:" + c.res(a, b));
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null, "la opcion no esta disponible| saliendo del sistema...");
                }
            }
        } catch (Exception e) {
            System.out.println("servidor no conectado");
        }
    }
}
