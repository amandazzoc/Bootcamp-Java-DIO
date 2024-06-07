public class PalavrasUnicas {
    String palavra;

    @Override
    public String toString() {
        return palavra;
    }

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((palavra == null) ? 0 : palavra.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PalavrasUnicas other = (PalavrasUnicas) obj;
        if (palavra == null) {
            if (other.palavra != null)
                return false;
        } else if (!palavra.equals(other.palavra))
            return false;
        return true;
    }

    public String getPalavra() {
        return palavra;
    }
}
