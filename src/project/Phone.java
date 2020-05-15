package project;


public class Phone extends Product{
	String color;
	
	Phone(){}
	Phone(int price,String maker, String model,String color){
		super(price,maker,model);
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return super.toString()+"»ö»ó:"+color;
	}
	
}
