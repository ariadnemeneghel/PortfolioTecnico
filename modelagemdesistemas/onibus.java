https://replit.com/@AriadneMarques/Onibus#Main.java

APP:
public class App{
  private String rota;
  private String previsaoEmbarque;
  private String linhas;
  private String contatoEmpresa;

public App(String rota, String previsaoEmbarque, String linhas, String contatoEmpresa){
  this.rota = rota;
  this.previsaoEmbarque = previsaoEmbarque;
  this.linhas = linhas;
  this.contatoEmpresa = contatoEmpresa;
  }

public boolean mostrarRotas(String rota){
  return true;
  }
public boolean mostrarLinhas (String linhas){
  return true;
  }
public void cairApp (){
  }
public void atualizar (){
  }
}

CartaoOnibus:
public class CartaoOnibus{
  private String foto3x4;
  private String declaracaoEscolariedade;
  private String saldo;

public CartaoOnibus(String foto3x4, String declaraoEscolariedade, String saldo){
  this.foto3x4 = foto3x4;
  this.declaracaoEscolariedade = declaraoEscolariedade;
  this.saldo = saldo;
 }
public void perderCartao (){ 
 }
public void botarCredito (String saldo){
 }
}

Cobrador: 
public class Cobrador extends Pessoa{
  private String ctps;
  private String troco;
  private String empresa;
  private String cargaHoraria;
  private String horaExtra;
  private String salario;
  private String valeAlimentacao;
  private String valeTransporte;

public Cobrador (String nome, String cpf, String dataNasc, String contato, String ctps, String troco, String empresa, String cargaHoraria, String horaExtra, String salario, String valeAlimentacao, String valeTransporte){
  super(nome, cpf, dataNasc, contato);
  this.ctps = ctps;
  this.troco = troco;
  this.empresa = empresa;
  this.cargaHoraria = cargaHoraria;
  this.horaExtra = horaExtra;
  this.salario = salario;
  this.valeAlimentacao = valeAlimentacao;
  this.valeTransporte = valeTransporte;
  }
public void limparOnibus(){
  }
public void darTroco (String troco){
  }
public void liberarCatraca (){
  }
public void conversar (){
  }
public void baterPonto (String cargaHoraria){
  }
public boolean fazerHoraExtra (String horaExtra){
  return true;
  }
}

Empresa:
import java.util.ArrayList;

public class Empresa{
  private float lucro;
  private float gastos;
  private String gerente;
  private String contato;
  private ArrayList<Onibus> onibus;

public Empresa (float lucro, float gastos, String gerente, String contato){
  this.lucro = lucro;
  this.gastos = gastos;
  this.gerente = gerente;
  this.contato = contato;
  }
public void verificarOnibus (String gerente){
  }
public boolean contratarMotorista (String gerente){
  return true;
  }
public boolean contratarCobrador (String gerente){
  return true;
  } 
public void comprarOnibus (float gastos, String gerente){
  }
}

ESTACAO:
import java.util.ArrayList;

public class Estacao{
  private String contato;
  private String local;
  private String estacionamento;
  private int lojaAlimentacao;
  private int lojaDiversos;
  private int pontoTaxi;
  private int banco;
  private int telefonePublico;
  private int banheiro;
  private float orcamento;
  private float despesas;
  private int lotacao;
  private ArrayList<String> sistemaSeguranca;
  private ArrayList<Pessoa> pessoa;
  private ArrayList<String> transporte;

public Estacao (String contato, String local, String estacionamento, int lojaAlimentacao, int lojaDiversos, int pontoTaxi, int banco, int telefonePublico, int banheiro, float orcamento, float despesas, int lotacao){
  }
}

