# Contexte

Bienvenue ! Vous êtes développeur.se pour un éditeur de système d'information hospitalier au sein de la squad Diagnostic.

Votre squad travaille en méthodologie agile SCRUM et comprend des développeurs, une testeuse, un Tech Lead, un Scrum Master et une Product Owner.

Cette fonctionnalité constituera le périmètre principal de votre squad à l'avenir. Le code que vous produirez sera relu et testé avant mise en production.

# Story

Mon hôpital du futur dispose d'une cabine automatisée d'auto-diagnostic. Le capteur de la cabine donne une information synthétique qu'on appelle "index de santé" du patient.

L'index de santé est une valeur interprétable qui permet d'établir la pathologie du patient :

- Un index multiple de 3 indique un problème cardiaque.
- Un index multiple de 5 indique une fracture.
- Un index multiple de 3 et de 5 indique ces deux pathologies à la fois.

En fonction de la pathologie, la cabine doit rediriger le patient vers l'unité médicale adaptée au sein de l'hôpital :

- On traite les problèmes cardiaques en cardiologie.
- On traite les fractures en traumatologie.

Si le patient a plusieurs pathologies, il devra passer par chacune des unités médicales concernées (l'ordre n'a pas d'importance).

**Exemples :**

- Pour l'index de santé 33, le système doit renvoyer **Cardiologie**.
- Pour l'index de santé 55, le système doit renvoyer **Traumatologie**.
- Pour l'index de santé 15, le système doit renvoyer **Cardiologie, Traumatologie**.

# Précisions techniques

Notre squad interopérabilité a déjà développé le nécessaire pour communiquer avec le capteur et l'écran. Il ne nous reste plus qu'à développer le traitement des données numériques du capteur et à renvoyer une chaîne de caractères pour affichage par l'écran.

Nous pouvons utiliser des dépendances externes.
