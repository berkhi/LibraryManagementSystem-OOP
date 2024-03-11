package com.berkhayta;

public class KitapRoman extends Kitap {

    private String tur;

    public KitapRoman(String isbn, String baslik, String yazar, int yayinYili, String tur) {
        super(isbn, baslik, yazar, yayinYili, tur);
        this.tur = "Roman";
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

}
