package com.berkhayta;

public class UyeServices {
    public static void register() {
        String nameSurname = InputUtil.getStringValue("İsim ve Soyisim girin");
        String userName = InputUtil.getStringValue("Kullanıcı adınızı girin");
        String password = InputUtil.getStringValue("Şifre girin");

        Uye uye = new Uye(nameSurname, userName, password);
        DataBase.kutuphane.getUyeler().add(uye);

        System.out.println("Kayı başarılı bir şekilde gerçekleşti");
    }

    public static Uye login() {
        String username = InputUtil.getStringValue("Kullanıcı adını girin: ");
        String password = InputUtil.getStringValue("Şifre girin: ");

        for (Uye uye : DataBase.kutuphane.getUyeler()) {
            if (username.equals(uye.getKullaniciAdi()) && password.equals(uye.getSifre())) {
                return uye;
            }
        }
        System.out.println("Kullanıcı adı veya şifre hatalı!");
        return null;
    }

    public static void rentBook(Uye uye) {
        getAllBooks();
        String isbn = InputUtil.getStringValue("Hanig kitabı kiralikcasın : ");
        Kitap kitap = findById(isbn);

        if (kitap != null) { //kullanıcıdan aldığımız isbn kodunu findById metodu ile kontrol ediyoruz, eşleşen veri varsa koşul sağlanmış oluyor
            if (kitap.getDurum() == Durum.OduncAlinabilir) {
                uye.getOduncAlinanKitaplar().add(kitap);
                kitap.setDurum(Durum.OduncAlinmis);

                System.out.println(kitap.getBaslik() + " Kitabını başarıyla kiraladınız");
            } else {
                System.out.println("Kitabı kiralayamadınız. ");
            }
        }
    }
    public static Kitap findById(String isbn) {
        for (Kitap kitap : DataBase.kutuphane.getKitaplar()) { // kitap listesinin içindeki her bir elemanı, Kitap sınıfından türetilmiş bir değişkene atıyoruz
            if (kitap.getIsbn().equals(isbn)) { // eşleşen veri bulunana kadar kontrol ediyoruz.
                return kitap;
            }
        }
        System.out.println("Kitap bulunamadı");
        return null;
    }

    public static void getAllRentedBook(Uye uye) {
        uye.getOduncAlinanKitaplar().forEach(kitap -> System.out.println(kitap.toString()));
    }

    public static void getAllBooks() {
        for (Kitap kitap : DataBase.kutuphane.getKitaplar()) {
            if (kitap.getDurum() == Durum.OduncAlinabilir) {
                System.out.println(kitap);
            }
        }
    }

    public static void returnBook(Uye uye) {
        getAllRentedBook(uye);
        String isbn = InputUtil.getStringValue("Hangi kitabı iade edeceksin? ");
        Kitap kitap = findById(isbn);

        if (kitap != null) {
            if (uye.getOduncAlinanKitaplar().remove(kitap)) {
                System.out.println(kitap.getBaslik()+" Kitabını iade ettiniz teşekkürler");
                kitap.setDurum(Durum.OduncAlinabilir);
            } else {
                System.out.println("iade işlemi başarısız");
            }
        }
    }
}
