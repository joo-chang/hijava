package project;

public class Book extends Product {
	String genre;
	
	Book(){}
	Book(int price,String maker, String model,String genre){
		super(price,maker,model);
		this.genre=genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return super.toString()+"¿Â∏£:"+genre;
	}
}
