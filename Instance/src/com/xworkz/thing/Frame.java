package com.xworkz.thing;

public class Frame {
	
	public String type;
	public String material;
	public String shape;
	public float width;
	public float height;
	public boolean coloured;
	public int cost;
	public String quality;
	public String style;
	public boolean border;
	public String design; 
	public String typesGlass;
	

  public Frame (String type,String material,String shape,float width,float height,boolean coloured,int cost,String quality,String style,boolean border,String design,String typesGlass) 
	{
	this.type=type;	
	this.material=material;
	this.shape=shape;
	this.width=width;
	this.height=height;
	this.coloured=coloured;
	this.cost=cost;
	this.quality=quality;
	this.style=style;
	this.border=border;
	this.design=design;
	this.typesGlass=typesGlass;	
	}
  
  public void display() {
	  
	  System.out.println("type:"+this.type);
	  System.out.println("material:"+this.material);
	  System.out.println("shape:"+shape);
	  System.out.println("width:"+this.width);
	  System.out.println("height:"+this.height);
	  System.out.println("coloured:"+this.coloured);
	  System.out.println("cost:"+this.cost);
	  System.out.println("quality:"+this.quality);
	  System.out.println("style:"+this.style);
	  System.out.println("border:"+this.border);
	  System.out.println("design:"+this.design);
	  System.out.println("typesGlass:"+this.typesGlass);
  }
  
}
