package principiosubstituicaodeliskov;

abstract public class CreditCard extends NubankCard{

    @Override
    public void validate() throws Exception {
        //validacao de cartao de credito
        System.out.println("Validacao de Limite");
        System.out.println("Limite OK!");
    }

}