package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroMedico(
		
		@NotBlank(message = "O campo nome é orbigatório.")
		String nome, 
		
		@NotBlank(message = "O campo telefone é orbigatório.")
		String telefone, 
		
		@NotBlank(message = "O campo e-mail é orbigatório.")
		@Email
		String email,
		
		@NotBlank(message = "O campo crm é orbigatório.")
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		
		@NotNull(message = "O campo especialidade é orbigatório.")
		Especialidade especialidade, 
		
		@NotNull
		@Valid
		DadosEndereco endereco
		
		) {

}
