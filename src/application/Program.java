package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String clientName = sc.nextLine();
		System.out.print("Email: ");
		String clientEmail = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date clientBirthDate = sdf1.parse(sc.next());
		Client client = new Client(clientName, clientEmail, clientBirthDate);
		
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
		
		
		Order order = new Order(new Date(), orderStatus, client);
		
		
		System.out.print("How many items to this order? ");
		int quantityItem = sc.nextInt();
		
		for (int i=1; i<=quantityItem; i++) {
			System.out.println("Enter #" + i + " item data: ");
			//sc.next();
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price:");
			double priceItem = sc.nextDouble();
			
			Product product = new Product(productName, priceItem);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantityItem, priceItem, product);
			
			order.addOrderItem(orderItem);
		}
		
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		sc.close();
	}
}