package eztix.orderservice.repository;

import eztix.orderservice.model.PaymentOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.stream.Stream;

public interface OrderRepository extends CrudRepository<PaymentOrder,Long>{
    Stream<PaymentOrder> findByCustomerIdOrderByPaymentDateTime(String customerId);

    Optional<PaymentOrder> findByPurchaseRequestId(Long purchaseRequestId);
}
