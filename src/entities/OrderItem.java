package entities;

public class OrderItem {
	private Integer quantityItem;
	private Double priceItem;
	
	private Product product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantityItem, Double priceItem, Product product) {
		this.quantityItem = quantityItem;
		this.priceItem = priceItem;
		this.product = product;
	}

	public Integer getQuantityItem() {
		return quantityItem;
	}

	public void setQuantityItem(Integer quantityItem) {
		this.quantityItem = quantityItem;
	}

	public Double getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(Double priceItem) {
		this.priceItem = priceItem;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return priceItem * quantityItem;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		//sb.append(product + ", ");
		//sb.append(" $" + priceItem + ", ");
		sb.append("Quantity: " + quantityItem);
		sb.append(", Subtotal: " + subTotal());
		sb.append("\nTotal price: " );
		return sb.toString();
	}
	
	
}
