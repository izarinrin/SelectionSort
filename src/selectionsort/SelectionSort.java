/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Maylnmgni
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size, h = 0, t = 0, m = 1, min = 0, mindex = 0, sth = 0;

        size = Integer.parseInt(JOptionPane.showInputDialog(null, "How many inputs"));
        int[] arrayni = new int[size];

        for (int i = 0; i < size; i++) {
            int dsp = i + 1;
            arrayni[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "input #" + dsp));
        }
        System.out.println("Selection Sort\ninput " + Arrays.toString(arrayni));

        while (sth < size - 1) {
            //findingmin
            min = arrayni[sth];
            for (int i = sth; i < size; i++) {
                if (min > arrayni[i]) {
                    min = arrayni[i];
                }
            }
            //System.out.println("min " + min);
            //findingmindex
            for (int i = 0; i < size; i++) {
                if (min == arrayni[i]) {
                    mindex = i;
                }
            }
            //System.out.println("mindex " + mindex)murag pokedex XD;
            arrayni[mindex] = arrayni[sth];
            arrayni[sth] = min;
            sth++;
            System.out.println(Arrays.toString(arrayni));
            //System.out.println(Arrays.toString(arrayni));
        }
        System.out.println("output " + Arrays.toString(arrayni));
    }
}
