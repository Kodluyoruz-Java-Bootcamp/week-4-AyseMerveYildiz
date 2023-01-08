package emlakcepte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emlakcepte.model.Payment;
import emlakcepte.model.Realty;
import emlakcepte.request.PaymentRequest;
import emlakcepte.request.RealtyRequest;
import emlakcepte.service.PaymentService;
import emlakcepte.service.RealtyService;

@RestController
@RequestMapping(value = "/realtyes")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	

	// POST /payments
	@PostMapping
	public ResponseEntity<Payment> create(@RequestBody PaymentRequest paymentRequest) {
		Payment payment = paymentService.create(paymentRequest);
		return new ResponseEntity<>(payment, HttpStatus.CREATED);
	}

	
	
	
	
}
