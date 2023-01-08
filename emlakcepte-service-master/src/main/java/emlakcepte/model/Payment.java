package emlakcepte.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import emlakcepte.model.enums.UserType;
@Entity
@Table(name = "payments")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	private Integer id;
	@Column(name = "paymentMethod")
	private String paymentMethod;
	@Column(name = "isPaid")
	private boolean isPaid;

	
	
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Payment(String paymentMethod, boolean isPaid) {
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
