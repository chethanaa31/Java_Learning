package day_18;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypecastingObjects1 {

	public static void main(String[] args) {
		
		//Rule 1: conversion is valid or not.
	/*	Animal an=new Dog();
		Cat ct=(Cat) an;
		
		Dog dg=new Dog();
		Cat ct=(Cat) dg; //invalid as per Rule 1
		*/
		
		//Rule 2: Assignment is valid or not
		// c must be same or child of A.
		
		//Animal an=new Dog();
		//Cat ct=(Cat) an; //valid as per rule 2
		
		//Animal an=new Dog();
		//Cat ct=(Dog) an; //invalid as per Rule 2
		
		//Rule 3: The underlying object of 'd' must be same or child of 'c'
		//Animal an=new Dog();
		//Cat ct =(Cat) an; //invalid as per rule 3.
		
		//Rule 1, Rule2, Rule3
		Animal an=new Dog();
		Dog dg =(Dog) an;

	}

}
