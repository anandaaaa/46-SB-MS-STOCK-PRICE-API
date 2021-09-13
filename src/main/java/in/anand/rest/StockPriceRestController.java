package in.anand.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.anand.binding.StockPriceResponse;
import in.anand.service.StockPriceService;

@RestController
public class StockPriceRestController {
	
	@Autowired
	private StockPriceService service;
	
	@GetMapping("/price/{CompanyName}")
	public ResponseEntity<StockPriceResponse> getStockPrice(@PathVariable String CompanyName)
	{
		System.out.println("REST CONTROLLER");
		StockPriceResponse stockPriceResponse = service.getprice(CompanyName);
		
		ResponseEntity<StockPriceResponse> entity = new ResponseEntity<StockPriceResponse>(stockPriceResponse,HttpStatus.OK);
		return entity;
	}
	

}
