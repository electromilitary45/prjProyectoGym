/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjproyectogym;

import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class clsInfoGym {

    //----------Se crea la clase pública para la informaciónd el gimnacio--------------//
    public clsInfoGym() {
    }

    //--------Método Estadísticas Clientes--------//
    public static void estadisticasClientes() {
        clsCliente Ccliente = new clsCliente();
        JOptionPane.showMessageDialog(null, "La cantidad total de clientes es: " + Ccliente.contCC
                + "\n La cantidad total de clientes de sexo Masculino: " + Ccliente.contHombres
                + "\n La cantidad total de clientes de sexo Femenino: " + Ccliente.contMujeres
                + "\n La cantidad total de clientes de nacionales es: " + Ccliente.contNacionales
                + "\n La cantidad total de clientes de nacionales es: " + Ccliente.contExtranjeros
                + "\n La cantidad total de clientes que agregaron su estatura: " + Ccliente.contEstatura
                + "\n La cantidad total de clientes que agregaron su peso: " + Ccliente.contPeso
                + "\n La cantidad total de clientes con el Somatipo de Ectomorfo es : " + Ccliente.contEcto
                + "\n La cantidad total de clientes con el Somatipo de Mesomorfo es : " + Ccliente.contMeso
                + "\n La cantidad total de clientes con el Somatipo de Endomorfo es : " + Ccliente.contEndo
                + "\n La cantidad total de clientes desean subir de peso es : " + Ccliente.contSubir
                + "\n La cantidad total de clientes desean bajar de peso es : " + Ccliente.contBajar
                + "\n La cantidad total de clientes desean mantener el peso es : " + Ccliente.contMantener
                + "\n La cantidad total de clientes que eligieron pase basico: " + Ccliente.contBasico
                + "\n La cantidad total de clientes que eligieron pase Max: " + Ccliente.contMax
                + "\n La cantidad total de clientes que eligieron pase Ultra: " + Ccliente.contUltra);
    }
}
