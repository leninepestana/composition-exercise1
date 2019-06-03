package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.OrderStatus;

public class Order {
	private Date orderMoment;
	private OrderStatus orderStatus;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<OrderItem> orderItems = new ArrayList<>();
	private Client client;
	
	public Order() {
		
	}

	public Order(Date orderMoment, OrderStatus orderStatus, Client client) {
		this.orderMoment = orderMoment;
		this.orderStatus = orderStatus;
		this.client = client;
	}
	
	
	public Date getOrderMoment() {
		return orderMoment;
	}

	public void setOrderMoment(Date orderMoment) {
		this.orderMoment = orderMoment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addOrderItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void removeOrderItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : orderItems) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
				StringBuilder sb = new StringBuilder();
				sb.append("Order moment: ");
				sb.append(sdf.format(orderMoment) + "\n"); 
				sb.append("Order status: ");
				sb.append(orderStatus+"\n");
				sb.append("Client: ");
				sb.append(client.getClientName()+" - ");
				sb.append(client.getClientEmail()+"\n");
				//sb.append("Order items:\n");
				
				for (OrderItem item : orderItems) {
					sb.append(item + "\n");

				}
				
				
				
				return sb.toString();
	}
	
	
}