package com.xworkz.stateRunner;
import com.xworkz.state.Film;

public class FilmRunner {

	

	public static void main(String[] args) {
	
    Film ref =new Film();
	System.out.println("moviename:"+ref.movieName);
	System.out.println("hero:"+ref.hero);
	System.out.println("heroine:"+ref.heroine);
	System.out.println("numofSongs:"+ref.numofSongs);
	System.out.println("budget:"+ref.budget);

    ref.movieName="Kranti";
    System.out.println("moviename:"+ref.movieName);
     
    ref.hero ="Darshan";
 	System.out.println("hero:"+ref.hero);
 	
 	ref.heroine="RachitaRam";
 	System.out.println("heroine:"+ref.heroine);
 	
 	ref.numofSongs=5;
 	System.out.println("numofSongs:"+ref.numofSongs);
 	
 	ref.budget=500000.0d;
 	System.out.println("budget:"+ref.budget);
 	
     
	}

}
