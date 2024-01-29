package services;

import org.springframework.beans.factory.annotation.Autowired;
import products.Product;
import repositories.JewelRepository;

import java.util.List;

public class JewelServiceImpl implements JewelService{

    @Autowired
    private JewelRepository jewelRepository;
    @Autowired
    private List<Product> jewels;

    @Override
    public List<Product> jewelsList() {
        jewels = jewelRepository.findAll();
        return jewels;
    }
}
