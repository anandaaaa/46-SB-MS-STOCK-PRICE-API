package in.anand.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.anand.entity.StockPrice;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPrice,Serializable> {
	
	@Query("select CompanyStockPrice from StockPrice where CompanyName=:CompanyName")
	public Double findStockPriceByComapnyname(String CompanyName);
	 

}
