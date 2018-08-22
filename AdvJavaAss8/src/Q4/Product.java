package Q4;

public class Product {
	private String productId;
	private String productName;
	
	
	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(String productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
}
