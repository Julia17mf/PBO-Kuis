package Data;

import javax.swing.*;

public class GUI extends JFrame {
    //deklarasi variabel
    static JLabel lNim, lNama, lMk1, lMk2, lNil1, lNil2;
    static JTextField tNim, tNama, tMk1, tMk2, tNil1, tNil2;
    static JButton bSubmit;

    public void Data() {
        //memberi judul GUI
        setTitle("Hitung Nilai");

        //membuat komponen JFrame
        lNim    = new JLabel("NIM");
        lNama   = new JLabel("Nama");
        lMk1    = new JLabel("Mata Kuliah 1");
        lMk2    = new JLabel("Mata Kuliah 2");
        lNil1   = new JLabel("Nilai 1");
        lNil2   = new JLabel("Nilai 2");

        tNim    = new JTextField();
        tNama   = new JTextField();
        tMk1    = new JTextField();
        tMk2    = new JTextField();
        tNil1   = new JTextField();
        tNil2   = new JTextField();

        bSubmit = new JButton("Convert");

        setLayout(null);

        //menambahkan komponen
        add(lNim);
        add(lNama);
        add(lMk1);
        add(lMk2);
        add(lNil1);
        add(lNil2);

        add(tNim);
        add(tNama);
        add(tMk1);
        add(tMk2);
        add(tNil1);
        add(tNil2);

        add(bSubmit);

        //menampilkan komponen dengan ukuran yang telah diatur
        lNim.setBounds(20, 20, 80, 20);
        lNama.setBounds(20, 50, 80, 20);
        lMk1.setBounds(20, 80, 80, 20);
        lNil1.setBounds(20, 110, 80, 20);
        lMk2.setBounds(20, 140, 80, 20);
        lNil2.setBounds(20, 170, 80, 20);

        tNim.setBounds(150, 20, 300, 20);
        tNama.setBounds(150, 50, 300, 20);
        tMk1.setBounds(150, 80, 300, 20);
        tNil1.setBounds(150, 110, 300, 20);
        tMk2.setBounds(150, 140, 300, 20);
        tNil2.setBounds(150, 170, 300, 20);

        bSubmit.setBounds(200, 230, 80, 20);

        //mengatur ukuran window GUI
        setSize(500, 300);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
