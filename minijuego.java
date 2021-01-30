import java.util.Random;
import java.util.Scanner;


public class minijuego {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				/* ANTHONY EL FOCA */
				// TODO Auto-generated method stub
				bienvenida();

			}
			
			
			
			
			
			
			/*//////////////////////////////LIMPIAR CONSOLA """"///////////////////////////////////////////*/
			
			public static void limpiar() {
				for (int i = 0; i < 50; i++) {
					System.out.println("");
				}
			}
			
			
			
			
			
			
			
			
			
			/* /////////////////////////////////BIENVENIDA////////////////////////////////////////////*/
			
			
			public static void bienvenida() throws InterruptedException {
				limpiar();
				Scanner sc = new Scanner(System.in);
				int modo = 0;
				bienvenida1();
				modo = sc.nextInt();
				
				///CORRECCION DE ERRORES/////
				while (modo < 1 || modo > 5) {
					limpiar();
					System.out.println("							 Introduce una opcion desde el 1 al 5\n"
									+"								   ---------------"
									+ "\n								  | 1-Jugar       |"
									+ "\n								  | 2-Información |"
									+ "\n								  | 3-Autor       |"
									+ "\n								  | 4-Versión     |"
									+ "\n								  | 5-Salir       |"
									+ "\n								   ---------------");
					modo = sc.nextInt();
				}

				if (modo == 1) {
					juego();
				}
				if (modo == 2) {
					informacion();
				}
				if (modo == 3) {
					autor();
				}
				if (modo == 4) {
					version();
				}
				if (modo== 5) {
					salir();
				}

			}
			
			
			/*///////////////ENUNCIADO BIENVENIDA//////////////*/
			public static void bienvenida1() {
				
				System.out.println("								\r\n" + 
						"		                                                                                                                        \r\n" + 
						"		 ____ ___ _____ _   ___     _______ _   _ ___ ____   ___  ____       _      ____  _   _ ____  _        _    _   _ ____  \r\n" + 
						"		| __ |_ _| ____| \\ | \\ \\   / | ____| \\ | |_ _|  _ \\ / _ \\/ ___|     / \\    |  _ \\| | | / ___|| |      / \\  | \\ | |  _ \\ \r\n" + 
						"		|  _ \\| ||  _| |  \\| |\\ \\ / /|  _| |  \\| || || | | | | | \\___ \\    / _ \\   | |_) | | | \\___ \\| |     / _ \\ |  \\| | | | |\r\n" + 
						"		| |_) | || |___| |\\  | \\ V / | |___| |\\  || || |_| | |_| |___) |  / ___ \\  |  _ <| |_| |___) | |___ / ___ \\| |\\  | |_| |\r\n" + 
						"		|____|___|_____|_| \\_|  \\_/  |_____|_| \\_|___|____/ \\___/|____/  /_/   \\_\\ |_| \\_\\\\___/|____/|_____/_/   \\_|_| \\_|____/ \r\n" + 
						"		                                                                                                                        \r\n" + 
						"\n\n\n\n\n\n\n");
				
				System.out.println("							 Introduce una opcion desde el 1 al 5\n"+
				"								   ---------------"
						+ "\n								  | 1-Jugar       |"
						+ "\n								  | 2-Información |"
						+ "\n								  | 3-Autor       |"
						+ "\n								  | 4-Versión     |"
						+ "\n								  |               |"
						+ "\n								  | 5-Salir       |"
						+ "\n								   ---------------\n\n\n\n\n\n");
			}
			
			
			
			
			
			
			
			
			
			
			
			/* /////////////////////////////////INTERFAZ JUEGO////////////////////////////////////////////*/
			
			
			public static void juego() throws InterruptedException {
				limpiar();
				Scanner sc=new Scanner(System.in);
				int modo=0;
				System.out.println("								   ------------------\n"+
						"					 			  | J  U  E  G  O  S |\n"+
						"					   			   ------------------\n\n\n\n");
				System.out.println("						      SELECCIONA UN JUEGO ENTRE LOS 3 DISPONIBLES"
						+ "\n								     ----------------"
						+ "\n								    | 1-AHORCADO     |"
						+ "\n								    | 2-RULETA       |"
						+ "\n								    | 3-OCA          |"
						+ "\n								    | 4-VOLVER ATRAS |"
						+ "\n								     ----------------\n\n\n\n\n\n\n\n\n");
				modo=sc.nextInt();
				
				/////CORRECCION DE ERRORES/////
				while(modo<1||modo>4) {
					System.out.println("ERROR\n"
							+ "SELECCIONA 1 OPCION DE LAS 4 QUE HAY" );
					System.out.println("						      SELECCIONA UN JUEGO ENTRE LOS 3 DISPONIBLES"
							+ "\n								     ----------------"
							+ "\n								    | 1-AHORCADO     |"
							+ "\n								    | 2-RULETA       |"
							+ "\n								    | 3-OCA          |"
							+ "\n								    | 4-VOLVER ATRAS |"
							+ "\n								     ----------------");
					modo=sc.nextInt();
				}
				if(modo==1) {
					ahorcado();
				}
				if(modo==2) {
					juegoruleta();
					
				}
				if(modo==3) {
					oca();
				}
				if(modo==4) {
					bienvenida();
				}
			}
			
			
			

			/* /////////////////////////////////INICIO JUEGO AHORCADO////////////////////////////////////////////*/
			
			
			public static void ahorcado() throws InterruptedException {
				limpiar();
				Scanner sc= new Scanner(System.in);
				int modo=0;
				bienvenidosahorcado();
				modo=sc.nextInt();
				
				///CORRECCION DE ERRORES/////
				while(modo<1||modo>4) {
					System.out.println("ERROR\n"
							+ "SELECCIONA 1 OPCION DE LAS 4 QUE HAY" );
					System.out.println("\n						        SELECCIONA 1 OPCION DE LAS 4 QUE HAY\n"
							+ "\n								 ----------------------"
							+ "\n								| 1-JUGADOR VS JUGADOR |"
							+ "\n								| 2-JUGADOR VS IA      |"
							+ "\n								| 3-SALIR              |"
							+ "\n								|                      |"
							+ "\n								| 4-VOLVER ATRAS       |"
							+ "\n								 ----------------------");
					modo=sc.nextInt();
				}
				if(modo==1) {
					jvj();
				}
				if(modo==2) {
					jvi();
				}
				if(modo==3) {
					salir();
				}
				if(modo==4) {
					juego();
				}
			}
			public static void bienvenidosahorcado() {
				System.out.println("					    -------------------------------------------------------------------\n"+
						"					   | B I E N V E N I D O S   A L   J U E G O   D E L   A H O R C A D O |\n"+
						"					    -------------------------------------------------------------------\n"+
						"\n			 -------------------------------------------------------------------------------------------------------"+
						"\n			|						REGLAS                                                  |"+
						"\n			| 				El juego trata de adivinar la palabra                                   |"+
						"\n			|		 En cada turno el jugador puede pedir una letra o adivinar la palabra                   |"+
						"\n			| 				Si la letra esta se mostrara esa letra                                  |"+
						"\n			| 				Si la palabra esta el jugador ganara                                    |"+
						"\n			| Si la letra o palabra no esta se dibujara una parte del muñeco hasta completar las 6 partes que tiene |"+
						"\n			 -------------------------------------------------------------------------------------------------------"
						);
				System.out.println("\n						        SELECCIONA 1 OPCION DE LAS 4 QUE HAY\n"
						+ "\n								 ----------------------"
						+ "\n								| 1-JUGADOR VS JUGADOR |"
						+ "\n								| 2-JUGADOR VS IA      |"
						+ "\n								| 3-SALIR              |"
						+ "\n								|                      |"
						+ "\n								| 4-VOLVER ATRAS       |"
						+ "\n								 ----------------------");
			}
			public static void jvj() {
				Scanner sc = new Scanner(System.in);
				int intentos=9;

				int p=0;
				String[] palabras ={ "cerdo", "sapo", "cebra", "rinoceronte", "leon", "panda" , "cocodrilo"
						, "tucan" , "zorro" , "perra" , "murcielago" , "ganso" , "foca" , "rata" , "nutria" };	
				String palabrafinal=palabras[(int) (Math.random() * 14)];
				int nletras=palabrafinal.length();
				char palabrag[]=new char[nletras]; ;
				char letra = 0;
				int cont =0;
				int contador=0;
				for (int i = 0; i < palabrag.length; i++) {//IGUAL EL ARRAY DE CHAR A _
					palabrag[i]='_';
				}
				System.out.println("¿QUE JUGADOR VA A COMENZA?"+"\nJUGADOR 1 O JUGADOR 2");
				p=sc.nextInt();
				
				while(intentos>0) {
					System.out.println("ACIERTOS\n"+contador+" de "+nletras);
					System.out.println("\n\nPLAYER "+p+"\n\nIntroduce una letra: ");
					
					for (int i = 0; i < palabrag.length; i++) {
						System.out.print(palabrag[i]+" ");//////// SEPARA LOS _ DEL ARRAY PALABRAG
					}
					
					
					letra=sc.next().charAt(0);///SE ALMACENA LA LETRA QUE INTRODUCE EL JUGADOR
					
					int contcont=0;
					
					for (int i = 0; i < palabrafinal.length(); i++) {
						
						if(palabrafinal.charAt(i)==letra) {
							
							if(palabrag[i]==letra && cont<1) {
								System.out.println("ESTA LETRA YA ESTA INTRODUCIDA");
								cont++;
							}
							
							
							palabrag[i]=letra;
							if(contcont<1 && cont<1) {
							contador++;
							contcont++;
							
							}
				
							}
						
							
						
						
							
						
						}
					
					
					
					
					
					
					
					
					if (intentos == 8) {
						
						vidas8();
					}
					if (intentos == 7) {
						vidas7();
					}
					if (intentos == 6) {
						vidas6();
					}
					if (intentos == 5) {
						vidas5();
					}
					if (intentos == 4) {
						vidas4();
					}
					if (intentos == 3) {
						vidas3();
					}
					if (intentos == 2) {
						vidas2();
					}
					if (intentos == 1) {
						vidas1();
					}
					if (intentos == 0) {
						vidas0();
					}
					if(contador==nletras) {
						
						intentos=0;
						System.out.println("\n\n\n\nHAS GANADO PLAYER "+p);
					}
					
					if(p==1) {
						p=2;
					}
					else if(p==2) {
						p=1;
					}
					
				}
				int volver=0;
				System.out.println("QUIERES VOLVER A JUGAR?"+"\n1= SI"+"\n2= NO");
				if(volver==1) {
					bienvenidosahorcado();
				}
			}
			public static void jvi() {
				Scanner sc = new Scanner(System.in);
				int intentos=9;

				int p=0;
				String[] palabras ={ "cerdo", "sapo", "cebra", "rinoceronte", "leon", "panda" , "cocodrilo"
						, "tucan" , "zorro" , "perra" , "murcielago" , "ganso" , "foca" , "rata" , "nutria" };	
				String palabrafinal=palabras[(int) (Math.random() * 14)];
				int nletras=palabrafinal.length();
				char palabrag[]=new char[nletras]; ;
				System.out.println("¿QUIEN VA A COMENZAR?"+"\nJUGADOR 1 O MAQUINA 2");
				p=sc.nextInt();
				char letra = 0;
				int cont =0;
				int contador=0;
				
				
				for (int i = 0; i < palabrag.length; i++) {//IGUAL EL ARRAY DE CHAR A _
					palabrag[i]='_';
				}
				
				while(intentos>0) {
					System.out.println("\n\nPLAYER "+p+"\n\nIntroduce una letra: ");
					
					for (int i = 0; i < palabrag.length; i++) {
						System.out.print(palabrag[i]+" ");//////// SEPARA LOS _ DEL ARRAY PALABRAG
					}
					
					if(p==1) {
						letra=sc.next().charAt(0);///SE ALMACENA LA LETRA QUE INTRODUCE EL JUGADOR
					}
					else if(p==2) {
						
						letra=(char)(Math.random()*26+65);///SE ALMACENA LA LETRA QUE INTRODUCE EL JUGADOR
						System.out.println("\nLA MAQUINA A ESCRITO LA: "+letra);
					}
					
					
					
					for (int i = 0; i < palabrafinal.length(); i++) {
						
						if(palabrafinal.charAt(i)==letra) {
							
							if(palabrag[i]==letra && cont<1) {
								
							
								
								System.out.println("ESTA LETRA YA ESTA INTRODUCIDA");
								intentos=intentos-1;
								System.out.println("VIDAS: "+intentos);
								cont++;
								
							}
							
							
							palabrag[i]=letra;
							contador=contador+1;
				
							}
							
						
						}
					
					
					/*if(contaciertos==nletras) {
						System.out.println("HAS GANADO");
					}*/
					
					if (intentos == 8) {
						
						vidas8();
					}
					if (intentos == 7) {
						vidas7();
					}
					if (intentos == 6) {
						vidas6();
					}
					if (intentos == 5) {
						vidas5();
					}
					if (intentos == 4) {
						vidas4();
					}
					if (intentos == 3) {
						vidas3();
					}
					if (intentos == 2) {
						vidas2();
					}
					if (intentos == 1) {
						vidas1();
					}
					if (intentos == 0) {
						vidas0();
					}
					if(contador==nletras) {
						
						intentos=0;
						System.out.println("\n\n\n\nHAS GANADO PLAYER "+p);
						
					}
					
					if(p==1) {
						p=2;
					}
					else if(p==2) {
						p=1;
					}
					
				}
				int volver=0;
				System.out.println("QUIERES VOLVER A JUGAR?"+"\n1= SI"+"\n2= NO");
				if(volver==1) {
					bienvenidosahorcado();
				}
			}
			
			
			
			
			
			
			
			
			
			
			///DIBUJOS//////
			
			
			
			
			
			
			
			
			
			
			
			public static void vidas8() {
				System.out.println(" " 
						+ "\n ||                     " 
						+ "\n ||                     " 
						+ "\n ||                  "
						+ "\n ||                 " 
						+ "\n ||                 " 
						+ "\n ||                  "
						+ "\n ||                        " 
						+ "\n ||                      " 
						+ "\n ||                        "
						+ "\n ||                          " 
						+ "\n ||                        " 
						+ "\n ||                     "
						+ "\n ||                        " 
						+ "\n ||                        ");
			}

			public static void vidas7() {
				System.out.println(" ------------------------" 
						+ "\n ||                     " 
						+ "\n ||                     "
						+ "\n ||                  " 
						+ "\n ||                " 
						+ "\n ||               "
						+ "\n ||                 " 
						+ "\n ||                     " 
						+ "\n ||                 "
						+ "\n ||               " 
						+ "\n ||              " 
						+ "\n ||                  " 
						+ "\n ||                "
						+ "\n ||                  " 
						+ "\n ||                  ");
			}

			public static void vidas6() {
				System.out.println(" ------------------------" 
						+ "\n ||                     |" 
						+ "\n ||                     |"
						+ "\n ||                  " 
						+ "\n ||                " 
						+ "\n ||                 " 
						+ "\n ||                 "
						+ "\n ||                   " 
						+ "\n ||                  " 
						+ "\n ||                 " 
						+ "\n ||               "
						+ "\n ||                        " 
						+ "\n ||                 " 
						+ "\n ||              "
						+ "\n ||                 ");
			}

			public static void vidas5() {
				System.out.println(" ------------------------"
						+"\n ||                     |"
						+"\n ||                     |"
						+"\n ||                  -------"
						+"\n ||                 | o  o  |"
						+"\n ||                 |   u   |"
						+"\n ||                  -------"
						+"\n ||                        "
						+"\n ||                   "
						+"\n ||                  "
						+"\n ||               "
						+"\n ||                       "
						+"\n ||                   "
						+"\n ||                    "
						+"\n ||                  ");
			}

			public static void vidas4() {
				System.out.println(" ------------------------"
						+"\n ||                     |"
						+"\n ||                     |"
						+"\n ||                  -------"
						+"\n ||                 | o  o  |"
						+"\n ||                 |   u   |"
						+"\n ||                  -------"
						+"\n ||                     |   "
						+"\n ||                     |  "
						+"\n ||                     |    "
						+"\n ||                     |     "
						+"\n ||                     |   "
						+"\n ||                     "
						+"\n ||                       "
						+"\n ||                        ");
			}

			public static void vidas3() {
				System.out.println(" ------------------------"
						+"\n ||                     |"
						+"\n ||                     |"
						+"\n ||                  -------"
						+"\n ||                 | o  o  |"
						+"\n ||                 |   u   |"
						+"\n ||                  -------"
						+"\n ||                     |   "
						+"\n ||                   / |  "
						+"\n ||                  /  |    "
						+"\n ||                 /   |      "
						+"\n ||                     |   "
						+"\n ||                     "
						+"\n ||                        "
						+"\n ||                        ");
			}

			public static void vidas2() {
				System.out.println(" ------------------------"
						+"\n ||                     |"
						+"\n ||                     |"
						+"\n ||                  -------"
						+"\n ||                 | o  o  |"
						+"\n ||                 |   u   |"
						+"\n ||                  -------"
						+"\n ||                     |   "
						+"\n ||                   / | \\ "
						+"\n ||                  /  |   \\ "
						+"\n ||                 /   |     \\ "
						+"\n ||                     |   "
						+"\n ||                     "
						+"\n ||                        "
						+"\n ||                       ");
			}

			public static void vidas1() {
				System.out.println(" ------------------------"
						+"\n ||                     |"
						+"\n ||                     |"
						+"\n ||                  -------"
						+"\n ||                 | o  o  |"
						+"\n ||                 |   u   |"
						+"\n ||                  -------"
						+"\n ||                     |   "
						+"\n ||                   / | \\ "
						+"\n ||                  /  |   \\ "
						+"\n ||                 /   |     \\ "
						+"\n ||                     |   "
						+"\n ||                    / "
						+"\n ||                   /     "
						+"\n ||                  /      ");
			}

			public static void vidas0() {
				System.out.println(" ------------------------"
						+"\n ||                     |"
						+"\n ||                     |"
						+"\n ||                  -------"
						+"\n ||                 | x  x  |"
						+"\n ||                 |   _   |"
						+"\n ||                  -------"
						+"\n ||                     |   "
						+"\n ||                   / | \\ "
						+"\n ||                  /  |   \\ "
						+"\n ||                 /   |     \\ "
						+"\n ||                     |   "
						+"\n ||                    / \\"
						+"\n ||                   /   \\  "
						+"\n ||                  /     \\ ");
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

			

			
			
			
			
	
			
			
			
			
			
			
			
			/*////////////////////////////////////////////////JUEGO RULETA////////////////////////////////////////////////////////////*/
			public static void juegoruleta() throws InterruptedException {
			
			Scanner teclado = new Scanner(System.in);
			Random r = new Random();
			int modo = 0;

			Normas();
			modo = Modalidad(modo);

			char repetir = 'S';
			while (repetir == 'S' || repetir == 's') {

				int player = 0;
				int coin1 = 20;
				int acoin1 = 0;
				int coin2 = 20;
				int acoin2 = 0;
				int rcolor = 0;
				int par = 0;
				int apar = 0;
				int king = 0;
				char color = ' ';
				char acolor = ' ';

				if (modo == 1) {

					player = EmpiezaJugador(player);

					while (coin1 < 100 || coin1 > 1 || coin2 < 100 || coin2 > 1) {
						if (player == 1) {

							TP1(coin1, acoin1, acolor, apar);
							acoin1 = AC1(acoin1, coin1);
							coin1 = coin1 - acoin1;

							apar = AP(apar);

							TP1(coin1, acoin1, acolor, apar);

							acolor = AC(acolor);

							TP1(coin1, acoin1, acolor, apar);

						} else if (player == 2) {

							acoin2 = r.nextInt(coin2) + 1;
							coin2 = coin2 - acoin2;

							apar = r.nextInt(2) + 1;

							rcolor = r.nextInt(5) + 1;

							if (rcolor == 1 || rcolor == 2) {
								acolor = 'R';
							} else if (rcolor == 3 || rcolor == 4) {
								acolor = 'N';
							} else if (rcolor == 5) {
								acolor = 'V';
							}

							System.out.println();
							TIA(coin2, acoin2, acolor, apar);
							Thread.sleep(2000);
						}
						// RULETA
						king = ruleta(king);
						par = PR(king, par);
						color = CR(king, color);

						if (player == 1) {

							if (acolor == 'V' && color == 'V') {
								System.out.println("HAS GANADO");
								coin1 = coin1 + acoin1 * 100;
								acoin1 = 0;
							} else if (apar == par && acolor == color) {
								coin1 = coin1 + acoin1 * 2;
								acoin1 = 0;
							} else if (apar != par && acolor == color) {
								coin1 = coin1 + acoin1;
								acoin1 = 0;
							} else if (apar == par && acolor != color) {
								coin1 = coin1 + acoin1;
								acoin1 = 0;
							} else if (apar != par && acolor != color) {
								acoin1 = 0;
								acoin1 = 0;
							}

							apar = 0;
							acolor = ' ';

							System.out.println();
							TP1(coin1, acoin1, acolor, apar);

						} else if (player == 2) {

							if (acolor == 'V' && color == 'V') {
								System.out.println("HAS GANADO");
								coin2 = coin2 + acoin2 * 100;
								acoin2 = 0;
							} else if (apar == par && acolor == color) {
								coin2 = coin2 + acoin2 * 2;
								acoin2 = 0;
							} else if (apar != par && acolor == color) {
								coin2 = coin2 + acoin2;
								acoin2 = 0;
							} else if (apar == par && acolor != color) {
								coin2 = coin2 + acoin2;
								acoin2 = 0;
							} else if (apar != par && acolor != color) {
								acoin2 = 0;
								acoin2 = 0;
							}

							apar = 0;
							acolor = ' ';
							System.out.println();
							TIA(coin2, acoin2, acolor, apar);

						}

						player = CP(player);
					}
				} else if (modo == 2) {

					player = EmpiezaJugador(player);

					while (coin1 < 100 || coin1 > 1 || coin2 < 100 || coin2 > 1) {
						if (player == 1) {

							TP1(coin1, acoin1, acolor, apar);

							acoin1 = AC1(acoin1, coin1);
							coin1 = coin1 - acoin1;

							apar = AP(apar);

							TP1(coin1, acoin1, acolor, apar);

							acolor = AC(acolor);

							System.out.println();
							TP1(coin1, acoin1, acolor, apar);

						} else if (player == 2) {

							TP2(coin2, acoin2, acolor, apar);

							acoin2 = AC2(acoin2, coin2);
							coin2 = coin2 - acoin2;

							apar = AP(apar);

							TP2(coin2, acoin2, acolor, apar);

							acolor = AC(acolor);

							System.out.println();
							TP2(coin2, acoin2, acolor, apar);
						}
						// RULETA
						king = ruleta(king);
						par = PR(king, par);
						color = CR(king, color);

						if (player == 1) {
							if (acolor == 'V' && color == 'V') {
								System.out.println("HAS GANADO");
								coin1 = coin1 + acoin1 * 100;
								acoin1 = 0;
							} else if (apar == par && acolor == color) {
								coin1 = coin1 + acoin1 * 2;
								acoin1 = 0;
							} else if (apar != par && acolor == color) {
								coin1 = coin1 + acoin1;
								acoin1 = 0;
							} else if (apar == par && acolor != color) {
								coin1 = coin1 + acoin1;
								acoin1 = 0;
							} else if (apar != par && acolor != color) {
								acoin1 = 0;
								acoin1 = 0;
							}

							apar = 0;
							acolor = ' ';
							System.out.println();
							TP1(coin1, acoin1, acolor, apar);

						} else if (player == 2) {
							if (acolor == 'V' && color == 'V') {
								System.out.println("HAS GANADO");
								coin2 = coin2 + acoin2 * 100;
								acoin2 = 0;
							} else if (apar == par && acolor == color) {
								coin2 = coin2 + acoin2 * 2;
								acoin2 = 0;
							} else if (apar != par && acolor == color) {
								coin2 = coin2 + acoin2;
								acoin2 = 0;
							} else if (apar == par && acolor != color) {
								coin2 = coin2 + acoin2;
								acoin2 = 0;
							} else if (apar != par && acolor != color) {
								acoin2 = 0;
								acoin2 = 0;
							}

							apar = 0;
							acolor = ' ';
							System.out.println();
							TP2(coin2, acoin2, acolor, apar);
						}

						player = CP(player);
					}

				}
				System.out.println("Quieres volver a jugar?		Si - S		No - N");
				repetir = teclado.next().charAt(0);

				while (repetir != 'S' || repetir != 'N') {
					System.out.println("Si - S		No - N??????");
					repetir = teclado.next().charAt(0);
				}
			}

		}

		public static void Normas() throws InterruptedException {
			System.out.println("		BIENVENIDO AL JUEGO DE LA RULETA!  \n");
			Thread.sleep(2 * 1000);

			System.out.println(" -Empiezas con 20 coins y tienes que seleccionar un color y una paridad."
					+ "\n -Los números son del 1 al 36."
					+ "\n -Los colores son Rojo(R) Negro(N) y Verde(V) el cual es el color ganador."
					+ "\n -Si aciertas el color entre el negro o el rojo la cantidad apostada se multiplica X1."
					+ "\n -Si ademas de acertar el color, aciertas la paridad, la cantidad apostada se multiplicara X2."
					+ "\n -Si da la casualidad que apuestas al color verde y te toca, automaticamente has ganado la partida. \n");
			Thread.sleep(1 * 1000);
			System.out.println("REGLAS");
			Thread.sleep(1 * 500);
			System.out.println("Tienes que apostar como minimo 1 coin.");
			Thread.sleep(1 * 500);
			System.out.println("Tienes que apostar 1 color y una paridad obligatoriamente. \n");
		}

		public static int Modalidad(int modo) throws InterruptedException {

			Scanner teclado = new Scanner(System.in);

			Thread.sleep(3 * 1000);
			System.out.println("Que Modalidad quieres jugar?	1- Player Vs IA		2- Player Vs Player");
			modo = teclado.nextInt();

			while (modo < 1 || modo > 2) {
				System.out.println("Modalidad de juego incorrecta, por favor vuelva a introducir la modalidad");
				modo = teclado.nextInt();
			}
			return modo;
		}

		public static int EmpiezaJugador(int player) throws InterruptedException {

			Random r = new Random();
			System.out.println(
					"Vamos a decidir aleatoriamente quien va a empezar, tu eres el PLAYER 1 y la IA sera el PLAYER 2:\n");
			player = r.nextInt(2) + 1;

			Thread.sleep(1000);

			System.out.println("Va a empezar el Player: " + player);
			Thread.sleep(500);
			System.out.println("EMPECEMOS!! \n");
			Thread.sleep(1000);
			return player;
		}

		public static void TP1(int coin1, int acoin1, char acolor, int apar) throws InterruptedException {
			System.out.println("Coins Player 1:  " + coin1);
			System.out.println("Cantidad apostada:  " + acoin1);
			System.out.println("COLOR seleccionado:  " + acolor);
			System.out.println("PARIDAD seleccionada:  " + apar);
			Thread.sleep(1000);
		}

		public static void TP2(int coin2, int acoin2, char acolor, int apar) throws InterruptedException {
			System.out.println("Coins Player 2:  " + coin2);
			System.out.println("Cantidad apostada:  " + acoin2);
			System.out.println("Color seleccionado:  " + acolor);
			System.out.println("PARIDAD seleccionada:  " + apar);
			Thread.sleep(1000);
		}

		public static void TIA(int coin2, int acoin2, char acolor, int apar) throws InterruptedException {
			System.out.println("Coins IA:  " + coin2);
			System.out.println("Cantidad apostada:  " + acoin2);
			System.out.println("Color seleccionado:  " + acolor);
			System.out.println("PARIDAD seleccionada:  " + apar);
			Thread.sleep(1000);

		}

		public static int AC1(int acoin1, int coin1) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Cuantos coins vas a apostar?");
			acoin1 = teclado.nextInt();

			while (acoin1 < 1 || acoin1 > coin1) {
				System.out.println("Por favor, introduce una apuesta permitida.");
				acoin1 = teclado.nextInt();
			}
			return acoin1;
		}

		public static int AC2(int acoin2, int coin2) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("\n Cuantos coins vas a apostar?");
			acoin2 = teclado.nextInt();

			while (acoin2 < 1 || acoin2 > coin2) {
				System.out.println("\n Por favor, introduce una apuesta permitida.");
				acoin2 = teclado.nextInt();
			}
			return acoin2;
		}

		public static int AP(int apar) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("A que paridad vas a apostar?  1-PAR   2-IMPAR");
			apar = teclado.nextInt();

			while (apar < 1 || 2 < apar) {
				System.out.println("Por favor, introduce una paridad permitida.");
				apar = teclado.nextInt();
			}
			return apar;
		}

		public static char AC(char acolor) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("\n A que color apuestas?" + "\n	R- Rojo" + "\n	N- Negro" + "\n	V- Verde \n");
			acolor = teclado.next().charAt(0);
			return acolor;
		}

		public static int ruleta(int king) throws InterruptedException {
			Random r = new Random();
			System.out.println("\n EMPIEZA A RODAR LA RULETA");
			Thread.sleep(2000);

			king = r.nextInt(36) + 1;
			System.out.println("\nEl numero ganador ha sido:  " + king);
			return king;
		}

		public static int PR(int king, int par) {
			if (king % 2 == 0) {
				System.out.println("Es PAR");
				par = 1;
			} else {
				System.out.println("Es IMPAR");
				par = 2;
			}
			return par;
		}

		public static char CR(int king, char color) {

			if (king == 1 || king == 3 || king == 5 || king == 7 || king == 9 || king == 12 || king == 14 || king == 16
					|| king == 18 || king == 19 || king == 21 || king == 23 || king == 25 || king == 27 || king == 30
					|| king == 32 || king == 34) {
				System.out.println("Es de color ROJO (R)");
				color = 'R';

			} else if (king == 36) {
				System.out.println("Es de color VERDE (V)");
				color = 'V';

			} else {
				System.out.println("Es de color NEGRO (N)");
				color = 'N';
			}
			return color;
		}

		public static int CP(int player) {
			if (player == 1) {
				player = 2;
			} else if (player == 2) {
				player = 1;
			}
			System.out.println("\n CAMBIO DE JUGADOR   \n \n");
			return player;
		}

			
			
			public static void oca() {
				Scanner sn = new Scanner(System.in);
				Random r = new Random();
				System.out.println("BIENVENIDO A LA OCA. DALE AL ENTER PARA COMENZAR: ");
				

				System.out.println("							\r\n"
						+ "                                   ___\r\n"
						+ "                               ,-\"\"   `.\r\n"
						+ "                             ,'  _   e )`-._\r\n"
						+ "                            /  ,' `-._<.===-'\r\n"
						+ "                           /  /\r\n"
						+ "                          /  ;\r\n"
						+ "              _          /   ;\r\n"
						+ " (`._    _.-\"\" \"\"--..__,'    |\r\n"
						+ " <_  `-\"\"                     \\\r\n"
						+ "  <`-                          :\r\n"
						+ "   (__   <__.                  ;\r\n"
						+ "     `-.   '-.__.      _.'    /\r\n"
						+ "        \\      `-.__,-'    _,'\r\n"
						+ "         `._    ,    /__,-'\r\n"
						+ "            \"\"._\\__,'< <____\r\n"
						+ "                 | |  `----.`.\r\n"
						+ "                 | |        \\ `.\r\n"
						+ "                 ; |___      \\-``\r\n"
						+ "                 \\   --<\r\n"
						+ "                  `.`.<\r\n"
						+ "                    `-'");
				
				System.out.println();
				sn.nextLine();
				System.out.println();
		// Aqui se almacenan la mayoria de variables
				int [][] tablero = new int [8][8]; // el tablero es un array 8*8 de 64 posiciones, normalmente la oca tiene 63, pero la mia tiene 64 casillas
				int num = 0; // es el contador que utilizo para numerar las casillas del tablero
				int dado1 = (int) (Math.random()*6+1); // esta es la primera variable que me da seis valores random del 1 al 6, simulando un dado.
				int dado2 = (int) (Math.random()*6+1); // en esta variable hago lo mismo que en la anterior, ya que en mi oca se utilizan 2 dados.
				int dados = dado1 + dado2; // es la suma de los dados
				int [][] jugador1 = new int [8][8]; //array de jugador1 donde se guarda la posición de la suma de los dados
				int [][] jugador2 = new int [8][8]; // lo mismo sucede en esta array
				int J1 = 'X'; // es la ficha del jugador1, dado que no he conseguido pasar de int a char, en pantalla no se printará una 'X' sino que la va a printar en ASCII con el valor de 88. 
				int J2 = 'O';// el el valor 79 en codigo ASCII.
				int casillas = 0;
				
				//estas variables han sido pensadas para hacer las casillas especiales 
				boolean Oca = false; boolean Puente = false; boolean Dados = false; boolean Posada = false; 
				boolean Prision = false; boolean Pozo = false; boolean Laberinto = false; boolean Muerte = false;
				
				boolean victoria = false;

				num = 0;
				
				dados = 0;
				while(!victoria) {   // aquí empieza y se repite el juego hasta que uno de los jugadores no hayan ganado
					
					dado1 = (int) (Math.random()*6+1);
					dado2 = (int) (Math.random()*6+1);
					dados = dado1 + dado2;
					
				//le pedimos al jugador que le de al INTRO para que empieze su turno
				System.out.println();
				System.out.println("Turno del Jugador1: ");
				sn.nextLine();
				System.out.println(dado1+" y "+dado2+" se moveran "+dados+" casillas");
				System.out.println();
				
				int a = 0,b = 0;
				//el bucle que recorre la matriz del jugador1 para printar un 88 en la posicion que se ha de mover
				for(int i = 0; i <= 7 ; i++) {
					for(int j = 0; j <= 7 ; j++) {
						if(dados == 0) {
							jugador1[i][j] = J1;
							
							a = i;
							b = j;
						}
						dados--;
						
					}
				}	
				
				
				casillas += dados;
				//y aquí es donde realmente se printa el tablero por pantalla 
				for(int i = 0; i < tablero.length ; i++) {
					System.out.println();
					for(int j = 0; j < tablero.length ; j++) {										 

						num++;
						tablero[i][j] = num;

						tablero[a][b] = 'X';

						
						System.out.print(" "+tablero[i][j]+"\t" );
					}
					System.out.println("\n");
					
				}
				num = 0;
				dado1 = (int) (Math.random()*6+1);
				dado2 = (int) (Math.random()*6+1);
				dados = dado1 + dado2;

				// despues de haberse ejecutado el codigo del jugador1 ahora el programa continua con el jugador2 haciendo el mismo procedimiento que mas arriba
				System.out.println();
				System.out.println("Turno del Jugador2: ");
				sn.nextLine();
				System.out.println(dado1+" y "+dado2+" se moveran "+dados+" casillas");
				System.out.println();
				
				int x = 0,y = 0;
				for(int i = 0; i <= 7 ; i++) {
					for(int j = 0; j <= 7 ; j++) {
						if(dados == 0) {
							jugador2[i][j] = J2;
							x = i;
							y = j;
						}
						dados--;
					}
				}	


				casillas += dados;
				for(int i = 0; i < tablero.length ; i++) {
					System.out.println();
					for(int j = 0; j < tablero.length ; j++) {										 

						num++;
						tablero[i][j] = num;
						
						tablero[x][y] = 'O';


						System.out.print(" "+tablero[i][j]+"\t" );
					}
					System.out.println("\n");

				}
				num = 0;
			}	
					
			
			



		// FIN DEL PROGRAMA

			}
			
			
			
			
			/* /////////////////////////////////INFORMACION////////////////////////////////////////////*/


			public static void informacion() throws InterruptedException {
				Scanner sc=new Scanner(System.in);
				limpiar();
				int volver=0;
				
				System.out.println("								 ---------------------------------\n"
				+"								| I  N  F  O  R  M  A  C  I  O  N | \n"
				+"								 ---------------------------------"
				+"\n\n\n\n\n						  RUSLAND ES UNA PLATAFORMA DE MINIJUEGOS EN CONSOLA DE JAVA\n\n\n\n\n\n\n\n\n");
				
				System.out.println("\n|PRESIONE 1 SI QUIERE VOLVER ATRAS|");
				volver=sc.nextInt();
				
				///CORRECCION DE ERRORES/////
				while(volver>1||volver<1) {
					System.out.println("ERROR\n"
				+ "|PRESIONE 1 SI QUIERE VOLVER ATRAS|" );
					volver=sc.nextInt();
				}
				if(volver==1) {
					bienvenida();
				}

			}

			
			
			
			
			
			
			
			
			/* /////////////////////////////////AUTOR////////////////////////////////////////////*/

			public static void autor() throws InterruptedException {
				Scanner sc=new Scanner(System.in);
				limpiar();
				int volver=0;
				System.out.println("								 ---------------------\n"
				+"								| A  U  T  O  R  E  S | \n"
				+"								 ---------------------");
				System.out.println("\n\n\n\n								   ANTHONY CHAVEZ\n" 
				+ "\n								    JUANDA DAVID\n" 
				+ "\n								  EMANUEL ALEXANDRU\n\n\n\n\n\n\n\n\n");
				System.out.println("\n|PRESIONE 1 SI QUIERE VOLVER ATRAS|");
				volver=sc.nextInt();
				
				///CORRECCION DE ERRORES/////
				while(volver>1||volver<1) {
					System.out.println("ERROR\n"
				+ "|PRESIONE 1 SI QUIERE VOLVER ATRAS|" );
					volver=sc.nextInt();}
				if(volver==1) {
					bienvenida();
				}
			}

			
			
			
			
			
			
			
			/* /////////////////////////////////VERSION////////////////////////////////////////////*/

			public static void version() throws InterruptedException {
				Scanner sc=new Scanner(System.in);
				limpiar();
				int volver=0;
				System.out.println("								 ---------------------\n"
						+"								| V  E  R  S  I  O  N | \n"
						+"								 ---------------------\n\n\n\n");
				System.out.println("\n\n								   RUSLAND 1.0 (BETA)\n\n\n\n\n\n\n\n\n\n");
				System.out.println("\n|PRESIONE 1 SI QUIERE VOLVER ATRAS|");
				volver=sc.nextInt();
				
				///CORRECCION DE ERRORES/////
				while(volver>1||volver<1) {
					System.out.println("ERROR\n"
				+ "|PRESIONE 1 SI QUIERE VOLVER ATRAS|" );
					volver=sc.nextInt();}
				if(volver==1) {
					bienvenida();
				}

			}

			
			
			
			
			
			
			
			
			/* /////////////////////////////////SALIR////////////////////////////////////////////*/

			public static void salir() {
				System.exit(0);
			}
			
		}