FUNCIONARIO: 
public class Funcionario extends Pessoa{
  private String ctps;
  private String troco;
  private String cargaHoraria;
  private String horaExtra;
  private String salario;
  private String valeAlimentacao;
  private String valeTransporte;

public Funcionario (String nome, String cpf, String dataNasc, String contato, String ctps, String troco, String cargaHoraria, String horaExtra, String salario, String valeAlimentacao, String valeTransporte){
  super(nome, cpf, dataNasc, contato);
  this.ctps = ctps;
  this.troco = troco;
  this.cargaHoraria = cargaHoraria;
  this.horaExtra = horaExtra;
  this.salario = salario;
  this.valeAlimentacao = valeAlimentacao;
  this.valeTransporte = valeTransporte;
  }
public void limparEstacao (){
  }
public void venderComida (){
  }
public void venderDiversos (){
  }
public void conversar (){
  }
public void orientarPessoas (){
  }
public boolean fazerHoraExtra (String horaExtra){
  return true;
  }
public void baterPonto (String cargaHoraria){
  }
}
MOTORISTA: 
public class Motorista extends Pessoa{
  private String cnhtipoD;
  private String ctps;
  private String empresa;
  private String cargaHoraria;
  private String horaExtra;
  private String salario;
  private String valeAlimentacao;
  private String valeTransporte;

public Motorista (String nome, String cpf, String dataNasc, String contato, String cnhtipoD, String ctps, String empresa, String cargaHoraria, String horaExtra, String salario, String valeAlimentacao, String valeTransporte){
  super(nome, cpf, dataNasc, contato);
  this.cnhtipoD = cnhtipoD;
  this.ctps = ctps;
  this.cargaHoraria = cargaHoraria;
  this.horaExtra = horaExtra;
  this.salario = salario;
  this.valeAlimentacao = valeAlimentacao;
  this.valeTransporte = valeTransporte;
  }

public void dirigir (String cnhtipoD){
  }
public void manobrar (String cnhtipoD){
  }
public void primeirosSocorros (){
  }
public void baterOnibus (String cnhtipoD){
  }
public void descobrirRotas (String cnhtipoD){
  }
public boolean verificarOnibus (){
  return true;
  }
public void trasportarPessoas (String cnhtipoD){
  }
public void conversar (){
  }
public boolean fazerHoraExtra (String horaExtra){
  return true;
  }
public void baterPonto (String cargaHoraria){
  }
public void pararnoPonto (String cnhtipoD, String ctps){
  }
}
  
ONIBUS:
import java.util.ArrayList;

