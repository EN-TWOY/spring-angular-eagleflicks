package com.spring.angular.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.angular.models.Director;
import com.spring.angular.models.Pais;
import com.spring.angular.services.DirectorService;
import com.spring.angular.services.PaisService;

@Controller
@RequestMapping("/api/director/")
@ResponseBody
@CrossOrigin(origins = "http://localhost:4200")
public class DirectorController {

	@Autowired
	private DirectorService serviDirector;

	@Autowired
	private PaisService serviPais;

	@GetMapping("/directores")
	public List<Director> listarDirectores() {
		return serviDirector.listarDirectores();
	}

	@GetMapping("/paises")
	public List<Pais> listarPaises() {
		return serviPais.listarPaises();
	}

	@PostMapping("/directores")
	public Director guardarEmpleado(@RequestBody Director director) {
		return serviDirector.guardarDirector(director);
	}

	@GetMapping("/directores/{id}")
	public ResponseEntity<Director> obtenerDirectorPorId(@PathVariable Integer id) {
		Director director = serviDirector.obtenerDirectorPorId(id);
		return ResponseEntity.ok(director);
	}

	@PutMapping("/directores/{id}")
	public ResponseEntity<Director> actualizarDirector(@PathVariable Integer id,
			@RequestBody Director detallesDirector) {
		Director directorActualizado = serviDirector.actualizarDirector(id, detallesDirector);
		return ResponseEntity.ok(directorActualizado);
	}

	@DeleteMapping("/directores/{id}")
	public ResponseEntity<Map<String, Boolean>> eliminarDirector(@PathVariable Integer id) {
		serviDirector.eliminarDirectorPorId(id);
		Map<String, Boolean> respuesta = new HashMap<>();
		respuesta.put("eliminar", Boolean.TRUE);
		return ResponseEntity.ok(respuesta);
	}
}