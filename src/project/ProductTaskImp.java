package project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTaskImp implements ProductTask {
	//생성자
	ProductTaskImp() {
		Clothes clothes = new Clothes(30000,"맨투맨","아디다스","XL");
		Clothes clothes2 = new Clothes(46000,"후드티","나이키","M");
		Book book = new Book(15000,"혼자공부하는자바","한빛미디어","컴퓨터");
		Book book2 = new Book(5000,"어린왕자","비룡소","소설");
		productList.add(book);
		productList.add(book2);
		productList.add(clothes);
		productList.add(clothes2);
	}
	//ArrayList 생성
	ArrayList<Product> productList = new ArrayList<>();

	//숫자를 입력받을 수 있는 메서드
	int getInt(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	//문자열을 입력 받을 수 있는 메서드
	String getString(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		return sc.nextLine();
	}

	
	@Override
	public void registProduct() {
		int menu = getInt("1.의류    2.도서    3.스마트폰    ");
		int price = getInt("가격:");
		String model = getString("이름:");
		String maker = getString("회사:");
		if (menu == 1) {
			String size = getString("사이즈:");
			Clothes clothes = new Clothes(price, model, maker, size);
			productList.add(clothes);
		} else if (menu == 2) {
			String genre = getString("장르:");
			Book book = new Book(price, model, maker, genre);
			productList.add(book);
		} else if (menu == 3) {
			String color = getString("색상:");
			Phone phone = new Phone(price, model, maker, color);
			productList.add(phone);
		} else if(menu ==4 ) {
			String expirationDate = getString("유통기한:");
			Food food = new Food(price,model,maker,expirationDate);
			productList.add(food);
		}
		else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

	@Override
	public void sellProduct() {
		int sNumber = getInt("판매할 물건의 번호를 입력하세요:");
		boolean flag = false;
		for (Product p : productList) {
			if (p.getNumber().equals(sNumber)) {
				productList.remove(p);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("일치하는 번호가 없습니다.");
		}
	}

	@Override
	public void listProduct() {
		for (Product p : productList) {
			System.out.println(p.toString());
		}
	}

	
	public void printMenu() {
		System.out.println("중고 거래 프로그램");
		System.out.println("1.등록    2.판매    3.목록    4.이상 확인    0.종료");
	}

	public void start() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			printMenu();
			int menu = sc.nextInt();
			if (menu == 0)
				break;
			switch (menu) {
			case 1:
				registProduct();
				break;
			case 2:
				sellProduct();
				break;
			case 3:
				listProduct();
				break;
			case 4:

			}

		}
	}

}
