package com.javaapp.controller;

import java.util.List;
import java.util.Scanner;

import com.javaapp.exceptions.ResourceNotFoundException;
import com.javaapp.model.Category;
import com.javaapp.model.Product;
import com.javaapp.service.CategoryService;

public class ProductController {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CategoryService categoryService = new CategoryService();
		
		while(true) {
			System.out.println("****** Inventory Ops ******");
			System.out.println("1. Add Category");
			System.out.println("2. Add Product");
			System.out.println("3. List of Products");
			System.out.println("4. List of Products by Category Id");
			System.out.println("5. Delete the Product");
			System.out.println("6. Edit the Product details");
			System.out.println("0. Exit");
			
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting.. Bye!! ");
				break;
			}
			Category category = new Category();
			switch(input) {
			case 1:
				System.out.println("Enter category name: ");
				String cname = sc.next();
				System.out.println("Enter priority: ");
				int priority = sc.nextInt();
				//set input to category object. generate ID randomly
				category.setId((int)Math.random()*100);
				category.setName(cname);
				category.setPriority(priority);
				
				categoryService.addCategory(category);
				System.out.println("Category added....");
				break;
			case 2:
				List<Category> listCategory = categoryService.findAll();
				for(Category c : listCategory) {
					System.out.println(c);
				}
				break;
			case 3:
				Product product = new Product();
				System.out.println("Enter product title: ");
				product.setTitle(sc.nextLine());
				System.out.println("Enter price: ");
				product.setPrice(sc.nextDouble());
				System.out.println("Enter product description: ");
				product.setDescription(sc.nextLine());
				
				System.out.println("Enter category ID");
				int id = sc.nextInt();
				try {
					category = categoryService.findById(id);
					product.setCategory(category);
					System.out.println(product);
				} catch (ResourceNotFoundException e) {
					System.out.println(e.getMessage());
				}
				
				break;
			default:
				System.out.println("Invalid Key pressed(1-6)");
				break;
			}
		}
	}
}
