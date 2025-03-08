package Atv03Interface;

// Todos os métodos em Interface são abstract... isso quer dizer que o método só terá retorno
// quando for puxada em outra class
public interface Contratacao {
    // Criando métodos com parâmetro 
    public void admitir (Funcionario funcionario);
    public void demitir (Funcionario funcionario);

}
