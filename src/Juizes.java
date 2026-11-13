public class Juizes extends Competidor   {
    
    public Juizes(String nome, String endereco, String email, float cpf, float celulares, String apelido) {
        super(nome, endereco, email, cpf, celulares, apelido);
        private String nome;
        private String endereco;
        private String email;
        private float cpf;
        private float celulares;
        private String apelido;

        public Juizes(String nome, String endereco, String email, float cpf, float celulares, String apelido) {
            super(nome, endereco, email, cpf, celulares, apelido);
            this.nome = nome;
            this.endereco = endereco;
            this.email = email;
            this.cpf = cpf;
            this.celulares = celulares;
            this.apelido = apelido;
        }
}
