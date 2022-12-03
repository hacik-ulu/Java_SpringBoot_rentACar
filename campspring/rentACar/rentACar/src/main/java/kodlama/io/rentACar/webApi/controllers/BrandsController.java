package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

//İş kontrolleri.

@RestController // annotation-->bilgilendirme
@RequestMapping("/api/brands") // Kontrol Merkezi ile iletişim kurma.

public class BrandsController {

	private BrandService brandService;

	@Autowired // bu komut ile bradnServicee giderek BrandService'in kim tarafından implemente edildiğini görerer new'leme islemi yaparız.
	public BrandsController(BrandService brandService) {
		this.brandService = brandService;
	}
	
	@GetMapping("/getall")
	public List<Brand> getall(){
		return brandService.getAll();
	}
}
