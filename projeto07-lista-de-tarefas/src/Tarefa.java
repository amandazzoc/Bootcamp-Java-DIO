public class Tarefa {
    
        // Atributo 
        private String descricao;

        // Getter
        public String getDescricao() {
            return descricao;
        }

        // Construtor
        public Tarefa(String descricao) {
            this.descricao = descricao;
        }
        
        @Override
        public String toString() { // Caso não colocar isso, ira retornar "[Tarefa@15db9742, Tarefa@6d06d69c, Tarefa@7852e922]"
            return descricao; // Irá retornar [Tarefa 2, Tarefa 3, Tarefa 3]
        }
}
