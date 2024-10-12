package com.example.week7;

import com.example.week7.flower.Flower;
import com.example.week7.flower.FlowerColor;
import com.example.week7.flower.FlowerPack;
import com.example.week7.flower.FlowerType;
import com.example.week7.flower.Item;

public class OrderTest {
    public void test() {
Order order = new Order();
order. setPayment (new CreditCardPaymentStri order. setDelivery (new PostDeliveryStrateg
Item item = new Item();
FlowerBucket flowerBucket = new FlowerBuc
flowerBucket. addFlowerPack(
new FlowerPack(new Flower
FlowerColor.RED, FlowerType. ROSE,
item. setFlowerBucket (flowerBucket);
order. additem(item);

}
