package com.jhsantiago.devsuperior_componentes;

import com.jhsantiago.devsuperior_componentes.entities.Order;
import com.jhsantiago.devsuperior_componentes.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class DevSuperiorComponentesApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public DevSuperiorComponentesApplication() {
        Locale.setDefault(Locale.US);
    }

    public static void main(String[] args) {
        SpringApplication.run(DevSuperiorComponentesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Order o1 = new Order(1034,150.00,20.0);
        orderService.printOrder(o1);

        Order o2 = new Order(2282,800.00,10.0);
        orderService.printOrder(o2);

        Order o3 = new Order(1309,95.90, 0.0);
        orderService.printOrder(o3);

    }
}
