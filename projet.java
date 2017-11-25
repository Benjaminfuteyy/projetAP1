class projet extends Program {
    
    //variables globales
	class score {
		double resultat = 0.0;
		String nom = "";
	}
	score nouveauScore = new score();
    //les tableaux sont créés avec la fonction creerTableau, à partir d'un copier-coller des tables de http://o.bacquet.free.fr/db2.htm . Les retours à la lignes ont été enlevés à la main car je ne sais pas comment les gérer dans une String (erreur à la compilation: unclosed string literal).
	final String[] CP = creerTableau("maison 	papa 	porte 	rue 	 avec 	deux 	terre 	  	été 	maman 	pipe 	pour 	table école 	jardin 	mal bébé 	carte 	cheminée 	livre 	nature rouge 	sucre 	tête 	vache 	 achat 	barbe 	classe 	feu 	lion matin 	revenir 	rive 	robe 	soir tuer 	vendredi 	vigne 	  	 branche 	brique 	chat 	facteur 	femme fermier 	homme 	jeudi 	lapin 	lui lundi 	mars 	moulin 	plante 	poire poste 	route 	soleil 	sur 	triste");
	final String[] CE1 = creerTableau("animal 	arbre 	arme 	aube 	autour avenir 	bouche 	brave 	chemin 	cheval culture 	devoir 	église 	enfant 	étude fête 	image 	louer 	mardi 	même mort 	moustache 	niche 	ordre 	plume poupée 	pouvoir 	propre 	retenir 	rire sage 	solide 	soupe 	  	 année 	article 	aviateur 	bonne 	café cage 	carton 	cave 	chaleur 	chambre chanteur 	charme 	costume 	couche croix 	devenir 	douleur 	droite 	écriture famille 	fille 	fortune 	foudre 	journal lecture 	libre 	ligne 	lit 	maladie marbre 	marche 	marque 	mère 	midi morne 	octobre 	os 	pauvre 	plus pomme 	premier 	proverbe 	rédaction 	relire remise 	retour 	riche 	rude 	sable salade 	suite 	tasse 	tige 	voiture acte 	artiste 	astre 	blé 	boire bois 	bon 	bord 	cabine 	chasse chasseur 	chemise 	chercher 	chevelure 	compagnon conduite 	confiture 	contenir 	convenir 	coucou coude 	courage 	dans 	élève 	entre étable 	établir 	fabrique 	faute 	fleuve fortement 	froid 	futur 	gros 	journée juste 	malade 	mariage 	matière 	mineur miracle 	moine 	monde 	musique 	neige  	orange 	pénible 	personne 	peur prince 	regarder 	reste 	réunir 	ronde ruche 	sec 	semaine 	sol 	sortie survenir 	tartine 	toucher 	vie 	visage visite 	visiteur 	voleur 	vue 	 agréable 	ardeur 	armoire 	balle 	belge bonjour 	bordure 	bouton 	cahier 	calcul chanson 	charbon 	charge 	chien 	cloche coin 	comme 	contre 	couleur 	coupe crime 	cuivre 	diable 	dictée 	directeur double 	ferme 	figure 	fromage 	grand jouer 	lait 	large 	lire 	liste main 	matinée 	meuble 	mouton 	nuage oncle 	parent 	père 	perle 	piste planche 	plumier 	poche 	prison 	produire rage 	ramage 	reine 	remarque 	reproche revoir 	revue 	roi 	rose 	sac salutation 	singe 	sorte 	statue 	tarte tous 	tout 	usage 	usine 	vapeur");
	final String[] CE2 = creerTableau("");
	final String[] CM1 = creerTableau("");
	final String[] CM2 = creerTableau("");
	//les accents et caractères spéciaux sont un probleme (pas reconnus comme une lettre); à voir si cela pose un problème quand on tapera les mots dans le terminal. Les mots contenant 'œ' ont été enlevé pour raison pédagogique (embêtant à taper). Solution possible pour 'œ': l'utilisateur tape "oe" et l'on corrige par 'œ' automatiquement.
	void afficherTableaux(String[] tableau){
		for(int i = 0; i<length(tableau); i++)
			println(tableau[i] + '|');
	}

    void testCreerTableau(){
		assertArrayEquals(new String[]{"branche","brique","chat","facteur","femme","fermier","homme","jeudi","lapin","lui","lundi","mars","moulin","plante","poire"},creerTableau("branche 	brique 	chat 	facteur 	femme  fermier 	homme 	jeudi 	lapin 	lui lundi 	mars 	moulin 	plante 	poire"));
	}

	String[] creerTableau(String mots){ //transforme un String contenant une série de mots en un tableau de Strings
		int nbMots = 1;
		int caseCourante= 0;
		boolean flagMot = true;
		String stringPropre = "";	
		for(int i=0; i<length(mots); i++){
			if(charAt(mots,i)>='a' && charAt(mots,i)<='z' || charAt(mots,i)=='é' || charAt(mots,i)=='è' || charAt(mots,i) == 'ê'){
				stringPropre = stringPropre + charAt(mots,i);
				flagMot = true;
			}
			else if(flagMot){
				stringPropre = stringPropre + ' ';
				flagMot = false;
				nbMots = nbMots +1;	
			}	
				//si le caractère est une lettre, le rajouter, drapeau mot = vrai
				//si le caractère n'est pas une lettre et si le drapeau mot est vrai, rajouter un espace, passer le drapeau à faux
		}
		String[] tableau = new String[nbMots]; //initialisation du tableau
		for(int i =0; i<nbMots; i++)
			tableau[i] = "";
		for(int i=0; i<length(stringPropre); i++){ //remplire le tableau avec les mots
			if(charAt(stringPropre,i)==' ')
				caseCourante = caseCourante + 1;
			else
			tableau[caseCourante]=tableau[caseCourante]+charAt(stringPropre,i);
		}
		return tableau;
	}

	void testSelectionNiveau(){
		//à voir comment on test une fonction sans parametres
	}

	String[] selectionNiveau(){ 
		println("En quelle classe êtes-vous ?");
		println('\t' + "CE1: Tapez 1");
		println('\t' + "CE2: Tapez 2");
		println('\t' + "CM1: Tapez 3");
		println('\t' + "CM2: Tapez 4");
		return CP;
		//il est possible de bidouiller le terminal pour ne pas avoir à appuyer sur [Entrée] pour envoyer l'information, à voir. (voir: man stty)
	}

	void testMotAuHasard(){
		//à voir comment on test une fonction qui sort quelque chose au hasard
		//tableau de 1 mot, il sort forcement se mot-là.
	}

	String motAuHasard(String[] tableauDeMots){
		return "rien";
	}

	void testCalculAffichageResultat(){

	}

	void calculAffichageResultat(int nbMotsCorrects){

	}

	String toString (score nouveauScore){
		return nouveauScore.nom + " a fait un resultat de " + nouveauScore.resultat;
	}

	char lectureClavier(){
		return ' ';
	}

	boolean verification(char c){
		return false;
	}

	//jeu
	//on affiche un mot tiré au hasard
	//le joueur entre ses caractères un par un, vérification des caractères, boucle se finit quand il appuie sur [Entrée]
	//vérifiation si le mot est correct, si oui nbMotsCorrects +1

	//comment stocker les scores ?
	void algorithm(){
		boolean temps = false; //à enlever
		int nbMotsCorrects = 0;
		String[] tableauChoisi = selectionNiveau();
		//utiliser la fonction void enableKeyTypedInConsole(boolean on) pour activer la possibilité de capturer les touches manipulées par l'utilisateur et void keyTypedInConsole(char c) pour être notifié des touches manipulées. Dès que l'utilisateur appuiera sur une touche, la méthode 'keyTypedInConsole' sera automatiquement appellée avec en paramètre la valeur de la touche manipulée.
		while(temps){ //à voir comment on gère un chronomètre
			println(motAuHasard(tableauChoisi));
			if(verification(lectureClavier()))
				nbMotsCorrects = nbMotsCorrects + 1;

		}
		calculAffichageResultat(nbMotsCorrects);
		//utiliser la fonction void reset() pour reinitialiser la console
		//voir aussi void clearScreen()
		//utiliser void background(String color) et void text(String color) pour définir la couleur d'affichage du texte et de l'arrière plan
		//String color est ANSI_RED par exemple

	}	
}
