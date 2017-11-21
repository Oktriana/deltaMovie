/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaplayertest;

/**
 *
 * @author LPG
 */
public class Movie {
   private int id;
   private String _title;
   private String _year;
   private String genre_1;
   private String genre_2;
   private String genre_3;
   private String _actor;
   private String _director;
   private String _synopsis;
   private String _cover;
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public String getYear() {
        return _year;
    }

    public void setYear(String _year) {
        this._year = _year;
    }

    public String getGenre_1() {
        return genre_1;
    }

    public void setGenre_1(String genre_1) {
        this.genre_1 = genre_1;
    }

    public String getGenre_2() {
        return genre_2;
    }

    public void setGenre_2(String genre_2) {
        this.genre_2 = genre_2;
    }

    public String getGenre_3() {
        return genre_3;
    }

    public void setGenre_3(String genre_3) {
        this.genre_3 = genre_3;
    }

    public String getActor() {
        return _actor;
    }

    public void setActor(String _actor) {
        this._actor = _actor;
    }

    public String getDirector() {
        return _director;
    }

    public void setDirector(String _director) {
        this._director = _director;
    }

    public String getSynopsis() {
        return _synopsis;
    }

    public void setSynopsis(String _synopsis) {
        this._synopsis = _synopsis;
    }

    public String getCover() {
        return _cover;
    }

    public void setCover(String _cover) {
        this._cover = _cover;
    }
}
