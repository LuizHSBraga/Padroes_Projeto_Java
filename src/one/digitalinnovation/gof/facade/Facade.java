package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subSistema1.crm.CrmService;
import one.digitalinnovation.gof.subSistema2.cep.CepAPI;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepAPI.getInstancia().recuperarCidade(cep);
        String estado = CepAPI.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
