package com.freedos.sexeducation.Model;

public class ModelForum {
    Integer langGambar;
    String langNama;

    public  ModelForum(Integer langGambar, String langNama){
        this.langGambar = langGambar;
        this.langNama = langNama;
    }

    public Integer getLangGambar() {
        return langGambar;
    }

    public String getLangNama() {
        return langNama;
    }
}
