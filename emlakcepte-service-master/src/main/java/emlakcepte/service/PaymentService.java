package emlakcepte.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import emlakcepte.client.Banner;
import emlakcepte.client.BannerServiceClient;
import emlakcepte.controller.PaymentController;
import emlakcepte.controller.UserController;
import emlakcepte.model.Payment;
import emlakcepte.model.Realty;
import emlakcepte.model.User;
import emlakcepte.model.enums.RealtyType;
import emlakcepte.model.enums.UserType;
import emlakcepte.request.PaymentRequest;
import emlakcepte.request.RealtyRequest;
import emlakcepte.request.UserRequest;
import emlakcepte.response.UserResponse;

@Service
public class PaymentService {

	

	@Autowired
	private UserService userService;

	

	@Autowired
	private BannerServiceClient bannerServiceClient;

	public Payment create(PaymentRequest paymentRequest) {
	
			
			Logger logger = Logger.getLogger(PaymentController.class.getName());
			logger.log(Level.INFO, "[createUser] - user created: {0}", savedUser.getId());
			//User paid = paymentRepository.save(converter.convert(paymentRequest));

			logger.log(Level.WARNING, "[paid] - paymentRequest: {0}, sent to : {1}",
					new Object[] { paymentRequest.isPaid(), rabbitMQConfiguration.getQueueName() });
			return converter.convert(paid);
	
	

	

	
	}

}
