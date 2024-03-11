package com.berkhayta;

public class KitapServices {
    public static void listAllBooks() {
        DataBase.kutuphane.getKitaplar().forEach(System.out::println);
    }
    public static void listRentedBooks(){
        for (Kitap kitap: DataBase.kutuphane.getKitaplar()){
            if(kitap.getDurum() == Durum.OduncAlinmis){
                System.out.println(kitap);
            }
        }
    }
    public static void listAllRentableBooks(){
        for (Kitap kitap: DataBase.kutuphane.getKitaplar()){
            if(kitap.getDurum() == Durum.OduncAlinabilir){
                System.out.println(kitap);
            }
        }
    }
    public static void listAllRunOutBooks(){
        for (Kitap kitap: DataBase.kutuphane.getKitaplar()){
            if(kitap.getDurum() == Durum.MevcutDegil){
                System.out.println(kitap);
            }
        }
    }
    public static Durum updateStatus() {
        listAllBooks();
        String kitapIsbn = InputUtil.getStringValue("Güncellenecek Kitabın ISBN Girin:");
        for (Kitap kitap : DataBase.kutuphane.getKitaplar()){
            if (kitap.getIsbn().equals(kitapIsbn)){
                System.out.println("Kitap Durumunu Seçiniz:");
                System.out.println("1-Odunc Alinabilir");
                System.out.println("2-Odunc Alinmis");
                System.out.println("3-Mevcut Değil");
                int statusChoice = InputUtil.getIntegerValue("Seçiminizi yapınız:");
                switch (statusChoice) {
                    case 1:
                        kitap.setDurum(Durum.OduncAlinabilir);
                        break;
                    case 2:
                        kitap.setDurum(Durum.OduncAlinmis);
                        break;
                    case 3:
                        kitap.setDurum(Durum.MevcutDegil);
                        break;
                    default:
                        throw new IllegalArgumentException("Geçersiz seçim: " + statusChoice);
                }
                break;
            }
            else{
                System.out.println("Kitap Bulunamadı!");
                break;
            }
        }
        return null;
    }
}
