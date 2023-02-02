package com.xworkz.thing;

public class Image {
	
	public String type;
	public float size;
	public int width;
	public int height;
	public int hzResolution;
	public int veResolution;
	public int bitDepth;
	public String colour;
	public String location;
	public String date;
	
	
	public Image(){
		System.out.println("camera with no-araguement");
	}
	
	public Image(String arg1)
	{
		type=arg1;
	}
	
	public Image(float arg1)
	{
		size=arg1;
	}
	   
	public Image(String arg1,float arg2)
	{
		
		type=arg1;
		size=arg2;
	}
	
	public Image(int arg1,int arg2) 
	{
		
		height=arg1;
		width=arg2;
	}
	
	public Image(int arg1,int arg2,int arg3)
	{
		
		width=arg1;
		height=arg2;
		hzResolution=arg3;
	}
	
	public Image(int arg1,String arg2,int arg3)
	{
		hzResolution=arg1;
		type=arg2;
		veResolution=arg3;
	}
	
	public Image(String arg1,String arg2,String arg3) 
	{
		type=arg1;
		colour=arg2;
		location=arg3;
	}
	
	public Image(String arg1,float arg2,int arg3) 
	{
		date=arg1;
		size=arg2;
		height=arg3;
	}
	
	public Image(float arg1,String arg2) 
	{
		size=arg1;
		type=arg2;
		}
	
	public Image(int arg1,String arg2)
	{
	   height=arg1;
	   type=arg2;
	}
	
	public void show() 
	{
	  System.out.println("type:"+type);
	  System.out.println("size in kb:"+size);
	  System.out.println("width in pixels:"+width);
	  System.out.println("height in pixels:"+height);
	  System.out.println("hzResolution in dpi:"+hzResolution);
	  System.out.println("veResolution in dpi:"+veResolution);
	  System.out.println("bitDepth"+bitDepth);
	  System.out.println("colour:"+colour);
	  System.out.println("location:"+location);
	  System.out.println("date:"+date);
	  
	}
}
