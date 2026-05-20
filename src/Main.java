import java.util.Scanner;
void main() {
    Scanner tarayici= new Scanner(System.in);
    int birlerBasamagi = (int) (Math.floor(Math.random()*10));
    int onlarBasamagi = (int) (Math.floor(Math.random()*10));
    int yuzlerBasamagi = (int) (Math.floor(Math.random()*9))+1;
    int rastgelesayi =  birlerBasamagi+(onlarBasamagi*10)+(yuzlerBasamagi*100);
    int tahmin =0;
    int toplamtahmin=0;
    while(true){
        System.out.print("lütfen tahmininizi giriniz..:");

        tahmin= tarayici.nextInt();
        toplamtahmin++;
        if (tahmin>rastgelesayi){
            System.out.println("yanlış bildiniz lütfen daha küçük bir sayı giriniz");
        } else if (tahmin<rastgelesayi) {
            System.out.println("yanlış bildiniz lütfen daha büyük bir sayı giriniz");

        }else {
            System.out.println("tebrikler doğru bildiniz");
            break;
        }
    }
    int puan= 100-(toplamtahmin-1);
    System.out.println("tebrikler oyunu tamamladınız puanınız:"+puan);
}
