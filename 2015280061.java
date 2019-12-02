package odev2;


import java.util.Scanner;
  
    public class RomanNumerals
    {
        public static void main(String args[]){
            Scanner in = new Scanner(System.in);
            System.out.print("4000 den küçük sayý deðeri girin: ");        
            System.out.println("romen rakamlarýyla gösterim þekli:" + toRoman(in.nextInt()));
            for (int i = 1; i<=3999; i++){
                System.out.println(i +" === "+ toRoman(i));
            }
        }
        public static String toRoman(int i){
            String output = "";
            int basamaklar = i%10;
            int onlar = (i%100)/10;
            int yuzler = (i%1000)/100;
            int binler = (i%10000)/1000;
            return (romanLogic(binler, "M","","")+
                    romanLogic(yuzler,"C","D","M")+
                    romanLogic(onlar,"X","L","C")+
                    romanLogic(basamaklar,"I","V","X"));
        }
        public static String romanLogic(int i, String birler, String besler, String onlar){
            String sonuc = "";
            if (i == 0){
                return sonuc;
            } else {
                if ((i>=4)&&(i<=8)){                
                    sonuc += besler;
                }
                if (i==9){
                    sonuc += onlar;
                }
                if(i%5 < 4){
                    while(i%5 > 0){
                        sonuc += birler;
                        i--;
                    }
                }
                if(i%5 == 4){
                    sonuc = birler + sonuc;
                }
            }
            return sonuc;
        }    
    }
    
    //Kaynak: Algoritmasýnda dayým yardým etti ve bu siteden yardým aldým.
    //stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java
    