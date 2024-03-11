package com.berkhayta;

public class Main {


    public static void main(String[] args) {
        mockData();
        userPage();
    }

    public static void userPage() {

        while (true) {
            System.out.println("1-Register");
            System.out.println("2-Login");
            System.out.println("3-Kütüphane Durumu");

            System.out.println("0-Çıkış");

            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    UyeServices.register();
                    break;
                case 2:
                    Uye loggedInCustomer = UyeServices.login();
                    if (loggedInCustomer != null) {
                        userApplication(loggedInCustomer);
                    }
                    break;
                case 3:
                    libraryManagement();
                    break;
                case 0 :
                    System.exit(0);
                    break;
            }
        }

    }
    public static void userApplication(Uye uye) {
        System.out.println("Hoşgeldiniz " + uye.getKullaniciAdi());

        while (true) {
            System.out.println("1- Kitap Kirala");
            System.out.println("2- Kiraladığım kitabları görüntüle ");
            System.out.println("3- Kitabı iade et ");
            System.out.println("4- Logout ");

            int secim = InputUtil.getIntegerValue("Seçim girin");

            switch (secim) {
                case 1:
                    UyeServices.rentBook(uye);
                    break;
                case 2:
                    UyeServices.getAllRentedBook(uye);
                    break;
                case 3:
                    UyeServices.returnBook(uye);
                    break;
                case 4:
                    userPage();
                    break;

            }
        }
    }

    public static void libraryManagement(){
        while (true) {
            System.out.println("1-Kitabın Durumunu Güncelle");
            System.out.println("2-Ödünç Alınabilir Kitapları Görüntüle");
            System.out.println("3-Ödünç Alınmış Kitapları Görüntüle");
            System.out.println("4-Mevcut Olmayan Kitapları Görüntüle");
            System.out.println("5-Kütüphanedeki Bütün Kitapları Görüntüle");
            System.out.println("0-Ana Menu");
            int secim = InputUtil.getIntegerValue("Seçim girin:");
            switch (secim) {
                case 1:
                    KitapServices.updateStatus();
                    break;
                case 2:
                    KitapServices.listAllRentableBooks();
                    break;
                case 3:
                    KitapServices.listRentedBooks();
                    break;
                case 4:
                    KitapServices.listAllRunOutBooks();
                case 5:
                    KitapServices.listAllBooks();
                    break;
                case 0:
                    userPage();
                    break;
            }
        }
    }

    private static void mockData() {
        Kitap kitap1 = new KitapBilim("1234567890", "Java Programlama", "Ahmet Yılmaz", 2023, "Bilim");
        Kitap kitap2 = new KitapRoman("2313322452", "Python Programlama", "Ayşe Demir", 2022, "Roman");
        Kitap kitap3 = new KitapTarih("2341234123", "iOS Programlama", "Cenk Cenk", 2024, "Tarih");
        DataBase.kutuphane.getKitaplar().add(kitap1);
        DataBase.kutuphane.getKitaplar().add(kitap2);
        DataBase.kutuphane.getKitaplar().add(kitap3);
        DataBase.kutuphane.kitaplariListele();

        Uye uye1 = new Uye("Berk","berkk","123");
        DataBase.kutuphane.getUyeler().add(uye1);
        DataBase.kutuphane.uyeleriListele();

    }
}