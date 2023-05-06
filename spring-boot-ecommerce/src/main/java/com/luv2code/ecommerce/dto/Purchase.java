package com.luv2code.ecommerce.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.Customer;
import com.luv2code.ecommerce.entity.Order;
import com.luv2code.ecommerce.entity.OrderItem;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;

import java.util.Currency;
import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;




}
