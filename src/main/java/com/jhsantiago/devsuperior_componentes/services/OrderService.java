package com.jhsantiago.devsuperior_componentes.services;

import com.jhsantiago.devsuperior_componentes.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public OrderService() {
    }

    public double total(Order order){

        double discountedBasic = order.getBasic() * (( 100.0 - order.getDiscount()) / 100.0);
        double shippingPrice = shippingService.shipment(order);

        return discountedBasic + shippingPrice;
    }

    public void printOrder(Order order){
        System.out.println(
                "-".repeat(20) + "\n"
                + "Pedido código: " + order.getCode() + "\n"
                + "Valor Total: " + String.format("%.2f",total(order))
        );
    }
}
