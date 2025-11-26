/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.zabalburu.actividad15.app;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.zabalburu.actividad15.modelo.Prestamo;


public class TablaAmortización {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prestamo prestamo;
        double capital=0, interes=0;
        int periodos=0;
        Date fecha=null;
        GregorianCalendar gc;
        String resp;
        boolean ok;
        DateFormat formateadorFechaCorta = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat formateadorFechaMedia = DateFormat.getDateInstance(DateFormat.MEDIUM);
        NumberFormat formateadorEnteroDecimales = NumberFormat.getInstance();
        NumberFormat formateadorMoneda = NumberFormat.getCurrencyInstance();
        NumberFormat formateadorPorcentaje = NumberFormat.getPercentInstance();
        Number n;
        formateadorPorcentaje.setMinimumFractionDigits(2);
        formateadorPorcentaje.setMaximumFractionDigits(2);
        ok = false;
        do {
            try {
                resp = JOptionPane.showInputDialog("Capital a solicitar");
                n = formateadorEnteroDecimales.parse(resp);
                capital = n.doubleValue();
                ok = true;
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "Debe especificarse un valor numérico con decimales",
                    "Dato erróneo",
                    JOptionPane.ERROR_MESSAGE);
            }
        } while (!ok);
        ok = false;
        do {
            try {
                resp = JOptionPane.showInputDialog("Interés (por ejemplo 1,5%)");
                n = formateadorPorcentaje.parse(resp);
                interes = n.doubleValue();
                ok = true;
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "Debe especificarse un valor numérico con decimales seguido por un % sin espacios",
                    "Dato erróneo",
                    JOptionPane.ERROR_MESSAGE);
            }
        } while (!ok);
        ok = false;
        do {
            try {
                resp = JOptionPane.showInputDialog("Años");
                periodos = Integer.parseInt(resp);
                ok = true;
            } catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(
                    null,
                    "Debe especificarse un valor numérico sin decimales",
                    "Dato erróneo",
                    JOptionPane.ERROR_MESSAGE);
            }
        } while (!ok);
        ok = false;
        do {
            try {
                resp = JOptionPane.showInputDialog("Fecha de Formalización (dd/mm/aaaa)");
                fecha = formateadorFechaCorta.parse(resp);
                ok = true;
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "Debe especificarse una fecha con formato dd/mm/aaaa",
                    "Dato erróneo",
                    JOptionPane.ERROR_MESSAGE);
            }
        } while (!ok);
        prestamo = new Prestamo(capital, interes, periodos, fecha);
        System.out.println("Tabla de Amortización");
        System.out.println("=====================");
        System.out.println("Capital Solicitado : " + formateadorMoneda.format(prestamo.getCantidad()));
        System.out.println("Interés Anual : " + formateadorPorcentaje.format(prestamo.getInteres()));
        System.out.println("Fecha Formalización : " + formateadorFechaMedia.format(prestamo.getFecha()));
        System.out.println("Años : " + prestamo.getAños());
        double pago = prestamo.pago();
        System.out.println("Pago : " + formateadorMoneda.format(pago));
        System.out.println("");
        System.out.println("Periodo\tFecha\t\tCapital\t\tPago\tAmortización\tIntereses");
        gc = new GregorianCalendar();
        gc.setTime(fecha);
        for(int per=1; per<=prestamo.getAños()*12;per++){
            gc.add(Calendar.MONTH,1);
            System.out.print(per + "\t");
            System.out.print(formateadorFechaMedia.format(gc.getTime())+ "\t");
            System.out.print(formateadorMoneda.format(capital) + "\t");
            System.out.print(formateadorMoneda.format(pago) + "\t");            
            double intereses = capital * prestamo.getInteres() / 12;
            double amortizacion = pago - intereses;
            capital -= amortizacion;
            System.out.print(formateadorMoneda.format(amortizacion) + "\t");
            System.out.println(formateadorMoneda.format(intereses));
        }
    }
        
}
