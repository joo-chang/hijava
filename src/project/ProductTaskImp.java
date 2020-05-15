package project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTaskImp implements ProductTask {
	//������
	ProductTaskImp() {
		Clothes clothes = new Clothes(30000,"������","�Ƶ�ٽ�","XL");
		Clothes clothes2 = new Clothes(46000,"�ĵ�Ƽ","����Ű","M");
		Book book = new Book(15000,"ȥ�ڰ����ϴ��ڹ�","�Ѻ��̵��","��ǻ��");
		Book book2 = new Book(5000,"�����","����","�Ҽ�");
		productList.add(book);
		productList.add(book2);
		productList.add(clothes);
		productList.add(clothes2);
	}
	//ArrayList ����
	ArrayList<Product> productList = new ArrayList<>();

	//���ڸ� �Է¹��� �� �ִ� �޼���
	int getInt(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		int num = Integer.parseInt(sc.nextLine());
		return num;
	}

	//���ڿ��� �Է� ���� �� �ִ� �޼���
	String getString(String text) {
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		return sc.nextLine();
	}

	
	@Override
	public void registProduct() {
		int menu = getInt("1.�Ƿ�    2.����    3.����Ʈ��    ");
		int price = getInt("����:");
		String model = getString("�̸�:");
		String maker = getString("ȸ��:");
		if (menu == 1) {
			String size = getString("������:");
			Clothes clothes = new Clothes(price, model, maker, size);
			productList.add(clothes);
		} else if (menu == 2) {
			String genre = getString("�帣:");
			Book book = new Book(price, model, maker, genre);
			productList.add(book);
		} else if (menu == 3) {
			String color = getString("����:");
			Phone phone = new Phone(price, model, maker, color);
			productList.add(phone);
		} else if(menu ==4 ) {
			String expirationDate = getString("�������:");
			Food food = new Food(price,model,maker,expirationDate);
			productList.add(food);
		}
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
		}

	}

	@Override
	public void sellProduct() {
		int sNumber = getInt("�Ǹ��� ������ ��ȣ�� �Է��ϼ���:");
		boolean flag = false;
		for (Product p : productList) {
			if (p.getNumber().equals(sNumber)) {
				productList.remove(p);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("��ġ�ϴ� ��ȣ�� �����ϴ�.");
		}
	}

	@Override
	public void listProduct() {
		for (Product p : productList) {
			System.out.println(p.toString());
		}
	}

	
	public void printMenu() {
		System.out.println("�߰� �ŷ� ���α׷�");
		System.out.println("1.���    2.�Ǹ�    3.���    4.�̻� Ȯ��    0.����");
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
