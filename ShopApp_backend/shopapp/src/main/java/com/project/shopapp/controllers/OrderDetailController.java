package com.project.shopapp.controllers;
import com.project.shopapp.dtos.OrderDTO;
import com.project.shopapp.dtos.OrderDetailDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.prefix}/orders_details")
public class OrderDetailController {
    // thêm ms 1 order detail
    @PostMapping
    public ResponseEntity<?> createOrderDetail(
            @Valid @RequestBody OrderDetailDTO newOrderDetail
            ){
        return  ResponseEntity.ok("createOrderDetail here");
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getOrderDetail(
            @Valid @PathVariable("id") Long id){
        return ResponseEntity.ok("getOrderDetail with id" +id);
    }
    // lấy ra danh sách các order detail của 1 cái order nào đó
    @GetMapping("/order/{orderId}")
    public ResponseEntity<?> getOrderDetails( @Valid @PathVariable("orderId") Long orderId){
        return ResponseEntity.ok("getOrderDetails with orderId = " +orderId);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrderDetail(
            @Valid @PathVariable("id") Long id,
            @RequestBody OrderDetailDTO newOrderDetailData){
        return ResponseEntity.ok("updateOrderDetail with id" +id+"newOrderDetailData: " + newOrderDetailData);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrderDetal(@Valid @PathVariable("id") Long id){
        return ResponseEntity.noContent().build();
    }

}
