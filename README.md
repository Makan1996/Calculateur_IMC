# Calculateur_IMC
Cet algorithme en Java est une application qui permet de calculer l'IMC (Indice de Masse Corporelle) d'un patient à partir des données stockées dans une base de données MySQL


1- CLASSE IMC

La classe IMC représente un patient avec trois attributs :
- nom (String) : le nom du patient.
- taille (int) la taille du patient en cm.
- poids (int): le poids du patient en kg.

Elle possède :
- Un constructeur IMC (String nom, int taille, int poids) qui initialise les attributs.
- Une méthode de calculIMC()qui calcule l'IMC en utilisant la formule : IMC = (10000 * poids)/(taille * taille)  (La multiplication par 10000 est due au fait que la taille est en (cm).
- Une méthoe analyseIMC() qui retoune une interpretation selon les catégories standard (anorexie, maigreur, corpulence normale, surpids, obésité).


2- CLASSE PRINCIPALE

Cette classe contient une méthoe main() qui : 
2.1- Se connecte à la base de données de la table IMC qui contient des patients à partir des données MySQL (en local sur localhost:3306 avec la base donneespatient.
2.2- Récupère les données de latable IMC qui contient des patients avec leurs noms, taille et poids.
2.3- Affiche les données récupérées.
2.4- Créer des objets IMC pour chaque patient à partir des données SQL
2.5- Affiche l'objet IMC correspondant à chaque patient.

3- Fonctionnement Global

3.1- L'application se connecte à une base de données MySQL.
3.2- Elle extrait la liste des patients enregistrée.
3.3- Elle créer un ojet IMC pour chaque patient et affiche ses informations. 
3.4- Chaque objet IMC PEUT ensuite calculer et analyser l'IMC du patient.

4- Erreurs possibles :

4.1- Si la connexion à la base échoue (ClassNotFoundException ou SQLException), un message d'erreur est affiché.
4.2- La classe IMC utilise un cast vers int dans calculIMC(), ce qui pourrait arrondir la valeur et perdre en précision.


5- En résumé : 

Ce programme Java récupère des données de aptients depuis une base MySQL, créer des objets pour eux, et permet de claculer et d'interpréter leur indice de masse corporelle.
