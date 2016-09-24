/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automkt;

/**
 *
 * @author Breno
 */
public class AutoMKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //param e metodos para ler linha do codigo .txt ou .html
        //linha = URL.ReadLine();
        while(true){
            if(linha.get(text) == ultima){
                break;
            }
            else{
                linha += ".com";
                testa(linha);
                linha-= ".com";
                linha+=".net";
                teste(linha);
                linha-=".net";
                linha+=".com.br";
                teste(linha);
                
                //agora testa se deu 3 strikes out
                if(strikes == 3){
                    arraylistTemPaginaDeInternetTentaPersuadirEleVaiMano.add(linha);
                    //Se conseguir adicionar direto o atributo melhor ainda
                    //Esse caso vai dar errado, ja que o cara tem as 3 paginas kkkkkkk
                }
                else if(strikes > 1){
                    arrayListNaoTemPaginaDeInternetRoubaEleLegalmenteVaiCara.add(linha);
                    //Se conseguir adicionar direto o atributo melhor ainda
                    //Tenta persuadir porque o teu site eh melhor
                }
                else if(strikes == 0){
                    arrayListEleNaoTemSiteVoceAchouAMinaDeOuro.add(linha);
                    //Vai em frente, achou o que voce queria
                }
            //Resta descobrir como fazer a conexao com a internet e requisicao para identificar o site
            //Talvez pegar uma string e cria uma conexao via socket com google e testa pra ver
            //se a url existe
            //Isso vai exigir que baixe a pagina denovo pra testar as 3 primeiras opcoes.
            
            }
        }
        
        
    }
    
}
