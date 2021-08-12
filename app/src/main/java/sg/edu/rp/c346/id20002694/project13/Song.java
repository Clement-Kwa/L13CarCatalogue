package sg.edu.rp.c346.id20002694.project13;

import java.io.Serializable;

public class Song implements Serializable {

    private 	int id;
    private 	String name;
    private String desc;
    private int year;
    private int stars;

    public Song( String name, String desc, int year,  int stars) {
        this.desc = desc;
        this.name = name;
        this.year = year;
        this.id = stars;
    }
    public Song(  int id, String name, String desc, int year,  int stars) {
        this.desc = desc;
        this.name = name;
        this.year = year;
        this.id = id;
        this.stars=stars;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return name;
    }

    public String getSingers() {
        return desc;
    }

    public int getYear() {
        return year;
    }

    public int getStars() {
        return stars;
    }

    public void setSongContent(String name, String desc, int year,  int stars) {
        this.desc = desc;
        this.name = name;
        this.year = year;
        this.id = id;
        this.stars = stars;
    }


    @Override
    public String toString() {
        String starsString="";
        if(stars==1){
            starsString="*";
        }
        else if(stars==2){
            starsString="* *";
        }
        else if(stars==3){
            starsString="* * *";
        }
        else if(stars==4){
            starsString="* * * *";
        }
        else if(stars==5){
            starsString="* * * * *";
        }
        return starsString;  }



}
