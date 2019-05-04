package shoppee.com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import shoppee.com.entities.Product;
import shoppee.com.repository.ProductRepository;
import shoppee.com.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository; 

	@Override
	public List<Product> getAllProductAdmin() {
		return (List<Product>) productRepository.findAll();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProduct() {
		return (List<Product>) productRepository.getAllProductPublic();
	}

	@Override
	public void addProduct(Product objProduct) {
		productRepository.save(objProduct);
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.getProductById(id);
	}

	@Override
	public void deleteProductById(Integer id) {
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> getProductPaginationAdmin(Pageable pageable) {
		return (List<Product>) productRepository.getProductPaginationAdmin(pageable);
	}
	
	@Override
	public List<Product> getProductPagination(Pageable pageable) {
		return (List<Product>) productRepository.getProductPagination(pageable);
	}

	@Override
	public List<Product> getAllSaleProduct() {
		return (List<Product>) productRepository.getAllSaleProduct();
	}

	@Override
	public List<Product> getSaleProductPagination(Pageable pageable) {
		return (List<Product>) productRepository.getSaleProductPagination(pageable);
	}

	@Override
	public List<Product> getAllHotProduct() {
		return (List<Product>) productRepository.getAllHotProduct();
	}

	@Override
	public List<Product> getHotProductPagination(Pageable pageable) {
		return (List<Product>) productRepository.getHotProductPagination(pageable);
	}

	@Override
	public List<Product> getStoreProductPagination(Pageable pageable, Integer storeId, Integer proId) {
		return (List<Product>) productRepository.getStoreProductPagination(pageable, storeId, proId);
	}

	@Override
	public List<Product> getStoreProductPaginationAdmin(Pageable pageable, Integer storeId) {
		return (List<Product>) productRepository.getStoreProductPaginationAdmin(pageable, storeId);
	}
	
	@Override
	public List<Product> getStoreProductPagination(Pageable pageable, Integer storeId) {
		return (List<Product>) productRepository.getStoreProductPagination(pageable, storeId);
	}

	@Override
	public List<Product> getProductByCatId(Pageable pageable, Integer catId) {
		return (List<Product>) productRepository.getStoreProductByCatId(pageable, catId);
	}

}
