public class Artwork{
private String title;
private int year;
private Artist artist;
public void settitle(String title){
this.title=title;}
public String gettitle(){
return title;}
public void setyear(int year){
this.year=year;}
public int getyear(){
return year;}
public void setartist(Artist artist){
this.artist=artist;}
public Artist getartist(){
return artist;}
public void displayinfo(){
System.out.println(title);
System.out.println(year);
//a1.displayinfo();
}

}