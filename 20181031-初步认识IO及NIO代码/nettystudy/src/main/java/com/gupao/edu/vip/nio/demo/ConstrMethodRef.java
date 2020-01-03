package com.gupao.edu.vip.nio.demo;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class ConstrMethodRef {
    @FunctionalInterface interface UserFactory<U extends User> {
        U create(int id, String name);
    }
    static int[] arr={1,3,4,5,6,7,8,9,10};
    static UserFactory<User> uf = User::new;

    public static double ave(Student stu){
        return Arrays.stream(stu.getScores()).average().orElse(0);
        }

    public static void main(String[] args) {
        Stream<BigInteger> integers = Stream.iterate(BigInteger.ONE, n->n.add(BigInteger.ONE));
        Iterator<BigInteger> iterator = integers.iterator();
        for(int i = 0; i < 10; i++)
            System.out.println(iterator.next());
    }
}