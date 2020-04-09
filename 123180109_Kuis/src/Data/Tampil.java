package Data;

import javax.swing.*;
import java.awt.event.*;

public class Tampil extends GUI {
    //deklarasi variabel
    static double rata;

    public void TampilForm() {
        //membuat tanggapan dari button
        bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengecek exception
                try {
                    String isiNama = tNama.getText();
                    int isiNim = Integer.parseInt(tNim.getText());
                    String isiMk1 = tMk1.getText();
                    int isiNil1 = Integer.parseInt(tNil1.getText());
                    String isiMk2 = tMk1.getText();
                    int isiNil2 = Integer.parseInt(tNil2.getText());

                    System.out.println("NIM             : " + isiNim);
                    System.out.println("Nama            : " + isiNama);
                    System.out.println("Mata Kuliah 1   : " + isiMk1);
                    System.out.println("Nilai 1         : " + isiNil1);
                    System.out.println("Mata Kuliah 2   : " + isiMk2);
                    System.out.println("Nilai 2         : " + isiNil2);

                    rata = (isiNil1 + isiNil2) / 2.0;
                    System.out.println("Nilai Rata-Rata : " + rata);

                    Konversi k = new Konversi();
                    System.out.println("Nilai Huruf     : " + k.Predikat());

                } catch (NumberFormatException ex) { //exception handling ketika format tidak sesuai
                    JOptionPane.showMessageDialog(rootPane, "Tidak boleh selain angka");
                }
            }
        });
    }
}