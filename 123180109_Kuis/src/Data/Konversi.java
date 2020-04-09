package Data;

public class Konversi extends Tampil{
    public String Predikat() {
        //pengendalian kelas predikat nilai
        if (rata >=80 && rata <=100) return "A";
        else if(rata >= 75 && rata < 80) return "B+";
        else if(rata >= 65 && rata < 75) return "B";
        else if(rata >= 60 && rata < 65) return "C+";
        else if(rata >= 50 && rata < 60) return "C";
        else if(rata >= 20 && rata < 50) return "D";
        else if(rata >= 0 && rata < 20) return "E";
        else return "Error";
    }
}
