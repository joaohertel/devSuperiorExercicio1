package com.jhsantiago.devsuperior_componentes.services;

import com.jhsantiago.devsuperior_componentes.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public ShippingService() {
    }

    public double shipment(Order order){
        double shipmentPrice;

        if(order.getBasic() < 100.00d)
            shipmentPrice = 20.00d;
        else if (order.getBasic() > 100.00d && order.getBasic() < 200.00d) {
           shipmentPrice = 12.00d;
        }else{
            shipmentPrice = 0.0d;
        }

        return shipmentPrice;
    }
}
