/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.aragon.partes.Monitor;
import ico.fes.aragon.partes.Mouse;
import ico.fes.aragon.partes.Teclado;
import ico.fes.aragon.partes.CPU;
        
/**
 *
 * @author Admin
 */
public class Computadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CPU _cpu = new CPU ("Dell", "Optiplex Core I5 (4ta Gen)" , 7200);
        Monitor _monitor = new Monitor ("HP","24fwa de 24", 24);
        Mouse _mouse = new Mouse ("Steren", " 800/ 1200/1600 DPI", " Inalámabrico");
        Teclado _teclado = new Teclado ("Logitech", " Via bluetooth (K380-920-009595)", 85,  1 );
        System.out.println("Tu CPU es de la marca:" + _cpu.getMarca()+ " Su modelo es:" + _cpu.getModelo() + " La velocidad de procesamiento con la que cuenta tu CPU es de:" + _cpu.getVelocidadProcesador());
        System.out.println("Tu monitor es de la marca:" + _monitor.getMarca()+ " Su modelo es:" + _monitor.getModelo() + " Cuenta con(pulgadas):" + _monitor.getPulgadas());
        System.out.println("Tu mouse es de la marca:" + _mouse.getMarca()+ " Su modelo es:" + _mouse.getModelo() + " El tipo de tu mouse es:" + _mouse.getTipo());
        System.out.println("Tu teclado es de la marca:" + _teclado.getMarca()+ " Su modelo es:" + _teclado.getModelo() + " El teclado cuenta con este n.de teclas:" + _teclado.getNumeroDeTeclas()+ " Su valor de multimedia:" + _teclado.getMultimedia());
        
    }
    
} 
