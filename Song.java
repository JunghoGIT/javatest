package chap07_practice;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	Song(String title,String artist,int year,String country){
		this.title=title;
		this.artist=artist;
		this.year=year;
		this.country=country;
	}
	Song(){		
	}
	
	public void show() {
		System.out.printf("%d�� %s������ %s�� �θ� %s",year,country,artist,title);
	}
	

}
