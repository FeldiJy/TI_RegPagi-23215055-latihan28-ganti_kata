import java.util.Scanner;

public class ganti_kata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====");
        
        // Input sentence
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Input word to replace
        System.out.print("Ganti Kata: ");
        String gantiKata = scanner.nextLine();
        
        // Input replacement word
        System.out.print("Menjadi Kata: ");
        String menjadiKata = scanner.nextLine();
        
        // Display results
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        
        // Replace the specified word
        String kalimatBaru = kalimat.replace(gantiKata, menjadiKata);
        
        System.out.println("Kalimat baru : " + kalimatBaru);
    }
}
