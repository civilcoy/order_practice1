package com.example.order_practice.service;

import com.example.order_practice.dto.FoodDto;
import com.example.order_practice.dto.OrderItemDto;
import com.example.order_practice.entity.Food;
import com.example.order_practice.entity.OrderItem;
import com.example.order_practice.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final FoodRepository foodRepository;
    public void createFood(FoodDto foodDto) {
        Food food = new Food(foodDto);
        foodRepository.save(food);
    }

    @Transactional
    public void updateFood(Long id, FoodDto foodDto) {
        Food food = foodRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("")
        );
        food.updateFood(foodDto);
    }

    public void createOrder(List<OrderItemDto> orderItemDtoList) {
        OrderItem orderItem = new OrderItem()
    }
}
