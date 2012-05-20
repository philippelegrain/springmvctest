package net.mbs.service;

import java.util.List;

import net.mbs.domain.Product;

public interface ProductManager {
	public List<Product> getProducts();
	public void increasePrice(int percentage);
	public void setProducts(List<Product> products);
}
