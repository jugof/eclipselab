package stockapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import stockapi.entity.Stock;

public interface IStockRepository extends JpaRepository<Stock, Integer> {

}
