/* Vücut Kitle İndeksi(vki) = vücut ağırlığı (kg) / boy uzunluğunun karesi (m)

-KATEGORİ-                  -VKİ ARALIĞI-
Zayıf                      18.5 den küçük
Normal                     18.5-25(Dahil değil)
Kilolu-riskli              25-28(Dahil değil)
Kilolu-oldukça obez        28-30(Dahil değil)
Kilolu-aşırı obez          30 ve daha fazla

Kullanıcıdan vücut ağırlığı, boy istenecek. VKİ hesaplanarak ekrana yazdırılacak. Ve kullanıcının kategorisi kullanıcıya gösterilecek.
*/

import javax.swing.JOptionPane;
//import java.lang.Math;
/*Kullanacağımız pow math sınıfı içerisindedir. Math sınıfı ise java.lang paketinin içinde bulunmaktadır.Bu sebeple default olarak import edilmiş durumdadır.Bu nedenle tekrar dahil etmedim. Etme durumunda ide de gereksiz olduğu için onu renksiz gösterdi.*/


public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Vücut Kitle İndeksi Hesaplama Programımıza Hoş Geldiniz.","Hoş geldin Mesajı !", JOptionPane.PLAIN_MESSAGE);

        String girdiKilo;
        String girdiBoy;
        String kategori;


        double kilo;
        double boy;
        double vki;

        girdiKilo = JOptionPane.showInputDialog("Kilonuzu kg cinsinden giriniz:");
        kilo = Double.parseDouble(girdiKilo);


        girdiBoy = JOptionPane.showInputDialog("Boyunuzu m cinsinden giriniz:");
        boy = Double.parseDouble(girdiBoy);


        vki = kilo / Math.pow(boy,2); // üs alma metodu yerine (boy * boy) da kullanabilirdik. Sonuç değişmez.

        if(vki<18.5)
        {
            kategori = "Zayıf";
            JOptionPane.showMessageDialog(null, "Girdiğiniz verilere göre vücut kitle indexiniz: "+vki+" \nVücut kitle indeksinize göre siz : "+kategori+"'sınız","Sonuç Mesajı!",JOptionPane.PLAIN_MESSAGE);

        }
        else if(18.5 <= vki && vki <25)
        {
            kategori = "Normal";
            JOptionPane.showMessageDialog(null, "Girdiğiniz verilere göre vücut kitle indexiniz: "+vki+" \nVücut kitle indeksinize göre siz : "+kategori+"'sınız","Sonuç Mesajı!",JOptionPane.PLAIN_MESSAGE);
        }

        else if(25<=vki && vki<28)
        {
            kategori = "Kilolu-riskli";
            JOptionPane.showMessageDialog(null, "Girdiğiniz verilere göre vücut kitle indexiniz: "+vki+" \nVücut kitle indeksinize göre siz : "+kategori+"'sınız","Sonuç Mesajı!",JOptionPane.PLAIN_MESSAGE);
        }

        else if(28<=vki && vki<30)
        {
            kategori = "Kilolu-oldukça obez";
            JOptionPane.showMessageDialog(null, "Girdiğiniz verilere göre vücut kitle indexiniz: "+vki+" \nVücut kitle indeksinize göre siz : "+kategori+"'sınız","Sonuç Mesajı!",JOptionPane.PLAIN_MESSAGE);
        }

        else if(vki>=30)
        {
            kategori = "Kilolu-aşırı obez";
            JOptionPane.showMessageDialog(null, "Girdiğiniz verilere göre vücut kitle indexiniz: "+vki+" \nVücut kitle indeksinize göre siz : "+kategori+"'sınız","Sonuç Mesajı!",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Hatalı bir giriş yaptınız!","Sonuç Mesajı!",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
