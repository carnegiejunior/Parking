package br.com.carnegieworks.clients;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.carnegieworks.documents.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity(name = "clients")
public class Client {

	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@NotBlank
	@Column(name = "name", nullable = false)
	private String nome;
	
	@Column(name = "url_image", nullable = true)
	@JsonProperty(value = "url-image")
	private String urlImage;
	
	@Enumerated(EnumType.STRING)
	private ClientType clienteType;

	@OneToMany(mappedBy = "cliente")
	private List<Document> documents;
	
}
