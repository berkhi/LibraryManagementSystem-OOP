package com.berkhayta;

import java.util.ArrayList;
import java.util.List;

public class Kutuphane {

    private List<Kitap> kitaplar;
    private List<Uye> uyeler;

    public Kutuphane() {
        kitaplar = new ArrayList<>();
        uyeler = new ArrayList<>();
    }

    public List<Kitap> getKitaplar() {
        return kitaplar;
    }

    public void setKitaplar(List<Kitap> kitaplar) {
        this.kitaplar = kitaplar;
    }

    public List<Uye> getUyeler() {
        return uyeler;
    }

    public void setUyeler(List<Uye> uyeler) {
        this.uyeler = uyeler;
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }
    public void kitaplariListele() {
        kitaplar.forEach(System.out::println);
    }

    public void kitapSil(Kitap kitap) {
        kitaplar.remove(kitap);
    }

    public void uyeEkle(Uye uye) {
        uyeler.add(uye);
    }

    public void uyeSil(Uye uye) {
        uyeler.remove(uye);
    }

    public void uyeleriListele(){
        uyeler.forEach(System.out::println);
    }


}

