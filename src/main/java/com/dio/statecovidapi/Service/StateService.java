package com.dio.statecovidapi.Service;

import org.springframework.stereotype.Service;

import com.dio.statecovidapi.entity.State;


@Service
public interface StateService {
	
	Iterable  <State> showStates();
	
	State buscarPorUF (String uf);
	
	void insert(State state);
	
	/*void atualizar(String uf, State state);
	
	void deletar(String uf);*/
	
}
