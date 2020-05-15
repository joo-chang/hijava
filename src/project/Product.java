package project;

public abstract class Product {
	private static int count=1;
	String Number;
	int price;
	String maker;
	String model;
	
	Product(){}
	
	Product(int price,String maker, String model){
		this.Number="2020"+String.format("%02d", count);
		this.price=price;
		this.maker=maker;
		this.model=model;
		count++;
	}

	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		this.Number = number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	


	@Override
	public String toString() {
		return  Number +") "+"가격:"+ price +"  회사:" + maker +"  이름:" + model+"  " ;
	}
	
}
