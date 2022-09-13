public class Pilha {
    private int numElementos;
    private Object[] vetor;

    public Pilha(int num) {
        this.vetor = new Object[num];
    }

    public void adicionar(Object o) {
        try {
            this.vetor[numElementos] = o;
            numElementos++;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
            return;
        }
    }

    public Object remover() {
        Object o = this.vetor[numElementos];
        this.vetor[numElementos] = null;
        numElementos--;
        return o;
    }

    public int getNumElementos() {
        return numElementos;
    }
}
