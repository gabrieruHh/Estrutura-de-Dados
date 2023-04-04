package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpyty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpyty() {
//        if (reNoEntradaPilha == null) {
//            return true;
//        }
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString(){
        String  stringRetorno = "---------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "---------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null) {
                stringRetorno += "[NO{dados=" + noAuxiliar.getDado() +"}[\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;

    }
}
