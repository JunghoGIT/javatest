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
		System.out.printf("%s���� ���� %d���� %d��ġ TV\n",brand,year,size);
	}

}
