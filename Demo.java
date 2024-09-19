public class Demo{
public static void main(String a[]){
Artist a1 = new Artist();
Artwork ar = new Artwork();
a1.setartistname("Ali");
ar.setyear(2022);
a1.displayinfo();
ar.settitle("Picture");
ar.displayinfo();
Artist a2 = new Artist();
Artwork ar1= new Artwork();
a2.setartistname("Ahmad");
ar1.setyear(2021);
a2.displayinfo();
ar1.settitle("Image");
ar1.displayinfo();
} 
}