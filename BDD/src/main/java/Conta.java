import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta{
	
	/**
	 * @author Mateus Maranhão
	 * @param arg1 Este é o primeiro parâmetro
	 * @throws Throwable
	 */
	
	
    /**
     * Inicializa um cliente especial com um saldo inicial negativo.
     *
     * @param arg1 O valor do saldo inicial negativo do cliente especial.
     * @throws Throwable
     */
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(int arg1) throws Throwable{
		throw new PendingException();
	}
	
    /**
     * Processa uma solicitação de saque na conta.
     *
     * @param arg1 O valor do saque solicitado.
     * @throws Throwable
     */
	@When("^for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(int arg1) throws Throwable{
		throw new PendingException();
	}	
	
    /**
     * Efetua o saque na conta e atualiza o saldo.
     *
     * @param arg1 O novo saldo após o saque.
     * @throws Throwable
     */
	@Then("^deve efetuar o daque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(int arg1) throws Throwable{
		throw new PendingException();
	}	
	
    /**
     * Verifica outros resultados possíveis.
     *
     * @throws Throwable
     */
	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable{
		throw new PendingException();
	}		
}