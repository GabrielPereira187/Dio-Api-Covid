package com.dio.statecovidapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.statecovidapi.Service.StateService;
import com.dio.statecovidapi.entity.State;

@RestController
@RequestMapping("estados")
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@GetMapping
	public ResponseEntity<Iterable <State>> buscarTodos(){
		return ResponseEntity.ok(stateService.showStates());
	}
	
	@GetMapping("/{uf}")
	public ResponseEntity <State> buscarporUF(@PathVariable String uf){
		return ResponseEntity.ok(stateService.buscarPorUF(uf));
	}
	
	@PostMapping
	public ResponseEntity<State> inserir(@RequestBody State state){
		stateService.insert(state);
		return ResponseEntity.ok(state);
	}
	
	

}
