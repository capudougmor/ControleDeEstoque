package H.ControleDeEstoqueApi.models;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Produto {

	private Integer codigo;
	private String descricao;
	private Date validade;
	private String ean;
	private Boolean inativo;
	
	
	
}
