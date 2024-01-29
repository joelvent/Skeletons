package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import products.Product;

public interface JewelRepository extends JpaRepository<Product, Long> {

}
