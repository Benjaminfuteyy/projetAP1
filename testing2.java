class testing2 extends Program {
    boolean on = true;
    boolean motPrinted = false;
    String motATaper = "renard";
    int compteur = 0;
    String motSaisi = "";
    void keyTypedInConsole(char c){ //tout l'algo passe à chaque saisie d'un (1) caractère
	
	//	println(motSaisi);
	reset();	    
	if(c=='\n'){ //l'utilisateur saisi [ENTREE] -> il a fini son mot
	    motSaisi = "";
	    compteur = 0;
	    up();
	    clearLine();
	    on = false;
	    if(equals(motSaisi,motATaper)){
		print(ANSI_GREEN);
		println(motATaper);
		reset();
	    }
		    
	    //passer à un autre mot
	}
	if(c==' '){ // ' ' car on ne peut pas avoir RET ARR.
	    compteur = compteur -1;
	    backward(2);
	    clearEOL();
	    if(length(motSaisi)>=2)
		motSaisi = substring(motSaisi,0,length(motSaisi)-2);
	}	    
	else { //si le caractère saisi est une lettre
	    motSaisi = motSaisi + c;
	    if(c==charAt(motATaper,compteur))
		reset();
	    if(compteur>0){
		if(c!=charAt(motATaper,compteur)){
		    backward(1);
		    clearEOL();
		    print(ANSI_RED);
		    print(c);
		}
	    }
	    if(compteur<(length(motATaper)-1))
		compteur = compteur +1;
	}
    }
    
    //si correct, ne rien changer, passer le  mot en texte vert quand on passe au suivant
    //si le caractère ne correspond pas, passer le mot en rouge, et si l'utilisateur passe au mot suivant, passer le texte au rouge
    
    void algorithm(){
	println(motATaper);
	while(on){
	    enableKeyTypedInConsole(on);
	}
    }
    
    //il va falloir définir le mot à taper en valeur globale, peut-être
}
