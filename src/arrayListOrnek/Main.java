package arrayListOrnek;

import java.util.ArrayList;
import java.util.List;
 
class Main {
  public static void main(String[] args) {
            // ArrayList Olu�turma
        List<String> hayvanlar = new ArrayList<>();
 
        // Add metodu ile ��eler ekleme
        hayvanlar.add("Kaplan");
        hayvanlar.add("Aslan");
        hayvanlar.add("Kedi");
        hayvanlar.add("K�pek");
 
        System.out.println(hayvanlar);
 
        // Belirli index numaras� ile ��eler ekleme
        hayvanlar.add(2, "Fil");
 
        System.out.println(hayvanlar);
  }
}
 