package chap07_practice;

public class TV {
	String brand;
	int year;
	int size;
	
	TV(String brand, int year,int size){
		this.brand=brand;
		this.year=year;
		this.size=size;
	}
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n",brand,year,size);
	}

}
