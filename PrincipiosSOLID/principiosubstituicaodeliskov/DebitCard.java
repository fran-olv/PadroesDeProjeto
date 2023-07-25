package principiosubstituicaodeliskov;

abstract public class DebitCard extends NubankCard{
    @Override
    public void validate() throws Exception {
        //validacao de cartao de credito
        System.out.println("Verificação de Saldo");
        System.out.println("Saldo disponivel OK!");
    }
}