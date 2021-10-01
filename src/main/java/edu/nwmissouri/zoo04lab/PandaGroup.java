/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edsitor.
 */
package edu.nwmissouri.preethi04lab;

/**
 *
 * @author Preethi
 */
public class Panda extends Animal {

    public Panda(String name) {
        super(name);
    }

    @Override
    public void looks() {
        System.out.println("Hi I am a " + this.name + "! i am black and white with fur..");
    }

    @Override
    public void move() {
        System.out.println("I am a lazy animal and love to roll on ground");
    }

    @Override
    public void eat() {
        System.out.println("I like eating bamboo!");
    }

}
