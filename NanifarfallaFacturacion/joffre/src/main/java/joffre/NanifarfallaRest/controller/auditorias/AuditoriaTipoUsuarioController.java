package joffre.NanifarfallaRest.controller.auditorias;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoUsuario;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaTipoUsuarioRepository;

@RestController
@RequestMapping("/apiAuditoriaTipoUsuario")
public class AuditoriaTipoUsuarioController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaTipoUsuarioController.class);

	@Autowired
	AuditoriaTipoUsuarioRepository auditoriaTipoUsuario;

	@GetMapping("/auditoriaTipoUsuario")
	public List<AuditoriaTipoUsuario> getAllAuditoriaTipoUsuarios() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoUsuario.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaTipoUsuario getAuditoriaTipoUsuarioById(@PathVariable(value = "id") int auditipoUsuarioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoUsuario.findById(auditipoUsuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaTipoUsuario", "id", auditipoUsuarioId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
