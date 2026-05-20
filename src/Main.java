import java.util.Scanner;
void main() {
    Scanner tarayici= new Scanner(System.in);
    int birlerBasamagi = (int) (Math.floor(Math.random()*10));
    int onlarBasamagi = (int) (Math.floor(Math.random()*10));
    int yuzlerBasamagi = (int) (Math.floor(Math.random()*9))+1;
    int rastgelesayi =  birlerBasamagi+(onlarBasamagi*10)+(yuzlerBasamagi*100);
    int tahmin =0;
    while(true){
        System.out.print("lütfen tahmininizi giriniz..:");
        tahmin= tarayici.nextInt();
        if (tahmin>rastgelesayi){
            System.out.println("yanlış bildiniz lütfen daha küçük bir sayı giriniz");
        } else if (tahmin<rastgelesayi) {
            System.out.println("yanlış bildiniz lütfen daha büyük bir sayı giriniz");

        }else {
            System.out.println("tebrikler doğru bildiniz");
        }
    }






}
