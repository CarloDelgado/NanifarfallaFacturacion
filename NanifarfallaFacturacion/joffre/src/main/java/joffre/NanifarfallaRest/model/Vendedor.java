package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "vendedor")
@EntityListeners(AuditingEntityListener.class)
public class Vendedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_vendedor;
	
	
	public int getCodigo_vendedor() {
		return codigo_vendedor;
	}

	public void setCodigo_vendedor(int codigo_vendedor) {
		this.codigo_vendedor = codigo_vendedor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Collection<Cliente_tiene_pedido> getCliente_tiene_pedido() {
		return cliente_tiene_pedido;
	}

	public void setCliente_tiene_pedido(Collection<Cliente_tiene_pedido> cliente_tiene_pedido) {
		this.cliente_tiene_pedido = cliente_tiene_pedido;
	}

	public String getCodigo_venta_vendedor() {
		return codigo_venta_vendedor;
	}

	public void setCodigo_venta_vendedor(String codigo_venta_vendedor) {
		this.codigo_venta_vendedor = codigo_venta_vendedor;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	@JoinColumn(name = "fkcodigo_usuario", referencedColumnName = "codigo_usuario")
	@ManyToOne
	@JsonBackReference
	Usuario usuario;
	
	@JoinColumn(name = "fkcodigo_area", referencedColumnName = "codigo_area")
	@ManyToOne
	@JsonBackReference
	Area area;
	
	@OneToMany(mappedBy = "mVendedor")
	private Collection<Cliente_tiene_pedido> cliente_tiene_pedido = new ArrayList<>();
	
	@NotBlank
	private String codigo_venta_vendedor;

	@NotBlank
	private String claveApi;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
