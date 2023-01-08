package emlakcepte.request;

public class PaymentRequest {
	
	private String paymentMethod;
	private boolean isPaid;
	
	public PaymentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public PaymentRequest(String paymentMethod, boolean isPaid) {
		super();
		this.paymentMethod = paymentMethod;
		this.isPaid = isPaid;
	}
	

	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public boolean isPaid() {
		return isPaid;
	}
	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	

	
	
	

}
