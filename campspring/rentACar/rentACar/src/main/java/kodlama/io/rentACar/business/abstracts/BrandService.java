package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.entities.concretes.Brand;

// iş kurallarını yazacağız.

public interface BrandService {

	List<Brand>getAll(); //Araba markaları listelenir.
	
}
