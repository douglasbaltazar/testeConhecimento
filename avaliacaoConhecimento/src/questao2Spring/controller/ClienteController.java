package questao2Spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import questao2Spring.model.Cliente;
import questao2Spring.repository.ClienteRepository;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	// getClientes
	
	@GetMapping
	public List<Cliente> getClientes() {
		return this.clienteRepository.findAll();
	}
	
	// getClienteById
	
	@GetMapping("{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable(value = "id") Long clienteId)
			throws Exception {
		Cliente cliente = clienteRepository.findById(clienteId)
				.orElseThrow(() -> new Exception("Não foi encontrado um cliente com id " + clienteId));
		return ResponseEntity.ok().body(cliente);
	}
	
	// getClientesVip
	@GetMapping("/vips")
	public List<Cliente> getClientesVips() {
		return this.clienteRepository.findClientesVip();
	}
	
	
	// insertCliente
	
	@PostMapping
	public Cliente insertCliente(@RequestBody Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	// updateCliente
	
	@PutMapping("{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable(value = "id") Long clienteId, 
			@Valid @RequestBody Cliente clienteUpd) throws Exception {
		Cliente cliente = clienteRepository.findById(clienteId)
				.orElseThrow((() -> new Exception("Não foi encontrado um cliente com o id " + clienteId)));
		cliente.setNome(clienteUpd.getNome());
		cliente.setTipo(clienteUpd.getTipo());
		return ResponseEntity.ok(this.clienteRepository.save(cliente));
	}
	
	// removeCliente
	@DeleteMapping
	public Map<String, Boolean> deleteCliente(@PathVariable(value = "id") Long clienteId)
		throws Exception {
		Cliente cliente = clienteRepository.findById(clienteId)
				.orElseThrow((() -> new Exception("Não foi encontrado um cliente com o id " + clienteId)));
		this.clienteRepository.delete(cliente);
		Map<String, Boolean> resposta = new HashMap<>();
		resposta.put("deleted", Boolean.TRUE);
		return resposta;
	}

}
