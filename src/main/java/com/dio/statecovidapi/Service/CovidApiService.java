package com.dio.statecovidapi.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dio.statecovidapi.entity.State;

@Service
@FeignClient(name = "covid-api", url="https://covid19-brazil-api.vercel.app/api/report/v1/brazil/uf")
public interface CovidApiService {
	
	@GetMapping("/{uf}")
	State consultarUF(@PathVariable("uf") String uf);

}
