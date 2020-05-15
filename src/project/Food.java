package project;

public class Food extends Product{
	String expirationDate;
	
	Food(){}
	Food(int price,String maker, String model,String expirationDate){
		super(price,maker,model);
		this.expirationDate=expirationDate;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	@Override
	public String toString() {
		return super.toString()+"유통기한:" + expirationDate;
	}
	
}