public class Onibus{
  private String porta;
  private String escada;
  private boolean elavadorCadeirante;
  private int janela;
  private boolean extintor;
  private int saidaDeEmergencia;
  private int bancos;
  private String catraca;
  private boolean cortina;
  private boolean wifi;
  private boolean tv;
  private boolean arCondicionado;
  private String espelhoCircular;
  private int lotacao;
  private String lixeira;
  private boolean portaGuardaChuva;
  private String tetoSolar;
  private boolean articulado;
  private String maquinaCartao;
  private ArrayList<Cobrador> cobrador;
  private ArrayList<Motorista> motorista;

public Onibus(String porta, String escada, boolean elevadorCadeirante, int janela, boolean extintor, int saidaDeEmergencia, int bancos, String catraca, boolean cortina, boolean wifi, boolean tv, boolean arCondicionado, String espelhoCircular, int lotacao, String lixeira, boolean portaGuardaChuva, String tetoSolar, boolean articulado, String maquinaCartao){
  this.porta = porta;
  this.escada = escada;
  this.elavadorCadeirante = elevadorCadeirante;
  this.janela = janela;
  this.extintor = extintor;
  this.saidaDeEmergencia = saidaDeEmergencia;
  this.bancos = bancos;
  this.catraca = catraca;
  this.cortina = cortina;
  this.wifi = wifi;
  this.tv = tv;
  this.arCondicionado = arCondicionado;
  this.espelhoCircular = espelhoCircular;
  this.lotacao = lotacao;
  this.lixeira = lixeira;
  this.portaGuardaChuva = portaGuardaChuva;
  this.tetoSolar = tetoSolar;
  this.articulado = articulado;
  this.maquinaCartao = maquinaCartao;
  }
public boolean elevadorCadeirante (boolean elevadorCadeirante){
  return true;
  }
public boolean extintor (boolean extintor){
  return true;
  }
public boolean cortina (boolean cortina){
  return true;
  }
public boolean wifi (boolean wifi){
  return true;
  }
public boolean tv (boolean tv){
  return true;
  }
public boolean arCondicionado (boolean arCondicionado){
  return true;
  }
public boolean portaGuardaChuva (boolean portaGuardaChuva){
  return true;
  }
public boolean articulado (boolean articulado){
  return true;
  }
public void revisao (String porta, String escada, boolean elevadorCadeirante, int janela, boolean extintor, int saidaDeEmergencia, int bancos, String catraca, boolean cortina, boolean wifi, boolean tv, boolean arCondicionado, String espelhoCircular, boolean portaGuardaChuva, String tetoSolar, boolean articulado, String maquinaCartao){
  }
public void limpeza (String porta, String escada, boolean elevadorCadeirante, int janela, int bancos, String catraca, boolean arCondicionado, String espelhoCircular, String lixeira){
  }
public void estragar (String porta, String escada, boolean elevadorCadeirante, int janela, boolean extintor, int saidaDeEmergencia, int bancos, String catraca, boolean cortina, boolean wifi, boolean tv, boolean arCondicionado, String espelhoCircular, boolean portaGuardaChuva, String tetoSolar, boolean articulado, String maquinaCartao){
  }
public void acabarGasolina(){
  }
public void abastecer(){
  }
}
PASSAGEIRO:
public class Passageiro extends Pessoa{
  private String carteiraOnibus;
  private int dinheiro;

public Passageiro (String nome, String cpf, String dataNasc, String contato, String carteiraOnibus, int dinheiro){
  super(nome, cpf, dataNasc, contato);
  this.carteiraOnibus = carteiraOnibus;
  this.dinheiro = dinheiro;
  }
public void pagarPassagem (String carteiraOnibus){
  }
public void pagarPassagem (int dinheiro){
  }
public void sentarNoBanco (){
  }
public void cederLugar (){
  }
public void perderOnibus (){
  }
public void dormirNoOnibus (){
  }
public void passarMal (){
  }
public void pegarOnibusErrado (){
  }
public void naoDescerNoPonto (){
  }
public void conversar (){
  }
}
PESSOA:
public class Pessoa{
  private String nome;
  private String cpf;
  private String dataNasc;
  private String contato;

public Pessoa(String nome, String cpf, String dataNasc, String contato){
  this.nome= nome;
  this.cpf = cpf;
  this.dataNasc = dataNasc;
  this.contato = contato;
 }
public void cadastrar(String nome, String cpf, String dataNasc, String contato){ 
 }
public boolean verificarOnibus(){
  return true;
 }
public void entrarnoOnibus(){  
 }
}
PONTO:
public class Ponto{
  private String cobertura;
  private String banco;
  private boolean placaInformativa;
  private boolean lixeira; 

  public Ponto (String cobertura, String banco, boolean placaInformativa, boolean lixeira){
    this.cobertura = cobertura;
    this.banco = banco;
    this.placaInformativa = placaInformativa;
    this.lixeira = lixeira;
  }
public boolean placaInformativa (boolean placaInformativa){
  return true;
  }
public boolean lixeira (boolean lixeira){
  return true;
  }
public void quabrarCobertura (String cobertura){
  }
public void quebrarBanco (String banco){
  }
public void limpar (String banco, boolean lixeira){
  }
public void abrigo (){
  }
}
ROTA:
public class Rota{
  private Motorista motorista;
  private String ponto;
  private String saida;
  private String chegada;
  private String parada;

public Rota (Motorista motorista, String ponto, String saida, String chegada, String parada){
  this.motorista = motorista;
  this.ponto = ponto;
  this.saida = saida;
  this.chegada = chegada;
  this.parada = parada;
  }
}
