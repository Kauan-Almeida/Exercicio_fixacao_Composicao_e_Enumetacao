package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import entities.enums.OrderStatus;
import java.util.Date;
import java.util.List;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderItem items;
	private Product product;
	private Client client;
	private OrderStatus status;
	private List<OrderItem> item = new ArrayList<>();
	
	private Order(){
	}
	private Order(Date moment, OrderStatus status) {
		this.moment = moment;
		this.status = status;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public void setItem(List<OrderItem> item) {
		this.item = item;
	}
	public List<OrderItem> getItem() {
		return item;
	}
	public void addItem(OrderItem itemm) {
		item.add(itemm);
	}
	public void removeItem(OrderItem itemm) {
		item.remove(itemm);
	}	
	public Double Total(Integer quantity, Double price) {
		return quantity * price;
	}
}