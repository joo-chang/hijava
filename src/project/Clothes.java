package project;

public class Clothes extends Product{
	String size;
	
	Clothes(){}
	Clothes(int price,String maker, String model,String size){
		super(price,maker,model);
		this.size=size;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return super.toString()+"ªÁ¿Ã¡Ó:"+size;
	}
	
}
