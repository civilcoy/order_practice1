package com.example.order_practice.controller;

import com.example.order_practice.dto.FoodDto;
import com.example.order_practice.dto.OrderItemDto;
import com.example.order_practice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    // 음식을 생성한다
    @PostMapping("/foods")
    public void createFood(@RequestBody FoodDto foodDto) {
        orderService.createFood(foodDto);
    }

    // 음식을 전체 조회한다
    @GetMapping("/foods")
    public void getFoods() {

    }

    @PutMapping("/foods/{id}")
    public void updateFood(@PathVariable Long id, @RequestBody FoodDto foodDto) {
        orderService.updateFood(id, foodDto);
    }

    // 음식을 상세 조회한다
    @GetMapping("/foods/{foodId}")
    public void getFoodDetail() {

    }

    // 주문을 생성한다.
    @PostMapping("/orders")
    public void createOrder(@RequestBody List<OrderItemDto> orderItemDtoList) {
        orderService.createOrder(orderItemDtoList);
    }
    // 주문 상품을 모두 취소한다.
    @DeleteMapping("/orders/{orderId}")
    public void deleteOrder(){

    }

    // 주문 상품을 취소한다(부분 취소)
    @DeleteMapping("/orders/orderItems/{orderItemId}")
    public void deleteOrderItem(){

    }
}
