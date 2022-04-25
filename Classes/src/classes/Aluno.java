package classes;

public class Aluno {
	
	String nome;
	int idade; 
	String dataNascimento;
	String registroGeral; 
	String numeroCpf;
	String nomeMae;
	String nomePai; 
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	double nota1; 
	double nota2; 
	double nota3; 
	double nota4; 
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	/*construtor padr�o */
	public Aluno() {	
	}
	
	/*construtor recebendo um valor string*/
	public Aluno (String nomePadrao) {
		nome = nomePadrao;
	}
	
	/*construtor recebendo um string e um inteiro*/
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	
	//metodo que retorna a media
	public double getMediaNota() {
		return (this.nota1 + this.nota2 + this.nota3 + this.nota4)/4;
	}
	
	public boolean getAlunoAprovado () {
	  double media = this.getMediaNota();
	  if (media >= 10) {
	    return true ; 
	  } else {
		  return false;
	  }
	}
	
	
	public String getAlunoAprovado2 () {
		  double media = this.getMediaNota();
		  if (media >= 10) {
		    return "Aprovado!!!" ; 
		  } else {
			  return "Reprovado!!!";
		  }
		}
	
	
	
	}
	
	

	
