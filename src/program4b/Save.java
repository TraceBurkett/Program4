package program4b;

public class Save 
{


public static void main (String [] args)
{
 
PPMPicture pic1 = new PPMPicture("Pups.ppm");
pic1.setToGrayScale();
pic1.save("PupsGrayscale.ppm");
 
PPMPicture pic2 = new PPMPicture("PupsGrayscale.ppm");
pic2.setToNegative();
pic2.save("PupsNegitive.ppm");
 
PPMPicture pic3 = new PPMPicture("PupsNegitive.ppm");
pic3.setArtwork();
pic3.save("PupsArt.ppm"); 
}
}