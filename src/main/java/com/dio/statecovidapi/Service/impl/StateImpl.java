package com.dio.statecovidapi.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;
import com.dio.statecovidapi.Service.CovidApiService;
import com.dio.statecovidapi.Service.StateService;
import com.dio.statecovidapi.entity.StateRepository;
import com.dio.statecovidapi.entity.*;

public class StateImpl implements StateService {
	
	@Autowired
	private StateRepository stateRepository;
	
	@Autowired
	private CovidApiService covidService;
	
	@Override
	public Iterable <State> showStates(){
		return stateRepository.findAll();
	}
	
	@Override
	public State buscarPorUF (String uf) {
		Optional <State> state = stateRepository.findById(uf);
		return state.get();
	}
	
	@Override
	public void insert(State state) {
		inserirEstadocomUf(state);
	}
	
	
	
	public void inserirEstadocomUf(State state) {
			String uf = state.getUf();
			state = covidService.consultarUF(uf.toUpperCase());
			stateRepository.save(state);
	}
	
	
	
	
	

	
	
}
