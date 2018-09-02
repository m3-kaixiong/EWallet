package com.mpm.EWalletApp.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mpm.EWalletApp.model.Product;
import com.mpm.EWalletApp.model.SubWallet;
import com.mpm.EWalletApp.model.Transactions;
import com.mpm.EWalletApp.model.Wallet;

@Controller
public class EWalletAppController {

	List<Product> productList = new ArrayList<Product>();
	
	SubWallet SubWalletAccount = new SubWallet(1, "JohnDoe");
	
	private static final String PRODUCT_EXTRA_DESC = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur viverra elit leo, eu lacinia lacus volutpat ac. Mauris id magna massa. Quisque ullamcorper ullamcorper pharetra. Vestibulum dictum mi sed sem pretium, non consequat ar";
	
	private static final String MERCHANT_NAME = "Maventree Store";
	
	public EWalletAppController() {
		
		int productId = 1;
		
		Product product1 = new Product(productId++, "Product 1", 10.00, "Product 1 Description. " + PRODUCT_EXTRA_DESC, "product1_sqr.jpg", "product1_qr.jpg", MERCHANT_NAME);
		Product product2 = new Product(productId++, "Product 2", 15.00, "Product 2 Description. " + PRODUCT_EXTRA_DESC, "product2_sqr.jpg", "product2_qr.jpg", MERCHANT_NAME);
		Product product3 = new Product(productId++, "Product 3", 20.00, "Product 3 Description. " + PRODUCT_EXTRA_DESC, "product3_sqr.jpg", "product3_qr.jgp", MERCHANT_NAME);
		
		productList.add(product1);
		productList.add(product2);
		productList.add(product3);
		
		
	}
	
	
	@GetMapping("/product/{id}")
	public String getProduct(@PathVariable("id") int id, Model model) {
		if(id > 0 && id <= productList.size()) {
			Product product = productList.get(id-1);
			
			model.addAttribute("product", product);
			return "product";
		}
		
		return null;
	}
	
	@PostMapping("/txn")
	public String addNewTxn(@RequestParam int productId, Model model) {
		Product product = productList.get(productId-1);
				
		Transactions newTxn = new Transactions(new Date(), product, "purchase");
		
		if(SubWalletAccount.addTxn(newTxn)) {
			model.addAttribute("txn", newTxn);
			return "payment_success";
		}
		
		return "payment_fail";
    }
	
	@GetMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("wallet", SubWalletAccount);
		
		model.addAttribute("lastTxn", SubWalletAccount.getLastTxn());
		
        return "home";
    }
	
	
	@GetMapping("/error")
	public String error(Model model) {
        return "error";
    }
	
	@PostMapping("/topup")
	public String topUpBalance(Model model) {
		return "topup";
	}
	
	

}

