package app.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import app.entity.Pagamento;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class PagamentoTestService {

    @Autowired
    private PagamentoService pagamentoService;

    @Test
    public void testSavePagamento() {
        // Crie um novo pagamento para salvar
        Pagamento novoPagamento = new Pagamento();
        // Preencha os campos necessários do novo pagamento

        // Salve o pagamento
        String mensagem = pagamentoService.savePagamento(novoPagamento);

        // Verifique se o pagamento foi salvo corretamente
        assertEquals("Pagamento salvo com sucesso.", mensagem);
    }
}
