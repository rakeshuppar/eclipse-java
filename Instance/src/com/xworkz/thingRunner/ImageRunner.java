package com.xworkz.thingRunner;
import com.xworkz.thing.Image;

public class ImageRunner {

	public static void main(String[] args) {
		
		
		Image image=new Image();
      	image.show();
		
		Image image1= new Image("jpeg");
	    image1.show();
		
        Image image2=new Image(30.5f);
        image2.show();
        
        Image image3= new Image("jpeg",30.5f);
        image3.show();
        
        Image image4=new Image(540,1080);
        image4.show();
        
        Image image5=new Image(1080,540,96);
        image5.show();
        
        Image image6=new Image(96,"ipeg",96);
        image6.show();
        
        Image image7=new Image("jpeg","Black&white","internal");
        image7.show();
        
        Image image8=new Image("01-02-2023",30.5f);
        image8.show();
        
        Image image9=new Image(540,"jpeg");
        image9.show();
	}

}
