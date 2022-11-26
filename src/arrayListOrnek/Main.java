package arrayListOrnek;

import java.util.ArrayList;
import java.util.List;
 
class Main {
  public static void main(String[] args) {
            // ArrayList Oluþturma
        List<String> hayvanlar = new ArrayList<>();
 
        // Add metodu ile öðeler ekleme
        hayvanlar.add("Kaplan");
        hayvanlar.add("Aslan");
        hayvanlar.add("Kedi");
        hayvanlar.add("Köpek");
 
        System.out.println(hayvanlar);
 
        // Belirli index numarasý ile öðeler ekleme
        hayvanlar.add(2, "Fil");
 
        System.out.println(hayvanlar);
  }
}
 