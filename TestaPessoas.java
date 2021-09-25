public class TestaPessoas {

	public static void main(String[] args) {
		
		Pessoas p1 = new Pessoas("Gabriel", "03890153186", "2277604410", "masculino");
		System.out.println(p1.getNome() + ", " + p1.getCPF() + ", " + p1.getRG() + ", " + p1.getSexo());
	}

}