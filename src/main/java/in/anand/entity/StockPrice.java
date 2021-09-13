package in.anand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOCK_PRICE_DTLS")
public class StockPrice {
	@Id
	@Column(name="STOCK_PRICE_ID")
	private Integer StockPriceId;
	
	@Column(name="COMPANY_NAME")
	private String CompanyName;
	
	@Column(name="COMPANY_STOCK_PRICE")
	private Double CompanyStockPrice;
	
	public Integer getStockPriceId() {
		return StockPriceId;
	}
	public void setStockPriceId(Integer stockPriceId) {
		StockPriceId = stockPriceId;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public Double getCompanyStockPrice() {
		return CompanyStockPrice;
	}
	public void setCompanyStockPrice(Double companyStockPrice) {
		CompanyStockPrice = companyStockPrice;
	}
	
	

}
