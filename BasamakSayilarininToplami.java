import java.util.Scanner;

public class BasamakSayilarininToplami {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Basamakları Toplanacak Sayıyı Giriniz:  ");
        String sayilar = input.next();

        int toplam = 0;
        for(int i = 0; i<sayilar.length(); i++){

            try {
                toplam += Integer.parseInt(String.valueOf(sayilar.charAt(i)));
            }catch (Exception e){
            // Basamakta eğer rakam olmayan birşey var ise program durmasın devam etsin
            }
        }
        System.out.println(toplam);
    }
}
