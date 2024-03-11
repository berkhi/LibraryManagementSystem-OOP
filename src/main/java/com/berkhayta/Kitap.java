package com.berkhayta;

public abstract class Kitap {

    private String isbn;
    private String baslik;
    private String yazar;
    private int yayinYili;
    private String tur;
    private Durum durum;

    public Kitap(String isbn, String baslik, String yazar, int yayinYili, String tur) {
        this.isbn = isbn;
        this.baslik = baslik;
        this.yazar = yazar;
        this.yayinYili = yayinYili;
        this.tur = tur;
        this.durum = Durum.OduncAlinabilir;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public Durum getDurum() {
        return durum;
    }

    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "isbn='" + isbn + '\'' +
                ", baslik='" + baslik + '\'' +
                ", yazar='" + yazar + '\'' +
                ", yayinYili=" + yayinYili +
                ", tur='" + tur + '\'' +
                ", durum=" + durum +
                '}';
    }
}
