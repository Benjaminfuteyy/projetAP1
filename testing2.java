class testing extends Program {
	boolean motPrinted = false;
	String motATaper = "renard";
	int compteur = 0;
	void keyTypedInConsole(char c){ //tout l'algo passe à chaque saisie d'un (1) caractère
	if(c=='\n'){ //quel caractère pour backspace ? ^H
		//print("");
		compteur = 0;
		clearLine();
		up();
	}
	else {
		if(c==charAt(motATaper,compteur))
			reset();
		if(compteur>0){
			if(c!=charAt(motATaper,compteur)){
				backward(1);
				clearEOL();
				print(ANSI_RED_BG);
				print(c);
			}
		}
		if(compteur<(length(motATaper)-1))
			compteur = compteur +1;
	}
}

	//si correct, ne rien changer, passer le  mot en texte vert quand on passe au suivant
	//si le caractère ne correspond pas, passer le mot en bg rouge, et si l'utilisateur passe au mot suivant, passer le texte au rouge

void algorithm(){
	println(motATaper);
	while(true){
		enableKeyTypedInConsole(true);
	}
}

//il va falloir définir le mot à taper en valeur globale
}
