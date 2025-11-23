/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasearrays;

/**
 *
 * @author Inigo
 */
public class MiClaseArrays {
    public static void ordenarAsc(MIComparable[] elementos){
        for(int i=0;i<elementos.length -1; i++){
            for(int j=0; j<elementos.length -i -1;j++){
                if (elementos[j].comparar(elementos[j+1])>0){
                    MIComparable temp = elementos[j];
                    elementos[j] = elementos[j+1];
                    elementos[j+1] = temp;
                }
            }
        }
    }
    public static void ordenarDesc(MIComparable[] elementos){
        for(int i=0;i<elementos.length -1; i++){
            for(int j=0; j<elementos.length -i -1;j++){
                if (elementos[j].comparar(elementos[j+1])<0){
                    MIComparable temp = elementos[j];
                    elementos[j] = elementos[j+1];
                    elementos[j+1] = temp;
                }
            }
        }
    }
}
