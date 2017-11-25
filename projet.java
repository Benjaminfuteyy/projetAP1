class projet extends Program {
    //variables globales
	class score {
		double resultat = 0.0;
		String nom = "";
	}
	score nouveauScore = new score();
    //les tableaux sont créés avec la fonction creerTableau, à partir d'un copier-coller des tables de http://o.bacquet.free.fr/db2.htm . Les retours à la lignes ont été enlevés à la main car je ne sais pas comment les gérer dans une String (erreur à la compilation: unclosed string literal).
	final String[] CP  = creerTableau("maison 	papa 	porte 	rue 	 avec 	deux 	terre 	  	été 	maman 	pipe 	pour 	table école 	jardin 	mal bébé 	carte 	cheminée 	livre 	nature rouge 	sucre 	tête 	vache 	 achat 	barbe 	classe 	feu 	lion matin 	revenir 	rive 	robe 	soir tuer 	vendredi 	vigne 	  	 branche 	brique 	chat 	facteur 	femme fermier 	homme 	jeudi 	lapin 	lui lundi 	mars 	moulin 	plante 	poire poste 	route 	soleil 	sur 	triste");
	final String[] CE1 = creerTableau("animal 	arbre 	arme 	aube 	autour avenir 	bouche 	brave 	chemin 	cheval culture 	devoir 	église 	enfant 	étude fête 	image 	louer 	mardi 	même mort 	moustache 	niche 	ordre 	plume poupée 	pouvoir 	propre 	retenir 	rire sage 	solide 	soupe 	  	 année 	article 	aviateur 	bonne 	café cage 	carton 	cave 	chaleur 	chambre chanteur 	charme 	costume 	couche croix 	devenir 	douleur 	droite 	écriture famille 	fille 	fortune 	foudre 	journal lecture 	libre 	ligne 	lit 	maladie marbre 	marche 	marque 	mère 	midi morne 	octobre 	os 	pauvre 	plus pomme 	premier 	proverbe 	rédaction 	relire remise 	retour 	riche 	rude 	sable salade 	suite 	tasse 	tige 	voiture acte 	artiste 	astre 	blé 	boire bois 	bon 	bord 	cabine 	chasse chasseur 	chemise 	chercher 	chevelure 	compagnon conduite 	confiture 	contenir 	convenir 	coucou coude 	courage 	dans 	élève 	entre étable 	établir 	fabrique 	faute 	fleuve fortement 	froid 	futur 	gros 	journée juste 	malade 	mariage 	matière 	mineur miracle 	moine 	monde 	musique 	neige  	orange 	pénible 	personne 	peur prince 	regarder 	reste 	réunir 	ronde ruche 	sec 	semaine 	sol 	sortie survenir 	tartine 	toucher 	vie 	visage visite 	visiteur 	voleur 	vue 	 agréable 	ardeur 	armoire 	balle 	belge bonjour 	bordure 	bouton 	cahier 	calcul chanson 	charbon 	charge 	chien 	cloche coin 	comme 	contre 	couleur 	coupe crime 	cuivre 	diable 	dictée 	directeur double 	ferme 	figure 	fromage 	grand jouer 	lait 	large 	lire 	liste main 	matinée 	meuble 	mouton 	nuage oncle 	parent 	père 	perle 	piste planche 	plumier 	poche 	prison 	produire rage 	ramage 	reine 	remarque 	reproche revoir 	revue 	roi 	rose 	sac salutation 	singe 	sorte 	statue 	tarte tous 	tout 	usage 	usine 	vapeur");
	final String[] CE2 = creerTableau("ange 	autre 	aveugle 	barque 	bec bille 	blancheur 	blanchir 	bleu 	borne brume 	cadre 	campagne 	canon 	chantre chapeau 	chaque 	charitable 	chef 	cochon contenu corde 	coupable 	créature 	demain dent 	dernier 	dessin 	donc 	dormir écharpe 	écurie 	entier 	entretenir 	épargne épine 	fauve 	fer 	finir 	fleur fois 	force 	fruit 	garde 	gauche idée 	invisible 	jaune 	joue 	juillet labeur 	lac 	larme 	lettre 	lièvre linge 	liquide 	loup 	lueur 	madame magique 	maître 	malin 	mercredi 	mode moderne 	mot 	moteur 	murmure 	murmurer nid 	nuisible 	odeur 	papier 	pardon parfait 	partie 	parvenir 	patte 	perche pluie 	pondre 	porteur 	poudre 	poule prendre 	proche 	profondeur 	punir 	rare rat 	redevenir 	regard 	rendre 	rien risque 	sabot 	sel 	signe 	singulier soldat 	sueur 	surprise 	tenue 	timide toile 	tombe 	tourner 	trois 	valeur vase 	vaste 	vente 	véritable 	victime victoire 	vide 	vif 	visible 	vite volume 	  	  	 abeille 	amateur 	amour 	âne 	ardoise avion 	avril 	bande 	barquette 	beau bien 	bise 	bondir 	botte 	boucle boule 	boutique 	bras 	brise 	canal canard 	carabine 	caverne 	chant 	chaudement chevalier 	clou 	combien 	commune 	compagne confrère 	corniche 	couper 	couverture 	crier décembre 	découverte 	dimanche 	dire 	division dix 	duc 	encre 	endormir 	entrée épreuve 	esclave 	estrade 	étalage 	faire fée 	feuille 	fleurette 	fondre 	formidable foule 	fumée 	fumer 	garçon 	gloire grammaire 	grenier 	gris 	haut 	herbe insecte 	janvier 	jardinier 	joie 	joli jouet 	joueur 	jour 	juin 	lampe laver 	légume 	lieu 	loin 	lune lunette 	machine 	magnifique 	marcher 	mauve mélange 	mémoire 	menu 	merle 	miel ministre 	minuit 	misérable 	moudre 	mouvoir multitude 	nation 	navire 	nez 	nom offre 	or 	orage 	oreille 	ouverture patrie 	patron 	petit 	pie 	pied place 	plage 	plumage 	poitrine 	politique poulet 	pratique 	preuve 	prime 	problème procureur 	promenade 	provenir 	récolte 	redoutable renard 	rencontre 	reprise 	rétablir 	rivière robuste 	rosée 	sabre 	sacoche 	saint samedi 	sauvage 	serviteur 	siège  sombre 	sortir 	sous 	soutenir 	spectateur suivre 	superbe 	tableau 	tablier 	terme tigre 	timbre 	tortue 	tour 	tranche trouble 	tulipe 	valise 	vendeur 	venir vent 	verdure 	verger 	vin 	vitre vitrine 	vivre 	voisin 	voisinage 	 action 	adroit 	âme 	aussi 	avant avertir 	avoir 	bal 	banc 	banque bassin 	bataille 	bazar 	blouse 	boue boulanger 	boulangerie 	cadavre 	chacun 	chapelle chocolat 	ciel 	clochette 	comble 	compliment conduire 	convenable 	corbeille 	coton 	coudre cour 	cousin 	couvrir 	cuisine 	dame date 	demande 	désagréable 	docteur 	doute douze 	durée 	eau 	écolier 	écrire encore 	engager 	énorme 	escalier 	farine fatigue 	favorable 	fenêtre 	fidèle 	fils fin 	foin 	forgeron 	forme 	fort fou 	genre 	gerbe 	grandir 	grave grive 	groupe 	hier 	hiver 	inconnu industrie 	inspecteur 	instituteur 	intervenir 	jeune jouir 	joujou 	laboureur 	laine 	leçon  limite 	lis 	long 	lys 	manger mari 	marquer 	matinal 	ménagerie 	menteur messe 	mois 	monstre 	motif 	mouvement multiple 	muraille 	naturellement 	noir 	nombre nord 	nuit 	outre 	ouvrage 	ouvrier page 	paille 	paire 	partir 	pâte pays 	peau 	perte 	peuple 	plaque plat 	plonger 	pointe 	politesse 	prairie pratiquer 	presque 	prévoir 	prière 	production protecteur 	pur 	quatre 	rame 	réduire régime 	relatif 	reprendre 	respiration 	roue ruelle 	sang 	savoir 	serviable 	seul si 	signature 	soulagement 	souvenir 	sport tache 	tirelire 	titre 	tordre 	train tribunal 	tricolore 	union 	utilité 	vendre vernir 	vieux 	violette 	voir 	voyageur affaiblir 	agent 	aile 	air 	armée bain 	balcon 	besogne 	billet 	blanc bonheur 	bouquet 	bourse 	brochure 	brusque bureau 	calculer 	camion 	capitaine 	car carnet 	charité 	chose 	cinq 	cirque commun 	compagnie 	comparer 	confondre 	contribuer coq 	corbeau 	corne 	course 	coutume croire 	cuire 	demi 	dépenser 	depuis destination 	devant 	dieu 	directement 	domestique douloureux 	doux 	échapper 	échelle 	éclat écluse 	encrier 	enfin 	ensuite 	entreprendre entrevoir 	esprit 	éternel 	étoile 	étrange fauvette 	faveur 	fontaine 	forge 	four fournir 	franc 	frère 	fuite 	gamin gardien 	gare 	garnir 	gibier 	grandeur gras 	grenouille 	heure 	ici 	indigne inscrire 	instrument 	jambe 	journalier 	juge jusque 	justement 	langue 	lever 	liberté ligue 	livrer 	locomotive 	lot 	lumière lutte 	mademoiselle 	mai 	mais 	mer merveille 	métier 	miette 	migrateur 	mine minute 	mirer 	moineau 	moment 	montagne montre 	mortel 	mouche 	mouchoir 	munir mur 	nappe 	noble 	nul 	objet obliger 	oiseau 	ombrage 	onde 	oui panier 	parcourir 	parole 	partout 	pendant pendre 	perdre 	périr 	pierre 	piété pitié 	plaisir 	poésie 	point 	poisson pompe 	postal 	pot 	pourquoi 	pourvoir produit 	proposition 	proprement 	puis 	puisque pupitre 	quelque 	racine 	raison 	rarement religion 	rentrer 	repas 	répondre 	réponse réunion 	revivre 	rocher 	sacré 	saison salle 	salon 	sapin 	satin 	série soie 	sot 	suave 	sud 	surtout tabac 	taille 	tante 	tenir 	toit tombeau 	tomber 	tram 	tramway 	traverser trésor 	tristement 	trou 	troupe 	unique utile 	vert 	vierge 	villa 	vitesse vivement 	volée 	wagon");
	final String[] CM1 = creerTableau("aboutir 	admirable 	âge 	aimer 	aliment allée 	ami 	amusement 	avaler 	avenue avouer 	bas 	basse 	bêche 	bénédiction berger  	boisson 	bonté 	bouteille cabane 	cacher 	cadeau 	caisse 	calme canif 	cantique 	capable 	cause 	chameau changement 	chaud 	chaumière 	choisir 	clairon comment 	continuer 	cortège 	côté 	cou couler 	coureur 	courir 	crise 	cultivateur curé 	dangereux 	découvrir 	demoiselle 	désireux désordre 	dévouement 	digne 	divin 	dos drapeau 	également 	électrique 	émouvoir 	enfermer envie 	épaule 	époque 	espoir 	étage étendue 	étudiant 	explication 	farouche 	faucheur fixe 	foire 	fonction 	garniture 	gelée glace 	gorge 	gratitude 	grue 	guide hirondelle 	huit 	inférieur 	infirme 	infirmier injure 	intime 	invitation 	jamais 	jardinage jeunesse 	jugement 	lécher 	lèvre 	lilas local 	loi 	marchand 	marchandise 	marché marteau 	méchant 	mélodie 	ménage 	ménager mentir 	menuisier 	merci 	mesure 	minuscule  misère 	modèle 	modeste 	mont 	monter morceau 	mordre 	mousse 	muscle 	musée net 	neuf 	note 	nouveau 	ornement ours 	ouvrir 	panache 	pantalon 	paquet parfaitement 	parfum 	parler 	part 	particulier passé 	pêcher 	peine 	pendule 	péniblement pensée 	perfection 	pièce 	plaie 	porc port 	possible 	poursuite 	poutre 	préparation prévenir 	prise 	prix 	prochain 	promeneur promesse 	quarante 	quoi 	raisin 	rapide rapidement 	récréation 	reculer 	réfléchir 	refuge relativement 	remettre 	renouveau 	représentation 	réserve retrouver 	rigole 	romain 	ronger 	rougir rustique 	sagement 	sauver 	secourir 	septembre servir 	s'évanouir 	silence 	simple 	soif soirée 	somme 	songer 	sonner 	sonore souper 	spectacle 	suivant 	sujet 	surface tapage 	tapis 	tel 	tendrement 	tente travail 	travailler 	travailleur 	trimestre 	vague veston 	viande 	voile 	volonté 	voltiger voyage 	yeux 	  	  	  acheter 	actif 	adieu 	agréablement 	aide ajouter 	aller 	approcher 	après 	aucun auteur 	averse 	avis 	bavarder 	bête beurre 	bientôt 	bonbon 	bougie 	brebis bref 	briser 	bruit 	brun 	brutal capital 	carré 	cartable 	centime 	cercle chagrin 	chaise 	chanter 	charmer 	chaume cher 	chute 	client 	clocher 	colorer comprendre 	consolation 	construction 	conte 	continuellement conversation 	copier 	coucher 	courageusement 	crépuscule cristal 	danger 	d'après 	début 	dedans démarche 	dépendre 	déplaire 	désigner 	détester détruire 	dette 	dévouer 	direction 	distribution diviser 	domicile 	dont 	drap 	droit duvet 	écouter 	encourir 	énergie 	enfance entendre 	équipage 	escalader 	estime 	étoffe étudier 	fabriquer 	fatiguer 	fendre 	fourneau fourniture 	fureur 	fusil 	géographie 	gosse grain 	gravement 	gravure 	griffe 	grossir guerre 	habitation 	haie 	hauteur 	heureusement horloge 	huile 	illustre 	ingratitude 	insigne instruction 	introduction 	inutile 	ivre 	joyeux jurer 	laitier 	largement 	lendemain 	lier lisse 	lorsque 	louange 	lourd 	lugubre luire 	manque 	mauvais 	mécanique 	médaille médecin 	mener 	métal 	meule 	militaire mille 	mobile 	modestie 	moindre 	morale moyen 	muet 	multicolore 	nager 	natal normal 	novembre 	numéro  	oie ombre 	onze 	osier 	pain 	palais pâle 	panorama 	parc 	parfois 	parquet pas 	pâtre 	paysage 	pelage 	pelouse personnage 	peuplier 	piano 	pinson 	plaine plaire 	plateau 	pleurer 	poignée 	pointu poli 	police 	pont 	portée 	poumon présent 	profondément 	propreté 	propriété 	prudence punition 	purifier 	ravin 	ravir 	rayon recherche 	recourir 	redire 	refrain 	régiment région 	réjouir 	remonter 	remplir 	renouvellement répartir 	repentir 	repos 	respecter 	respectueux rêve 	richesse 	riz 	rosier 	rouler ruban 	ruine 	sacrifice 	sagesse 	sauter savant 	savon 	secret 	seigneur 	semer sentir 	servante 	service 	sinistre 	situation sobre 	soigneusement 	solitude 	soulager 	soulier soupir 	sourd 	souris 	souvent 	souverain tailleur 	taire 	témoin 	tendre 	tendresse terreur 	terrible 	ton 	tonneau 	touffe tournée 	transformation 	trouver 	unir 	valet valoir 	veille 	ventre 	vertu 	violet visiter 	vivant 	vouloir 	  	 acheteur 	agile 	aimable 	aise 	amicalement angle 	apprendre 	arbitre 	arbuste 	architecte ardent 	argent 	arracher 	attaque 	auberge automobile 	autrefois 	autrement 	avantage 	aventure bagage 	battre 	beaucoup 	besoin 	bienfait bienfaiteur 	bloc 	bonsoir 	bosquet 	boucher broyer 	brusquement 	cadet 	celle-ci 	celui-ci cent 	cerisier 	ceux 	chapitre 	charbonnage chauffeur 	chaussée 	chaussure 	cigarette 	cinéma cinquante 	circulation 	classique 	complet 	congé considérable 	consoler 	constater 	content 	contraire contrée 	conviction 	côte 	coup 	couteau couvercle 	crainte 	craquement 	créateur 	cuisinière cultiver 	curieux 	danse 	déborder 	défenseur délicat 	délivrer 	dentelle 	dénudé 	désolation destinée 	détour 	diriger 	disposition 	distraction distrait 	douceur 	douter 	éblouir 	éclater économie 	élégant 	endroit 	environ 	épanouir état 	être 	étroit 	exposition 	exprimer facile 	faible 	faucher 	femelle 	finalement forger 	former 	friandise 	fuir 	galerie garder 	gazon 	généralement 	généreux 	grange graver 	gravir 	gronder 	hache 	heureux histoire 	honte 	indication 	infini 	instructif irriter 	jambon 	jaunir 	jeu 	justice lin 	maigre 	maintenir 	malheureux 	mare maternel 	mélanger 	mètre 	mettre 	moisson montrer 	monument 	neiger 	noisette 	nouvelle noyer 	obéir 	ordinaire 	paix 	papillon parapluie 	partager 	particulièrement 	peintre 	peinture planter 	position 	pourpre 	poursuivre 	pourtant préparatif 	présenter 	prétendre 	prier 	princesse principe 	probablement 	prospérité 	protection 	puissance puissant 	qualité 	quand 	ramener 	rapidité ravage 	rechercher 	redoubler 	redouter 	regagner relation 	renoncule 	rentrée 	réparer 	replier rester 	retentir 	riant 	rideau 	roulotte royaume 	ruiner 	sacrement 	sacrifier 	salir saluer 	sans 	santé 	satisfaction 	satisfait seau 	secouer 	s'envoler 	signal 	simplement six 	soigner 	soin 	soudain 	soulever soupirer 	souple 	source 	station 	subir subitement 	tas 	tempête 	temps 	tentation terrain 	tirer 	trente 	tricot 	tristesse trop 	troupeau 	urgent 	vallée 	veau vider 	vigoureux 	vol 	volet 	vôtre zèle abriter 	abuser 	actuellement 	admiration 	adresse agitation 	amusant 	animation 	approche 	arrivée aspirer 	atelier 	attendre 	attirer 	attribuer avance 	avoine 	ballon 	banane 	bandit bâton 	beauté 	bénir 	berceau 	bleuet bluet 	bonnet 	bouder 	bout 	brin buisson 	but 	calice 	camarade 	caractère casquette 	causer 	centaine 	centre 	cerise chance 	changer 	charmant 	château 	chéri choc 	clair 	clé 	clef 	clément coiffure 	combat 	commerce 	communion 	conclure conformément 	conseil 	construire 	contrarier 	coquet couloir 	courber 	couvert 	crayon 	culotte décider 	défaut 	défendre 	degré 	demeure démolir 	déplacer 	dérober 	désobéir 	détail deviner 	disposer 	distinction 	distraire 	distribuer docile 	doigt 	dominer 	donner 	doucement douzaine 	drôle 	durer 	écrit 	éducation empereur 	emplir 	enrichir 	enseigner 	épée équilibre 	équipe 	étendre 	éternité 	expirer facilement 	façon 	farce 	fermer 	feuillage février 	fier 	filet 	flacon 	flaque foi 	fossé 	fouet 	fragile 	franchement franchise 	fruitier 	gaz 	gendarme 	gens glissant 	griffer 	grotte 	hâte 	humain humeur 	humide 	important 	instant 	instruire intérieur 	introduire 	ivresse 	jeter 	juger labourer 	lamentable 	lent 	lentement 	libérer lien 	localité 	loger 	loisir 	luisant lutin 	magasin 	malgré 	manche 	manteau manuel 	marin 	ménagère 	mendiant 	milieu mission 	montant 	mou 	mourir 	nombreux nourriture 	office 	offrir 	onduler 	par parure 	passage 	pêche 	peupler 	pic pigeon 	piquer 	poirier 	pommier 	porte-plume poser 	pousser 	poussin 	préparer 	président prêtre 	principalement 	printemps 	prisonnier 	privation profit 	propriétaire 	quart 	question 	raconter ralentir 	raser 	recevoir 	reconduire 	recouvrir réellement 	règle 	régulier 	rejoindre 	religieux remercier 	résolution 	retourner 	reverdir 	rider rond 	rouleau 	royal 	ruisseau 	salaire satisfaire 	saule 	savourer 	scolaire 	sentier sept 	souffrir 	souriant 	sublime 	surgir surveiller 	suspendre 	tâche 	tarder 	température terminer 	terrestre 	toilette 	traitement 	tranquille transport 	végétal 	vénérer 	vérifier 	verre");
	final String[] CM2 = creerTableau("abondance 	activer 	activité 	administration 	afin agir 	agrément 	alerte 	allonger 	alors amuser 	an 	appartement 	appartenir 	arriver attentivement 	aurore 	autant 	autel 	autorité banquier 	barre 	bâtir 	blessure 	bonhomme bossu 	boucler 	bourgeon 	brumeux 	cache-cache cadran 	calendrier 	calmer 	caprice 	ceci cela 	centimètre 	chair 	charger 	chasser chausser 	chérir 	chiffre 	choix 	cimetière claquer 	coiffer 	colère 	colline 	composition conférence 	constituer 	convertir 	courageux 	courant couronne 	coussin 	couvent 	couver 	craindre creux 	cri 	cuir 	déchirer 	décorer décourager 	défense 	déjeuner 	délice 	déranger dernièrement 	dès 	descendre 	désir 	désoler dessiner 	dessous 	détourner 	dur 	échanger éléphant 	encourager 	enlever 	énormément 	enseignement épauler 	éprouver 	épuiser 	espace 	estimer étagère 	étonner 	étourdi 	étranger 	eux éviter 	excuse 	expédition 	face 	faiblesse faim 	fameux 	favoriser 	ferveur 	fêter fièvre 	fil 	file 	fillette 	flamme flot 	foie 	forestier 	forêt 	fougère frais 	fraise 	franchir 	froment 	gagner géant 	geler 	général 	germer 	geste giboulée 	gouvernement 	gouverner 	graine 	grandiose grand-mère 	grappe 	grès 	habit 	île imagination 	imiter 	imperméable 	imprudence 	imprudent incendie 	indispensable 	inerte 	infiniment 	inquiétude inspirer 	intelligence 	joindre 	joyeusement 	léger lequel 	leur 	lisière 	longueur 	lui-même maintenant 	malheur 	malheureusement 	manifester 	marier marquis 	masse 	massif 	mélodieux 	mensonge mien 	mieux 	monotone 	moquer 	moyenne ni 	obscurité 	observation 	obtenir 	océan officier 	outil 	parti 	passer 	pavé péché 	pêcheur 	peindre 	pension 	période peser 	pétale 	pieux 	placer 	pleuvoir plier 	poil 	pompier 	préserver 	primaire proclamer 	procurer 	prodigieux 	profiter 	promener proposer 	protéger 	provision 	prudent 	radieux ranimer 	récolter 	refroidir 	régaler 	régler remplacer 	remuer 	répéter 	représenter 	respirer retard 	retomber 	revêtir 	rôle 	roux sale 	seconde 	selon 	semblable 	sergent sérieux 	serviette 	seulement 	sève 	sien signer 	sitôt 	situer 	solitaire 	son sou 	souffrance 	studieux 	stupéfaction 	suprême surprendre 	tambour 	tard 	téléphone 	témoigner terrier 	tiède 	tôt 	trace 	transporter très 	troubler 	tuile 	vacances 	vélo velouté 	verser 	vice 	vilain 	violence violent 	voyager 	  	  	  aborder 	accident 	accorder 	achever 	admirer adorer 	adoucir 	adversaire 	affaire 	affiche agrémenter 	aiguille 	allumette 	amener 	amical anglais 	annonce 	apostolique 	apôtre 	application arrière 	art 	attentif 	attention 	aubépine aujourd'hui 	autoriser 	balancer 	bâtiment 	bienheureux bijou 	blond 	bouger 	bourdonnement 	bravo broder 	brouter 	canne 	cas 	céleste champ 	chapelet 	chauffage 	chauffer 	chèvre chiffon 	clairière 	clarté 	climat 	clouer collection 	colonel 	commande 	commencement 	compliquer confiance 	confier 	congrès 	consentement 	conserver contenter 	coquille 	cordialement 	correction 	court danser 	débiter 	debout 	déclarer 	défaire délicieux 	demander 	déposer 	dessert 	détacher déterminer 	deuil 	deuxième 	dévorer 	différent diminuer 	dîner 	dispenser 	disputer 	dizaine doubler 	durant 	éclair 	éclore 	écouler effort 	égarer 	élargir 	électricité 	émerveiller emporter 	énergique 	enfoncer 	engloutir 	ensemble entonner 	envier 	épais 	épouser 	époux estomac 	étaler 	étincelle 	exclamation 	exemple expliquer 	extérieur 	fabrication 	facilité 	faciliter fatal 	ferrer 	ficelle 	figurer 	fléau flocon 	fond 	fourrure 	foyer 	frémir front 	furieux 	grâce 	grille 	haine héroïque 	honteux 	humble 	illuminer 	immobile indiquer 	informer 	intelligent 	intention 	inviter invoquer 	isoler 	ivoire 	jadis 	kilomètre là 	las 	légèrement 	lenteur 	litière longer 	manier 	manière 	manquer 	marchander mécontent 	méditer 	meilleur 	mélancolique 	membre menton 	merveilleusement 	mignon 	mince 	moqueur museau 	naissance 	noix 	nommer 	nu nullement 	oranger 	organiser 	orgue 	orphelin paisible 	pardonner 	paroisse 	participer 	patin patronage 	payer 	pencher 	pénitence 	percher permettre 	personnel 	perspective 	pétrir 	plancher pleur 	poireau 	porter 	portière 	portrait poteau 	préau 	préférence 	présence 	programmepropos 	prouver 	quatrième 	quel 	race raide 	rameau 	réalité 	réconforter 	refaire réfectoire 	refermer 	refuser 	règne 	régulièrement remarquer 	remède 	rencontrer 	renverser 	reprocher résoudre 	retraite 	rigoureux 	risquer 	rompre roseau 	sanglot 	saut 	second 	s'écrier séjour 	sembler 	s'enfuir 	sentiment 	sérieusement serrure 	seuil 	sévir 	siècle 	signifier sort 	sourire 	succès 	supérieur 	talent tant 	teinte 	thé 	toujours 	tourbillon transformer 	troisième 	tromper 	trouer 	utiliser varier 	venger 	vérité 	vicaire 	voler abondant 	absolument 	acharner 	actuel 	affection affreux 	aider 	allumer 	ancien 	apparence apparition 	appel 	araignée 	armer 	arroser assurer 	attachement 	attaquer 	auprès 	aussitôt autrui 	avancer 	aviser 	baguette 	bétail bienvenue 	boiteux 	bond 	border 	butiner camp 	carotte 	carrière 	casser 	cérémonie chêne 	chez 	cité 	coffre 	coffret combler 	commencer 	consacrer 	consulter 	cordonnier corriger 	couture 	creuser 	crever 	curiosité débarquer 	déboucher 	décéder 	décharger 	découper décrire 	dégager 	dehors 	déménager 	demeurer départ 	désastre 	description 	dessus 	discuter disparition 	duquel 	échantillon 	éclatant 	économiser effacer 	élever 	embellir 	embrasser 	émotion encadrer 	enfouir 	enterrer 	entièrement 	entrer épouvantable 	erreur 	espérance 	étang 	évangile éveiller 	exactement 	exactitude 	expédier 	extrémité flotter 	forcer 	fouetter 	frapper 	frontière gant 	garantir 	gazouillement 	gentil 	giroflée glisser 	gracieux 	grippe 	guérison 	hélas hêtre 	honneur 	honorer 	humidité 	hurler idéal 	ignorer 	implorer 	imprimer 	incliner industriel 	inquiet 	interdire 	invention 	képi là-bas 	lanterne 	limiter 	lointain 	longuement lutter 	majesté 	mélancolie 	mériter 	meunier monsieur 	musicien 	niveau 	non 	obéissant obstacle 	odorant 	opérer 	ordinairement 	orner ouate 	paradis 	parce que 	paresse 	passant passion 	plaindre 	plainte 	plaintif 	plan planer 	plein 	plomb 	plutôt 	potager poussière 	précieux 	précipiter 	presser 	prêt printanier 	priver 	proie 	prolonger 	prononcer provoquer 	quatorze 	quinze 	quitter 	rang rassurer 	réaliser 	réclamer 	récompense 	reflet réformer 	réfugier 	regret 	remarquable 	renoncer renseignement 	reporter 	résister 	respect 	retirer rossignol 	sain 	savoureux 	sévèrement 	signaler silencieusement 	silencieux 	sincère 	sinon 	sommet sonnette 	souhait 	soumettre 	spacieux 	spécialement succéder 	surmonter 	sursauter 	trancher 	tranquillement trembler 	tricoter 	trompette 	vaillant 	vaincre veiller 	veine 	vigueur 	voiler 	vraiment abattre 	absent 	absolu 	acclamer 	accord accuser 	acier 	adopter 	adresser 	aérer affectueux 	allure 	alouette 	animer 	apporter après-midi 	arrêt 	arrondissement 	assidu 	assister aumône 	auquel 	automne 	azuré 	baisser barrière 	betterave 	bière 	boueux 	brindille brouillard 	brut 	carreau 	cendre 	cerf certain 	cesser 	circuler 	colonial 	comparaison complètement 	composer 	constant 	continuel 	cordial corps 	corridor 	cours 	craquer 	déjà désirer 	destiner 	dictionnaire 	divers 	dompteur écarter 	éclaircir 	éclairer 	édifier 	effet élancer 	emplacement 	enchanté 	ennemi 	entrain enveloppe 	envoyer 	espérer 	étirer 	étonnement expérience 	exposer 	exprès 	extraire 	fait falloir 	fauteuil 	féroce 	fièrement 	fixer flamand 	flèche 	fourmi 	fraîcheur 	frayeur froisser 	frotter 	gâteau 	gémir 	givre gourmand 	goût 	graisse 	grimper 	grossier guérir 	habiter 	habitude 	hameau 	honorableignorant 	illustrer 	imaginer 	immédiatement 	importance imposant 	imprévu 	influence 	ingrat 	interroger laborieux 	laid 	lambeau 	langage 	limpide lors 	loyal 	lumineux 	 	 marguerite 	matériel 	mendier 	merveilleux 	mesurer millier 	million 	miroir 	moitié 	mystérieux naturel 	négliger 	notaire 	observer 	occupation occuper 	ordonner 	pâlir 	parages 	parfumer pâture 	paysan 	pénétrer 	péril 	permission persuader 	peu 	pin 	plusieurs 	prêcher près 	professeur 	profond 	quoique 	ravissant rejeter 	relever 	remerciement 	remporter 	renouveler repasser 	reposer 	réserver 	résistance 	résultat réveil 	rhume 	ronce 	rusé 	s'agenouiller saisir 	salut 	sautiller 	sécurité 	seize sensible 	séparer 	serrer 	sillon 	sirène société 	souffle 	splendeur 	stationner 	tantôt taquiner 	tinter 	tiroir 	tourment 	tournant treize 	triomphe 	tronc 	véhicule 	vêtement");
	//les accents et caractères spéciaux sont un probleme (pas reconnus comme une lettre); à voir si cela pose un problème quand on tapera les mots dans le terminal. Les mots contenant 'œ' ont été enlevé pour raison pédagogique (embêtant à taper). Solution possible pour 'œ': l'utilisateur tape "oe" et l'on corrige par 'œ' automatiquement.
	void afficherTableaux(String[] tableau){
		for(int i = 0; i<length(tableau); i++)
			println(tableau[i] + '|');
	}

	void testCreerTableau(){
		assertArrayEquals(new String[]{"branche","brique","chat","facteur","femme","fermier","homme","jeudi","lapin","lui","lundi","mars","moulin","plante","poire"},creerTableau("branche 	brique 	chat 	facteur 	femme  fermier 	homme 	jeudi 	lapin 	lui lundi 	mars 	moulin 	plante 	poire"));
	}

	String[] creerTableau(String mots){ //transforme un String contenant une série de mots séparés par un ou plusieurs espaces ou '\t' en un tableau de Strings
	int nbMots = 1;
	int caseCourante= 0;
	boolean flagMot = true;
	String stringPropre = "";	
	for(int i=0; i<length(mots); i++){
		if(charAt(mots,i)>='a' && charAt(mots,i)<='z' || charAt(mots,i)=='é' || charAt(mots,i)=='è' || charAt(mots,i) == 'ê' || charAt(mots,i) == '-'){
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

	String menus(){
		String saisieUtilisateur = "1";
		do{
			//clearScreen();
			println("Voulez-vous..");
			println('\t' + "Jouer ? Tapez 1");
			println('\t' + "Afficher les listes de mots ? Tapez 2");
			println('\t' + "Afficher les  meilleurs résutats ? Tapez 3");
			saisieUtilisateur = readString();
		} while(!equals("1",saisieUtilisateur)^!equals("2",saisieUtilisateur)^!equals("3",saisieUtilisateur));
		return saisieUtilisateur;
	}

	void testSelectionNiveau(){
		//à voir comment on test une fonction sans parametres
	}

	String[] selectionNiveau(){ 
		String saisieUtilisateur = "0";
		do{
			//clearScreen();
			println("En quelle classe êtes-vous ?");
			println('\t' + "CP : Tapez 0");
			println('\t' + "CE1: Tapez 1");
			println('\t' + "CE2: Tapez 2");
			println('\t' + "CM1: Tapez 3");
			println('\t' + "CM2: Tapez 4");
			println('\t' + "Appuyez ensuite sur [Entrée]");
			saisieUtilisateur = readString();
			//println("Vous avez entrez " + saisieUtilisateur + ". Cette valeur n'a pas été reconnue. Veuillez reessayer.");
		} while(!equals("1",saisieUtilisateur)^!equals("2",saisieUtilisateur)^!equals("3",saisieUtilisateur)^!equals("4",saisieUtilisateur)^!equals("0",saisieUtilisateur)); 
		if(saisieUtilisateur == "4")
			return CM2;
		if(saisieUtilisateur == "0")
			return CP;
		if(saisieUtilisateur == "2")
			return CE2;
		if(saisieUtilisateur == "3")
			return CM1;
		return CP;
		//option pour voir les meilleurs résultats
		//option pour voir les tableaux
		//voir: comment ne pas afficher ce qui est tapé dans le buffer
		//crash quand on ne rentre rien
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

	void keyTypedInConsole(char c){
		if(c=='\n')
			//clearScreen();
		print(c);

	}


	//jeu
	//on affiche un mot tiré au hasard
	//le joueur entre ses caractères un par un, affichage et vérification des caractères un par un (si caractère bon, texte vert, si faux texte rouge par ex), 
	//si il entre [retour arrière], clear le terminal et tout reafficher avec le dernier caractère afficher supprimé, 
	//la boucle se finit quand il appuie sur [Entrée], et on passe alors au mot suivant
	//vérifiation si le mot est correct, si oui nbMotsCorrects +1
	//une fois le temps écoulé on lui demande d'entrer son nom
	//on crée une nouvelle classe de type score avec son nom et son résultat
	//comment stocker les scores ?
	//on affiche les meilleurs résultats
	void algorithm(){
		boolean temps = false; //à enlever
		int nbMotsCorrects = 0;
		String optionMenuChoisie = menus();
		if(equals(optionMenuChoisie,"1")){
			String[] tableauChoisi = selectionNiveau();
			//clearScreen();
			//utiliser la fonction void enableKeyTypedInConsole(boolean on) pour activer la possibilité de capturer les touches manipulées par l'utilisateur et void keyTypedInConsole(char c) pour être notifié des touches manipulées. Dès que l'utilisateur appuiera sur une touche, la méthode 'keyTypedInConsole' sera automatiquement appellée avec en paramètre la valeur de la touche manipulée.
			while(temps){ //à voir comment on gère un chronomètre
				
				println(motAuHasard(tableauChoisi));
				while(true){//tant que l'utilisateur n'a pas saisi [Entrée]
					enableKeyTypedInConsole(true); //appel la fonction keyTypedInConsole
					if(verification(lectureClavier()))
						nbMotsCorrects = nbMotsCorrects + 1;

				}
			}
			
			calculAffichageResultat(nbMotsCorrects);
		}
	}
			//utiliser la fonction void reset() pour reinitialiser la console
			//voir aussi void clearScreen()
			//utiliser void background(String color) et void text(String color) pour définir la couleur d'affichage du texte et de l'arrière plan
			//String color est ANSI_RED par exemple

}