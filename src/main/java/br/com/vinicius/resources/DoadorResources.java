package br.com.vinicius.resources;

import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.com.vinicius.domain.Doador;
import br.com.vinicius.services.DoadorServices;

@RestController
@RequestMapping("/doador")
public class DoadorResources {

	@Autowired
	private DoadorServices doadorServices;
	
	//-------------------------------Listar todos Doadores---------------------------------------
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Doador>> listarTodos(){
		return ResponseEntity.status(HttpStatus.OK).body(doadorServices.listar());}
	
	//--------------------------------------------------------------------------------------------
	
	
	//------------------------------- Salvar Dodores ---------------------------------------------
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Doador doador){
		doador = doadorServices.salvar(doador);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").buildAndExpand(doador.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	//-------------------------------------------------------------------------------------------
	
	
	//------------------------------ Deletar Doadores -------------------------------------------
	
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE,
			headers = "Accept=application/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
	doadorServices.deletar(id);
	return ResponseEntity.noContent().build();
	}
	
	//----------------------------------------------------------------------------------------------
	
	
	//--------------------------------Buscar por Id--------------------------------------------------
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {
		Doador doador = doadorServices.buscar(id);
		
		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
		
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(doador);
	}
	
	//-----------------------------------------------------------------------------------------------
	
	
	//---------------------------------Atualizar dados do Doador--------------------------------------
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Doador doador,@PathVariable("id") Long id){
		doador.setId(id);
		doadorServices.atualizar(doador);
		return ResponseEntity.noContent().build();
	}
	
	//------------------------------------------------------------------------------------------------
	
	
	
	
	
}
