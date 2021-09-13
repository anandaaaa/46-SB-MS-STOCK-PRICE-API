package in.anand.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import in.anand.Repository.StockPriceRepository;
import in.anand.binding.StockPriceResponse;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	private StockPriceRepository stockpricerepo;
	
	@Autowired
	private Environment env;
	
	@Override
	public StockPriceResponse getprice(String CompanyName) {
		Double priceByComapnyname = stockpricerepo.findStockPriceByComapnyname(CompanyName);
		
		StockPriceResponse response = new StockPriceResponse();
		response.setCompanyName(CompanyName);
		response.setStockPrice(priceByComapnyname);
		String  port = env.getProperty("server.port");
		response.setPort(Integer.parseInt(port));
		
		return response;
	}

}
