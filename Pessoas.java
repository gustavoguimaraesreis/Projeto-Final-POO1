public class Pessoas {
	private String nome;
	private String CPF;
	private String RG;
	private String sexo;
	
	//Setters e Getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public boolean setCPF(String cpf) {
		
		//invalidando possibilidades que passam no algorítmo, porém na realidade, não são válidos:
		if(cpf == "11111111111" || cpf == "22222222222" || cpf == "33333333333" || cpf == "44444444444" || cpf == "55555555555" || cpf == "66666666666" ||
			cpf == "77777777777" || cpf == "88888888888" || cpf == "99999999999")
			return false;
		
		//iniciando o algorítmo de validação:
		int[] cpfInt = new int[11];
		int j = 0;
		int validação1 = 0, validação2 = 0;
		int aux1 = 10, aux2 = 11;
		for(int i = 0; i < cpf.length(); i++) {
			
			/* cpfInt[i] = (int) cpf.charAt(i); */
				cpfInt[i] = Character.getNumericValue(cpf.charAt(i));
				System.out.println("cpfInt: " + cpfInt[i]);
				j++;
			
		}
		//Validando o primeiro dígito:
		for(int i = 0; i < cpfInt.length -2; i++) {
			validação1 += cpfInt[i] * aux1;
			System.out.println("O primeiro digito verificador é: " + validação1);
			aux1--;
		}
		validação1 = (validação1 * 10) % 11;
		System.out.println("O primeiro digito verificador é: " + validação1);
		
		if(validação1 == cpfInt[9]) {//se validar o primeiro dígito, verificamos o segundo, senão já retornar falso
			
			
			for(int i = 0; i < cpfInt.length-1; i++) {
				validação2 += cpfInt[i]*aux2;
				aux2--;
			}
			validação2 = (validação2 * 10) % 11;
			System.out.println("O segundo digito verificador é: " + validação2);
			if(validação2 == cpfInt[10]) {
				this.CPF = cpf;
				return true;
			}
			else 
				return false;
		}
			
		else
			return false;
		
	}

	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	//Construtor:
	
	public Pessoas(String nome, String cpf, String rg, String sexo) {
		setNome(nome);
		if(setCPF(cpf) == false) {
			System.out.println("CPF Inválido \n");
		}
		else 
			System.out.println("CPF Válido");
		
		setRG(rg);
		setSexo(sexo);
	}
}






