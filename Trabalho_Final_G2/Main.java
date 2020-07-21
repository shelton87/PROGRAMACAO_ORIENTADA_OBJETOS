package Trabalho_Final_G2;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		// Vari�veis
		boolean ret, retMed, retPerf, retCosm, retHP, retInf, retSS;
		String menuPrin, menuFunc=null, menuCliente=null, menuForn=null, menuProd=null, menuCaixa=null;
		
		// Mapa Funcion�rios
		HashMap<Long,Funcionario> mapaFuncionario = new HashMap<Long,Funcionario>();
		// Mapa Clientes
		HashMap<Long,Cliente> mapaCliente = new HashMap<Long,Cliente>();
		// Mapa Fornecedores
		HashMap<String,Fornecedor> mapaFornecedor = new HashMap<String,Fornecedor>();
		// Mapa Medicamento
		HashMap<String,Medicamento> mapaMedicamento = new HashMap<String,Medicamento>();
		// Mapa Perfumaria
		HashMap<String,Perfumaria> mapaPerfumaria = new HashMap<String,Perfumaria>();
		// Mapa Cosm�tico
		HashMap<String,Cosmetico> mapaCosmetico = new HashMap<String,Cosmetico>();
		// Mapa Higiene Pessoal
		HashMap<String,HigienePessoal> mapaHigienePessoal = new HashMap<String,HigienePessoal>();
		// Mapa Infantil
		HashMap<String,Infantil> mapaInfantil = new HashMap<String,Infantil>();
		// Mapa Sexy Shop
		HashMap<String,SexyShop> mapaSexyShop = new HashMap<String,SexyShop>();

		// Verifica��o da op��o inserida no menu
		do {
			// Menu Principal *******************************************************************
			menuPrin = JOptionPane.showInputDialog("**************************************"
					+ "\n****** PHARMACY SYSTEM *******"
					+ "\n**************************************"
					+ "\nBem Vindo ao Pharmacy System.\n\n1 - Funcion�rio\n2 - Cliente"
					+ "\n3 - Fornecedor\n4 - Produto\n5 - Caixa\n6 - Sair");
			if(Integer.parseInt(menuPrin) < 1 || Integer.parseInt(menuPrin) > 6) {
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida.");
			}
			
			// FUNCION�RIO *********************************************************************		
			if (Integer.parseInt(menuPrin) == 1) {
				do {					
					// Menu Funcion�rio
					menuFunc = JOptionPane.showInputDialog("Funcion�rio\n\n1 - Cadastrar\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
					
					// Verifica��o da op��o inserida
					do {
						if(Integer.parseInt(menuFunc) < 1 || Integer.parseInt(menuFunc) > 4) {
							menuFunc = JOptionPane.showInputDialog("Op��o Inv�lida.\nFuncion�rio\n\n1 - Cadastrar"
									+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");					
						}
					} while(Integer.parseInt(menuFunc) < 1 || Integer.parseInt(menuFunc) > 4);
					
					// Cadastrar
					if(Integer.parseInt(menuFunc) == 1) {
						
						Funcionario funcionario = new Funcionario(JOptionPane.showInputDialog("Funcion�rio\nNome: "));
						funcionario.setTelefone(JOptionPane.showInputDialog("Funcion�rio\nTelefone: "));
						
						Endereco endereco = new Endereco(JOptionPane.showInputDialog("Funcion�rio - Endere�o\n"
								+ "Logradouro: "));
						endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Funcion�rio - "
								+ "Endere�o\nN�mero: ")));
						endereco.setBairro(JOptionPane.showInputDialog("Funcion�rio - Endere�o\nBairro: "));
						endereco.setCidade(JOptionPane.showInputDialog("Funcion�rio - Endere�o\nCidade: "));
						endereco.setCEP(JOptionPane.showInputDialog("Funcion�rio - Endere�o\nCEP: "));				
						funcionario.setEndereco(endereco);
						
						DocPessoal docPessoal = new DocPessoal(Long.parseLong(JOptionPane.showInputDialog(""
								+ "Funcion�rio\nCPF: ")));
						docPessoal.setRG(Integer.parseInt(JOptionPane.showInputDialog("Funcion�rio\n"
								+ "N�mero Doc. Identidade: ")));
						docPessoal.setDtNasc(JOptionPane.showInputDialog("Funcion�rio\nData Nascimento: "));
						funcionario.setDocPessoal(docPessoal);
						
						funcionario.setCargo(JOptionPane.showInputDialog("Funcion�rio\nCargo: "));
						funcionario.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Funcion�rio\n"
								+ "Sal�rio: ")));
						
						Conta conta = new Conta(JOptionPane.showInputDialog("Funcion�rio\nNome do banco: "));
						conta.setAgencia(Integer.parseInt(JOptionPane.showInputDialog("Funcion�rio\nN�mero"
								+ " da ag�ncia: ")));
						conta.setNumConta(Integer.parseInt(JOptionPane.showInputDialog("Funcion�rio\nN�mero"
								+ " da conta: ")));
						funcionario.setConta(conta);
						
						// Adicionando funcion�rio no mapa
						mapaFuncionario.put(funcionario.getDocPessoal().getCPF(),funcionario);
						
					}//Final Cadastrar - Funcion�rio
					
					// Pesquisar - Funcion�rio
					if(Integer.parseInt(menuFunc) == 2) {
						if(mapaFuncionario.isEmpty()) {
							JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
						} else {
							String lista = "";
							for(long valor : mapaFuncionario.keySet()) {								
								lista = lista + Long.toString(mapaFuncionario.get(valor).getDocPessoal().getCPF()) + " - " + 
									mapaFuncionario.get(valor).getNome() + "\n";
							}							
							long escolha = Long.parseLong(JOptionPane.showInputDialog("\nDigite o CPF do funcion�rio "
									+ "para buscar mais informa��es:\n" + lista));		
								
							ret = mapaFuncionario.containsKey(escolha);
								
							if(ret == true) {
								Funcionario pessoa = mapaFuncionario.get(escolha);
								pessoa.informacao(pessoa);
							}else {
								JOptionPane.showMessageDialog(null,"CPF informado n�o consta.");
							}
						}
					}// Final Pesquisar - Funcion�rio
					
					// Apagar - Funcion�rio
					if(Integer.parseInt(menuFunc) == 3) {
						if(mapaFuncionario.isEmpty()) {
							JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
						} else {
							String lista = "";
							for(long valor : mapaFuncionario.keySet()) {								
								lista = lista + Long.toString(mapaFuncionario.get(valor).getDocPessoal().getCPF()) + " - " + 
									mapaFuncionario.get(valor).getNome() + "\n";
							}
							long escolha = Long.parseLong(JOptionPane.showInputDialog("\nDigite o CPF do funcion�rio "
								+ "para apagar os dados cadastrais:\n" + lista));		
									
							ret = mapaFuncionario.containsKey(escolha);
									
							if(ret == true) {
								mapaFuncionario.remove(escolha);
								JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
							}else {
								JOptionPane.showMessageDialog(null,"CPF informado n�o consta.");
							}
						}
					}// Final Apagar - Funcion�rio					
				}while(Integer.parseInt(menuFunc) != 4);				
			}// Final FUNCION�RIO
			
			// CLIENTE *********************************************************************
			if (Integer.parseInt(menuPrin) == 2) {
				do {
					// Menu Cliente
					menuCliente = JOptionPane.showInputDialog("Cliente\n\n1 - Cadastrar\n2 - Pesquisar"
						+ "\n3 - Apagar\n4 - Sair");
								
					// Verifica��o da op��o inserida
					do {
						if(Integer.parseInt(menuCliente) < 1 || Integer.parseInt(menuCliente) > 4) {
							menuCliente = JOptionPane.showInputDialog("Op��o Inv�lida.\nCliente\n\n1 - Cadastrar"
									+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");					
						}
					} while(Integer.parseInt(menuCliente) < 1 || Integer.parseInt(menuCliente) > 4);
				
					// Cadastrar - Cliente
					if(Integer.parseInt(menuCliente) == 1) {
									
						Cliente cliente = new Cliente(JOptionPane.showInputDialog("Cliente\n"
								+ "Nome: "));
						cliente.setTelefone(JOptionPane.showInputDialog("Cliente\nTelefone: "));
									
						Endereco endereco = new Endereco(JOptionPane.showInputDialog("Cliente - Endere�o\n"
								+ "Logradouro: "));
						endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Cliente - "
								+ "Endere�o\nN�mero: ")));
						endereco.setBairro(JOptionPane.showInputDialog("Cliente - Endere�o\nBairro: "));
						endereco.setCidade(JOptionPane.showInputDialog("Cliente - Endere�o\nCidade: "));
						endereco.setCEP(JOptionPane.showInputDialog("Cliente - Endere�o\nCEP: "));				
						cliente.setEndereco(endereco);
						
						DocPessoal docPessoal = new DocPessoal(Long.parseLong(JOptionPane.showInputDialog(""
								+ "Cliente\nCPF: ")));
						docPessoal.setRG(Integer.parseInt(JOptionPane.showInputDialog("Cliente\n"
								+ "N�mero Doc. Identidade: ")));
						docPessoal.setDtNasc(JOptionPane.showInputDialog("Cliente\nData Nascimento: "));
						cliente.setDocPessoal(docPessoal);	
									
						// Adicionando cliente no mapa
						mapaCliente.put(cliente.getDocPessoal().getCPF(),cliente);
									
					}//Final Cadastrar - Cliente
					
					// Pesquisar - Cliente
					if(Integer.parseInt(menuCliente) == 2) {
						if(mapaCliente.isEmpty()) {
							JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
						} else {
							String lista = "";
							for(long valor : mapaCliente.keySet()) {								
								lista = lista + Long.toString(mapaCliente.get(valor).getDocPessoal().getCPF()) + " - " + 
									mapaCliente.get(valor).getNome() + "\n";
							}
							long escolha = Long.parseLong(JOptionPane.showInputDialog("\nDigite o CPF do cliente para  "
									+ "buscar mais informa��es:\n" + lista));		
							
							ret = mapaCliente.containsKey(escolha);
							
							if(ret == true) {
								Cliente pessoa = mapaCliente.get(escolha);
								pessoa.informacao(pessoa);
							}else {
								JOptionPane.showMessageDialog(null,"CPF informado n�o consta.");
							}
						}
					}// Final Pesquisar - Cliente
					
					// Apagar - Cliente
					if(Integer.parseInt(menuCliente) == 3) {
						if(mapaCliente.isEmpty()) {
							JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
						} else {
							String lista = "";
							for(long valor : mapaCliente.keySet()) {								
								lista = lista + Long.toString(mapaCliente.get(valor).getDocPessoal().getCPF()) + " - " + 
									mapaCliente.get(valor).getNome() + "\n";
							}
							long escolha = Long.parseLong(JOptionPane.showInputDialog("\nDigite o CPF do cliente "
									+ "para apagar os dados cadastrais:\n" + lista));		
							
							ret = mapaCliente.containsKey(escolha);
							
							if(ret == true) {
								mapaCliente.remove(escolha);
								JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
							}else {
								JOptionPane.showMessageDialog(null,"CPF informado n�o consta.");
							}
						}
					}// Final Apagar - Cliente					
				}while(Integer.parseInt(menuCliente) != 4);				
			}// Final CLIENTE
			
			// FORNECEDOR *********************************************************************		
			if (Integer.parseInt(menuPrin) == 3) {
				do {
					// Menu Fornecedor
					menuForn = JOptionPane.showInputDialog("Fornecedor\n\n1 - Cadastrar\n2 - Pesquisar"
							+ "\n3 - Apagar\n4 - Sair");
					
					// Verifica��o da op��o inserida
					do {
						if(Integer.parseInt(menuForn) < 1 || Integer.parseInt(menuForn) > 4) {
							menuForn = JOptionPane.showInputDialog("Op��o Inv�lida.\nFornecedor\n\n1 - Cadastrar"
									+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");					
						}
					} while(Integer.parseInt(menuForn) < 1 || Integer.parseInt(menuForn) > 4);
					
					// Cadastrar - Fornecedor
					if(Integer.parseInt(menuForn) == 1) {
						
						Fornecedor fornecedor = new Fornecedor(JOptionPane.showInputDialog("Fornecedor\n"
								+ "Raz�o Social: "));
						fornecedor.setTelefone(JOptionPane.showInputDialog("Fornecedor\nTelefone: "));
						fornecedor.setCNPJ(JOptionPane.showInputDialog("Fornecedor\nCNPJ: "));
						fornecedor.setFornecedorDe("Fornecedor de que tipo de produto: ");
						
						Endereco endereco = new Endereco(JOptionPane.showInputDialog("Fornecedor - Endere�o\n"
								+ "Logradouro: "));
						endereco.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Fornecedor - "
								+ "Endere�o\nN�mero: ")));
						endereco.setBairro(JOptionPane.showInputDialog("Fornecedor - Endere�o\nBairro: "));
						endereco.setCidade(JOptionPane.showInputDialog("Fornecedor - Endere�o\nCidade: "));
						endereco.setCEP(JOptionPane.showInputDialog("Fornecedor - Endere�o\nCEP: "));				
						fornecedor.setEndereco(endereco);
						
						// Adicionando fornecedor no mapa
						mapaFornecedor.put(fornecedor.getCNPJ(),fornecedor);
						
					}//Final Cadastrar - Fornecedor
					
					// Pesquisar - Fornecedor
					if(Integer.parseInt(menuForn) == 2) {
						if(mapaFornecedor.isEmpty()) {
							JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
						} else {
							String lista = "";
							for(String valor : mapaFornecedor.keySet()) {								
								lista = lista + mapaFornecedor.get(valor).getCNPJ() + " - " + 
										mapaFornecedor.get(valor).getRazaoSocial() + "\n";
							}
							String escolha = JOptionPane.showInputDialog("\nDigite o CNPJ do fornecedor para  "
									+ "buscar mais informa��es:\n" + lista);		
							
							ret = mapaFornecedor.containsKey(escolha);
							
							if(ret == true) {
								Fornecedor pessoa = mapaFornecedor.get(escolha);
								pessoa.informacao(pessoa);
							}else {
								JOptionPane.showMessageDialog(null,"CNPJ informado n�o consta.");
							}
						}
					}// Final Pesquisar - Fornecedor
					
					// Apagar - Fornecedor
					if(Integer.parseInt(menuForn) == 3) {
						if(mapaFornecedor.isEmpty()) {
							JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
						} else {
							String lista = "";
							for(String valor : mapaFornecedor.keySet()) {								
								lista = lista + mapaFornecedor.get(valor).getCNPJ() + " - " + 
										mapaFornecedor.get(valor).getRazaoSocial() + "\n";
							}
							String escolha = JOptionPane.showInputDialog("\nDigite o CNPJ do fornecedor "
									+ "para apagar os dados cadastrais:\n" + lista);		
							
							ret = mapaFornecedor.containsKey(escolha);
							
							if(ret == true) {
								mapaFornecedor.remove(escolha);
								JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
							}else {
								JOptionPane.showMessageDialog(null,"CNPJ informado n�o consta.");
							}
						}		
					}// Final Apagar - Fornecedor					
				}while(Integer.parseInt(menuForn) != 4);
			}// Final FORNECEDOR
			
			// PRODUTO *********************************************************************		
			if (Integer.parseInt(menuPrin) == 4) {
				do {
					// Menu Produto
					menuProd = JOptionPane.showInputDialog("Produto\n\n1 - Medicamento\n2 - Perfumaria"
							+ "\n3 - Cosm�tico\n4 - Higiene Pessoal\n5 - Infantil\n6 - Sexy Shop\n7 - Sair");
					
					// Verifica��o da op��o inserida
					do {
						if(Integer.parseInt(menuProd) < 1 || Integer.parseInt(menuProd) > 7) {
							menuProd = JOptionPane.showInputDialog("Op��o Inv�lida.\nProduto\n\n1 - Medicamento"
									+ "\n2 - Perfumaria\n3 - Cosm�tico\n4 - Higiene Pessoal\n5 - Infantil"
									+ "\n6 - Sexy Shop\n7 - Sair");
						}
					} while(Integer.parseInt(menuProd) < 1 || Integer.parseInt(menuProd) > 7);
					
					// Medicamento ######################
					if(Integer.parseInt(menuProd) == 1) {
						String menuMed;
						do {
							// Menu Medicamento
							menuMed = JOptionPane.showInputDialog("Medicamento\n\n1 - Cadastrar\n2 - Pesquisar"
									+ "\n3 - Apagar\n4 - Sair");
							
							// Verifica��o op��o Medicamento
							do {
								if(Integer.parseInt(menuMed) < 1 || Integer.parseInt(menuMed) > 4) {
									menuMed = JOptionPane.showInputDialog("Op��o Inv�lida.\nMedicamento\n\n1 - Cadastrar"
											+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
								}
							} while(Integer.parseInt(menuProd) < 1 || Integer.parseInt(menuProd) > 4);
							
							// Cadastrar Medicamento
							if(Integer.parseInt(menuMed) == 1) {
								
								Medicamento medicamento = new Medicamento();
								medicamento.setNome(JOptionPane.showInputDialog("Medicamento\nNome: "));
								medicamento.setFabricante(JOptionPane.showInputDialog("Medicamento\nFabricante: "));
								medicamento.setDataValidade(JOptionPane.showInputDialog("Medicamento\nData de validade: "));
								medicamento.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Medicamento\nPre�o: ")));
								medicamento.setTipoMedicamento(JOptionPane.showInputDialog("Medicamento\n� Refer�ncia, "
										+ "Gen�rico ou Similar? "));
								medicamento.setTipoTarja(JOptionPane.showInputDialog("Medicamento\n� tarja vermelha, "
										+ "preta ou sem tarja? "));
								
								// Adicionando medicamento no mapa
								mapaMedicamento.put(medicamento.getNome(),medicamento);					
							}// Final Cadastrar Medicamento
							
							// Pesquisar Medicamento
							if(Integer.parseInt(menuMed) == 2) {
								if(mapaMedicamento.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
								} else {
									String lista = "";
									for(String valor : mapaMedicamento.keySet()) {								
										lista = lista + mapaMedicamento.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do medicamento para  "
											+ "buscar mais informa��es:\n" + lista);		
											
										ret = mapaMedicamento.containsKey(escolha);
											
										if(ret == true) {
											Medicamento produto = mapaMedicamento.get(escolha);
											produto.informacao(produto);
										}else {
											JOptionPane.showMessageDialog(null,"Medicamento informado n�o consta.");
										}
								}
							}// Final Pesquisar Medicamento
							
							// Apagar Medicamento
							if(Integer.parseInt(menuMed) == 3) {
								if(mapaMedicamento.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
								} else {
									String lista = "";
									for(String valor : mapaMedicamento.keySet()) {								
										lista = lista + mapaMedicamento.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do medicamento "
											+ "para apagar os dados cadastrais:\n" + lista);		
										
										ret = mapaMedicamento.containsKey(escolha);
											
										if(ret == true) {
											mapaMedicamento.remove(escolha);
											JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
										}else {
											JOptionPane.showMessageDialog(null,"Medicamento informado n�o consta.");
										}
								}
							}// Final Apagar Medicamento
						}while(Integer.parseInt(menuMed) != 4);						
					}//Final Medicamento
					
					// Perfumaria ######################
					if(Integer.parseInt(menuProd) == 2) {
						String menuPerf;
						do {
							// Menu Perfumaria
							menuPerf = JOptionPane.showInputDialog("Perfumaria\n\n1 - Cadastrar\n2 - Pesquisar"
									+ "\n3 - Apagar\n4 - Sair");
							
							// Verifica��o op��o Perfumaria
							do {
								if(Integer.parseInt(menuPerf) < 1 || Integer.parseInt(menuPerf) > 4) {
									menuPerf = JOptionPane.showInputDialog("Op��o Inv�lida.\nPerfumaria\n\n1 - Cadastrar"
											+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
								}
							} while(Integer.parseInt(menuPerf) < 1 || Integer.parseInt(menuPerf) > 4);
							
							// Cadastrar Perfumaria
							if(Integer.parseInt(menuPerf) == 1) {
								
								Perfumaria perfumaria = new Perfumaria();
								perfumaria.setNome(JOptionPane.showInputDialog("Perfumaria\nNome: "));
								perfumaria.setFabricante(JOptionPane.showInputDialog("Perfumaria\nFabricante: "));
								perfumaria.setDataValidade(JOptionPane.showInputDialog("Perfumaria\nData de validade: "));
								perfumaria.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Perfumaria\nPre�o: ")));
								perfumaria.seteDesodorante(Boolean.parseBoolean(JOptionPane.showInputDialog("Perfumaria\n"
										+ "� desodorante? Digite 'true' para sim ou 'false' para n�o ")));
								if(perfumaria.iseDesodorante() == false) {
									perfumaria.setePerfume(Boolean.parseBoolean(JOptionPane.showInputDialog("Perfumaria\n"
										+ "� perfume? Digite 'true' para sim ou 'false' para n�o ")));
								}
								// Adicionando perfumaria no mapa
								mapaPerfumaria.put(perfumaria.getNome(),perfumaria);					
							}// Final Cadastrar Perfumaria
							
							// Pesquisar Perfumaria
							if(Integer.parseInt(menuPerf) == 2) {	
								if(mapaPerfumaria.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
								} else {
									String lista = "";
									for(String valor : mapaPerfumaria.keySet()) {								
										lista = lista + mapaPerfumaria.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome da perfumaria para  "
											+ "buscar mais informa��es:\n" + lista);		
										
										ret = mapaPerfumaria.containsKey(escolha);
											
										if(ret == true) {
											Perfumaria produto = mapaPerfumaria.get(escolha);
											produto.informacao(produto);
										}else {
											JOptionPane.showMessageDialog(null,"Perfumaria informada n�o consta.");
										}
								}
							}// Final Pesquisar Perfumaria
							
							// Apagar Perfumaria
							if(Integer.parseInt(menuPerf) == 3) {
								if(mapaPerfumaria.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
								} else {
									String lista = "";
									for(String valor : mapaPerfumaria.keySet()) {								
										lista = lista + mapaPerfumaria.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome da perfumaria "
											+ "para apagar os dados cadastrais:\n" + lista);		
											
										ret = mapaPerfumaria.containsKey(escolha);
											
										if(ret == true) {
											mapaPerfumaria.remove(escolha);
											JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
										}else {
											JOptionPane.showMessageDialog(null,"Perfumaria informada n�o consta.");
										}
								}
							}// Final Apagar Perfumaria
						}while(Integer.parseInt(menuPerf) != 4);						
					}//Final Perfumaria
					
					// Cosm�tico ######################
					if(Integer.parseInt(menuProd) == 3) {
						String menuCosm;
						do {
							// Menu Cosm�tico
							menuCosm = JOptionPane.showInputDialog("Cosm�tico\n\n1 - Cadastrar\n2 - Pesquisar"
									+ "\n3 - Apagar\n4 - Sair");
							
							// Verifica��o op��o Cosm�tico
							do {
								if(Integer.parseInt(menuCosm) < 1 || Integer.parseInt(menuCosm) > 4) {
									menuCosm = JOptionPane.showInputDialog("Op��o Inv�lida.\nCosm�tico\n\n1 - Cadastrar"
											+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
								}
							} while(Integer.parseInt(menuCosm) < 1 || Integer.parseInt(menuCosm) > 4);
							
							// Cadastrar Cosm�tico
							if(Integer.parseInt(menuCosm) == 1) {
								
								Cosmetico cosmetico = new Cosmetico();
								cosmetico.setNome(JOptionPane.showInputDialog("Cosm�tico\nNome: "));
								cosmetico.setFabricante(JOptionPane.showInputDialog("Cosm�tico\nFabricante: "));
								cosmetico.setDataValidade(JOptionPane.showInputDialog("Cosm�tico\nData de validade: "));
								cosmetico.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Cosm�tico\nPre�o: ")));
								cosmetico.seteHidratante(Boolean.parseBoolean(JOptionPane.showInputDialog("Cosm�tico\n"
										+ "� hidratante? Digite 'true' para sim ou 'false' para n�o ")));
								if(cosmetico.iseHidratante() == false) {
									cosmetico.seteMaquiagem(Boolean.parseBoolean(JOptionPane.showInputDialog("Cosm�tico\n"
										+ "� maquiagem? Digite 'true' para sim ou 'false' para n�o ")));
								} else if((cosmetico.iseHidratante() == false)&&(cosmetico.iseMaquiagem() == false)) {
									cosmetico.seteEsmalte(Boolean.parseBoolean(JOptionPane.showInputDialog("Cosm�tico\n"
										+ "� esmalte? Digite 'true' para sim ou 'false' para n�o ")));
								}else if ((cosmetico.iseHidratante() == false)&&(cosmetico.iseMaquiagem() == false)&&(cosmetico.iseEsmalte() == false)) {
									cosmetico.seteTintaCabelo(Boolean.parseBoolean(JOptionPane.showInputDialog("Cosm�tico\n"
										+ "� tinta para cabelo? Digite 'true' para sim ou 'false' para n�o ")));
								}
								// Adicionando cosm�tico no mapa
								mapaCosmetico.put(cosmetico.getNome(),cosmetico);					
							}// Final Cadastrar Cosm�tico
							
							// Pesquisar Cosm�tico
							if(Integer.parseInt(menuCosm) == 2) {
								if(mapaCosmetico.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
								} else {
									String lista = "";
									for(String valor : mapaCosmetico.keySet()) {								
										lista = lista + mapaCosmetico.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do cosm�tico para  "
											+ "buscar mais informa��es:\n" + lista);		
											
										ret = mapaCosmetico.containsKey(escolha);
											
										if(ret == true) {
											Cosmetico produto = mapaCosmetico.get(escolha);
											produto.informacao(produto);
										}else {
											JOptionPane.showMessageDialog(null,"Cosm�tico informado n�o consta.");
										}
								}
							}// Final Pesquisar Cosm�tico
							
							// Apagar Cosm�tico
							if(Integer.parseInt(menuCosm) == 3) {
								if(mapaCosmetico.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
								} else {
									String lista = "";
									for(String valor : mapaCosmetico.keySet()) {								
										lista = lista + mapaCosmetico.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do cosm�tico "
											+ "para apagar os dados cadastrais:\n" + lista);		
											
										ret = mapaCosmetico.containsKey(escolha);
											
										if(ret == true) {
											mapaCosmetico.remove(escolha);
											JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
										}else {
											JOptionPane.showMessageDialog(null,"Cosm�tico informado n�o consta.");
										}
								}
							}// Final Apagar Cosm�tico
						}while(Integer.parseInt(menuCosm) != 4);						
					}//Final Cosm�tico
					
					// Higiene Pessoal ######################
					if(Integer.parseInt(menuProd) == 4) {
						String menuHP;
						do {
							// Menu Higiene Pessoal
							menuHP = JOptionPane.showInputDialog("Higiene Pessoal\n\n1 - Cadastrar\n2 - Pesquisar"
									+ "\n3 - Apagar\n4 - Sair");
							
							// Verifica��o op��o Higiene Pessoal
							do {
								if(Integer.parseInt(menuHP) < 1 || Integer.parseInt(menuHP) > 4) {
									menuHP = JOptionPane.showInputDialog("Op��o Inv�lida.\nHigiene Pessoal\n\n1 - Cadastrar"
											+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
								}
							} while(Integer.parseInt(menuHP) < 1 || Integer.parseInt(menuHP) > 4);
							
							// Cadastrar Higiene Pessoal
							if(Integer.parseInt(menuHP) == 1) {
								
								HigienePessoal hp = new HigienePessoal();
								hp.setNome(JOptionPane.showInputDialog("Higiene Pessoal\nNome: "));
								hp.setFabricante(JOptionPane.showInputDialog("Higiene Pessoal\nFabricante: "));
								hp.setDataValidade(JOptionPane.showInputDialog("Higiene Pessoal\nData de validade: "));
								hp.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Higiene Pessoal\nPre�o: ")));
								hp.seteItemBanho(Boolean.parseBoolean(JOptionPane.showInputDialog("Higiene Pessoal\n"
									+ "� item de banho? Digite 'true' para sim ou 'false' para n�o ")));
								if(hp.iseItemBanho() == false) {
									hp.seteItemBucal(Boolean.parseBoolean(JOptionPane.showInputDialog("Higiene Pessoal\n"
										+ "� item bucal? Digite 'true' para sim ou 'false' para n�o ")));
								}else if((hp.iseItemBanho() == false)&&(hp.iseItemBanho() == false)) {
									hp.setePapelHigienico(Boolean.parseBoolean(JOptionPane.showInputDialog("Higiene Pessoal\n"
										+ "� item papel higi�nico? Digite 'true' para sim ou 'false' para n�o ")));
								}								
								// Adicionando higiene pessoal no mapa
								mapaHigienePessoal.put(hp.getNome(),hp);					
							}// Final Cadastrar Higiene Pessoal
							
							// Pesquisar Higiene Pessoal
							if(Integer.parseInt(menuHP) == 2) {
								if(mapaHigienePessoal.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
								} else {
									String lista = "";
									for(String valor : mapaHigienePessoal.keySet()) {								
										lista = lista + mapaHigienePessoal.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do produto de higiene "
											+ "pessoal para buscar mais informa��es:\n" + lista);		
											
										ret = mapaHigienePessoal.containsKey(escolha);
											
										if(ret == true) {
											HigienePessoal produto = mapaHigienePessoal.get(escolha);
											produto.informacao(produto);
										}else {
											JOptionPane.showMessageDialog(null,"Produto de higiene pessoal informado "
												+ "n�o consta.");
										}
								}
							}// Final Pesquisar Higiene Pessoal
							
							// Apagar Higiene Pessoal
							if(Integer.parseInt(menuHP) == 3) {
								if(mapaHigienePessoal.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
								} else {
									String lista = "";
									for(String valor : mapaHigienePessoal.keySet()) {								
										lista = lista + mapaHigienePessoal.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do produto de "
											+ "higiene pessoal para apagar os dados cadastrais:\n" + lista);		
											
										ret = mapaHigienePessoal.containsKey(escolha);
											
										if(ret == true) {
											mapaHigienePessoal.remove(escolha);
											JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
										}else {
											JOptionPane.showMessageDialog(null,"Produto de higiene pessoal informado n�o consta.");
										}	
								}
							}// Final Apagar Higiene Pessoal
						}while(Integer.parseInt(menuHP) != 4);						
					}//Final Higiene Pessoal
					
					// Infantil ######################
					if(Integer.parseInt(menuProd) == 5) {
						String menuInf;
						do {
							// Menu Infantil
							menuInf = JOptionPane.showInputDialog("Infantil\n\n1 - Cadastrar\n2 - Pesquisar"
									+ "\n3 - Apagar\n4 - Sair");
							
							// Verifica��o op��o Infantil
							do {
								if(Integer.parseInt(menuInf) < 1 || Integer.parseInt(menuInf) > 4) {
									menuInf = JOptionPane.showInputDialog("Op��o Inv�lida.\nInfantil\n\n1 - Cadastrar"
											+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
								}
							} while(Integer.parseInt(menuInf) < 1 || Integer.parseInt(menuInf) > 4);
							
							// Cadastrar Infantil
							if(Integer.parseInt(menuInf) == 1) {
								
								Infantil infantil = new Infantil();
								infantil.setNome(JOptionPane.showInputDialog("Infantil\nNome: "));
								infantil.setFabricante(JOptionPane.showInputDialog("Infantil\nFabricante: "));
								infantil.setDataValidade(JOptionPane.showInputDialog("Infantil\nData de validade: "));
								infantil.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Infantil\nPre�o: ")));
								infantil.seteFralda(Boolean.parseBoolean(JOptionPane.showInputDialog("Infantil\n"
										+ "� fralda? Digite 'true' para sim ou 'false' para n�o ")));
								if(infantil.iseFralda() == false) {
									infantil.seteLencoUmed(Boolean.parseBoolean(JOptionPane.showInputDialog("Infantil\n"
											+ "� len�o umedecido? Digite 'true' para sim ou 'false' para n�o ")));
								}
								if((infantil.iseFralda() == false)&&(infantil.iseLencoUmed() == false)) {
									infantil.seteBico(Boolean.parseBoolean(JOptionPane.showInputDialog("Infantil\n"
											+ "� bico? Digite 'true' para sim ou 'false' para n�o ")));
								}
								if((infantil.iseFralda() == false)&&(infantil.iseLencoUmed() == false)&&(infantil.iseBico() == false)) {
									infantil.seteMamadeira(Boolean.parseBoolean(JOptionPane.showInputDialog("Infantil\n"
											+ "� mamadeira? Digite 'true' para sim ou 'false' para n�o ")));
								}								
								// Adicionando infantil no mapa
								mapaInfantil.put(infantil.getNome(),infantil);					
							}// Final Cadastrar Infantil
							
							// Pesquisar Infantil
							if(Integer.parseInt(menuInf) == 2) {
								if(mapaInfantil.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
								} else {
									String lista = "";
									for(String valor : mapaInfantil.keySet()) {								
										lista = lista + mapaInfantil.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do produto infantil "
											+ "para buscar mais informa��es:\n" + lista);		
											
										ret = mapaInfantil.containsKey(escolha);
											
										if(ret == true) {
											Infantil produto = mapaInfantil.get(escolha);
											produto.informacao(produto);									
										}else {
											JOptionPane.showMessageDialog(null,"Produto infantil informado n�o consta.");
										}
								}
							}// Final Pesquisar Infantil
							
							// Apagar Infantil
							if(Integer.parseInt(menuInf) == 3) {
								if(mapaInfantil.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
								} else {
									String lista = "";
									for(String valor : mapaInfantil.keySet()) {								
										lista = lista + mapaInfantil.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do produto infantil"
											+ "para apagar os dados cadastrais:\n" + lista);		
											
										ret = mapaInfantil.containsKey(escolha);
											
										if(ret == true) {
											mapaInfantil.remove(escolha);
											JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
										}else {
											JOptionPane.showMessageDialog(null,"Produto infantil informado n�o consta.");
										}
								}
							}// Final Apagar Infantil
						}while(Integer.parseInt(menuInf) != 4);						
					}//Final Infaltil
					
					// Sexy Shop ######################
					if(Integer.parseInt(menuProd) == 6) {
						String menuSex;
						do {
							// Menu Sexy Shop
							menuSex = JOptionPane.showInputDialog("Sexy Shop\n\n1 - Cadastrar\n2 - Pesquisar"
									+ "\n3 - Apagar\n4 - Sair");
							
							// Verifica��o op��o Sexy Shop
							do {
								if(Integer.parseInt(menuSex) < 1 || Integer.parseInt(menuSex) > 4) {
									menuSex = JOptionPane.showInputDialog("Op��o Inv�lida.\nSexy Shop\n\n1 - Cadastrar"
											+ "\n2 - Pesquisar\n3 - Apagar\n4 - Sair");
								}
							} while(Integer.parseInt(menuSex) < 1 || Integer.parseInt(menuSex) > 4);
							
							// Cadastrar Sexy Shop
							if(Integer.parseInt(menuSex) == 1) {
								
								SexyShop sexy = new SexyShop();
								sexy.setNome(JOptionPane.showInputDialog("Sexy Shop\nNome: "));
								sexy.setFabricante(JOptionPane.showInputDialog("Sexy Shop\nFabricante: "));
								sexy.setDataValidade(JOptionPane.showInputDialog("Sexy Shop\nData de validade: "));
								sexy.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Sexy Shop\nPre�o: ")));
								sexy.setePreseMasc(Boolean.parseBoolean(JOptionPane.showInputDialog("Sexy Shop\n"
										+ "� preservativo masculino? Digite 'true' para sim ou 'false' para n�o ")));
								if(sexy.isePreseMasc() == false) {
									sexy.setePreseFem(Boolean.parseBoolean(JOptionPane.showInputDialog("Sexy Shop\n"
											+ "� preservativo feminino? Digite 'true' para sim ou 'false' para n�o ")));
								}
								if((sexy.isePreseMasc() == false) && (sexy.isePreseFem() == false)) {
									sexy.seteLubrificante(Boolean.parseBoolean(JOptionPane.showInputDialog("Sexy Shop\n"
											+ "� lubrificante? Digite 'true' para sim ou 'false' para n�o ")));
								}
								// Adicionando Sexy Shop no mapa
								mapaSexyShop.put(sexy.getNome(),sexy);					
							}// Final Cadastrar Sexy Shop
							
							// Pesquisar Sexy Shop
							if(Integer.parseInt(menuSex) == 2) {
								if(mapaSexyShop.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para pesquisar.");
								} else {
									String lista = "";
									for(String valor : mapaSexyShop.keySet()) {								
										lista = lista + mapaSexyShop.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do produto sexy shop "
											+ "para buscar mais informa��es:\n" + lista);		
										
										ret = mapaSexyShop.containsKey(escolha);
											
										if(ret == true) {
											SexyShop produto = mapaSexyShop.get(escolha);
											produto.informacao(produto);									
										}else {
											JOptionPane.showMessageDialog(null,"Produto sexy shop informado n�o consta.");
										}
								}
							}// Final Pesquisar Sexy Shop
							
							// Apagar Sexy Shop
							if(Integer.parseInt(menuSex) == 3) {
								if(mapaSexyShop.isEmpty()) {
									JOptionPane.showMessageDialog(null,"N�o h� registro para apagar.");
								} else {
									String lista = "";
									for(String valor : mapaSexyShop.keySet()) {								
										lista = lista + mapaSexyShop.get(valor).getNome() + "\n";
									}
									String escolha = JOptionPane.showInputDialog("\nDigite o nome do produto sexy shop"
											+ "para apagar os dados cadastrais:\n" + lista);		
											
										ret = mapaSexyShop.containsKey(escolha);
											
										if(ret == true) {
											mapaSexyShop.remove(escolha);
											JOptionPane.showMessageDialog(null,"Registro exclu�do com sucesso.");
										}else {
											JOptionPane.showMessageDialog(null,"Produto sexy shop informado n�o consta.");
										}
								}
							}// Final Apagar Sexy Shop
						}while(Integer.parseInt(menuSex) != 4);						
					}//Final Sexy Shop					
				}while(Integer.parseInt(menuProd) != 7);				
			}// Final PRODUTO
			
			// CAIXA *********************************************************************		
			if (Integer.parseInt(menuPrin) == 5) {
				do {
					// Menu Caixa
					menuCaixa = JOptionPane.showInputDialog("Caixa\n\n1 - Efetuar a venda\n2 - Sair");
					
					// Verifica��o da op��o inserida
					do {
						if(Integer.parseInt(menuCaixa) < 1 || Integer.parseInt(menuCaixa) > 2) {
							menuCaixa = JOptionPane.showInputDialog("Op��o Inv�lida.\nCaixa\n\n1 - Efetuar a venda"
									+ "\n2 - Sair");					
						}
					} while(Integer.parseInt(menuCaixa) < 1 || Integer.parseInt(menuCaixa) > 2);
					
					//Efetuar a venda
					if (Integer.parseInt(menuCaixa) == 1) {	
						CestinhaCompra cestaCompra = new CestinhaCompra();
						String menuVenda;
						do {
							menuVenda = JOptionPane.showInputDialog("Venda\n\n1 - Adicionar Produto"
									+ "\n2 - Finalizar Venda\n3 - Sair");
							
							// Mensagem de Op��o Inv�lida
							if((Integer.parseInt(menuVenda)<1)||(Integer.parseInt(menuVenda)>3)) {
								JOptionPane.showMessageDialog(null, "Op��o Inv�lida.");
							}
							
							// Lista com todos os produtos que est�o cadastrados no sistema
							if(Integer.parseInt(menuVenda)==1) {
								String listaProdutos = "";
								if(!mapaMedicamento.isEmpty()) {									
									for(String valor : mapaMedicamento.keySet()) {								
										listaProdutos = listaProdutos + mapaMedicamento.get(valor).getNome() + "\n";
									}
								} 
								if(!mapaPerfumaria.isEmpty()) {									
									for(String valor : mapaPerfumaria.keySet()) {								
										listaProdutos = listaProdutos + mapaPerfumaria.get(valor).getNome() + "\n";
									}
								}
								if(!mapaCosmetico.isEmpty()) {									
									for(String valor : mapaCosmetico.keySet()) {								
										listaProdutos = listaProdutos + mapaCosmetico.get(valor).getNome() + "\n";
									}
								}
								if(!mapaHigienePessoal.isEmpty()) {									
									for(String valor : mapaHigienePessoal.keySet()) {								
										listaProdutos = listaProdutos + mapaHigienePessoal.get(valor).getNome() + "\n";
									}
								}
								if(!mapaInfantil.isEmpty()) {									
									for(String valor : mapaInfantil.keySet()) {								
										listaProdutos = listaProdutos + mapaInfantil.get(valor).getNome() + "\n";
									}
								}
								if(!mapaSexyShop.isEmpty()) {									
									for(String valor : mapaSexyShop.keySet()) {								
										listaProdutos = listaProdutos + mapaSexyShop.get(valor).getNome() + "\n";
									}
								}
								
								String prod = JOptionPane.showInputDialog("Caixa\n\nDigite o nome do produto:\n" + listaProdutos);					
								retMed = mapaMedicamento.containsKey(prod);
								retPerf = mapaPerfumaria.containsKey(prod);
								retCosm = mapaCosmetico.containsKey(prod);
								retHP = mapaHigienePessoal.containsKey(prod);
								retInf = mapaInfantil.containsKey(prod);
								retSS = mapaSexyShop.containsKey(prod);
									
								if((retMed == false) && (retPerf == false) && (retCosm == false) && (retHP == false)
									&& (retInf == false) && (retSS == false)) {
										JOptionPane.showMessageDialog(null, "Nome do produto incorreto.");
								} else {
									if(retMed == true) {					
										cestaCompra.adicionaProduto(mapaMedicamento.get(prod));
									} else if(retPerf == true) {
										cestaCompra.adicionaProduto(mapaPerfumaria.get(prod));
									} else if(retCosm == true) {
										cestaCompra.adicionaProduto(mapaCosmetico.get(prod));
									} else if(retHP == true) {
										cestaCompra.adicionaProduto(mapaHigienePessoal.get(prod));
									} else if(retInf == true) {
										cestaCompra.adicionaProduto(mapaInfantil.get(prod));
									} else {
										cestaCompra.adicionaProduto(mapaSexyShop.get(prod));
									}
									JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso.");
								}								
							}// Final Adicionar produto
							
							// Finalizar Venda
							if(Integer.parseInt(menuVenda)==2) {								
								JOptionPane.showMessageDialog(null, "Itens da Venda:" + cestaCompra.listaProdutos() + 
													"\nValor Total Venda: R$ " + cestaCompra.valorTotalCompra());								
							}// Final - Finalizar Venda							
						}while(Integer.parseInt(menuVenda) != 3);
					}//Final Efetuar a venda
				}while(Integer.parseInt(menuCaixa) != 2);				
			}// Final CAIXA			
		} while(Integer.parseInt(menuPrin) != 6);
	}//main		
}//Main	